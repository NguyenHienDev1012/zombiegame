package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class WriteFileHighScore {
	private ArrayList<HightScore> arrHightScore;
	
	public WriteFileHighScore() {
		arrHightScore = new ArrayList<HightScore>();
		
		innitArrHightScore("src/hightscore/HightScore.txt");
	}
	
	public void innitArrHightScore(String path) {
		try {
			FileReader file = new FileReader(path);
			BufferedReader input = new BufferedReader(file);
			String line;
			while ((line = input.readLine()) != null) {
				String str[] = line.split(":");
				String name = str[0];
				int score = Integer.parseInt(str[1]);
				HightScore hightScore = new HightScore(name, score);
				arrHightScore.add(hightScore);
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveScore() {
		System.out.println();
		if (arrHightScore.size() == 0 || arrHightScore.size() < 10) {
			String name = JOptionPane.showInputDialog("Please input Your Name");
			HightScore newScore = new HightScore(name, Integer.parseInt(DisplayScore.getScore()));
			arrHightScore.add(newScore);
		} else if (Integer.parseInt(DisplayScore.getScore()) > arrHightScore.get(arrHightScore.size() - 1).getScore()) {
			String name = JOptionPane.showInputDialog("Please input Your Name");
			HightScore newScore = new HightScore(name, Integer.parseInt(DisplayScore.getScore()));
			arrHightScore.add(newScore);
		}
		Collections.sort(arrHightScore, new Comparator<HightScore>() {

			@Override
			public int compare(HightScore score1, HightScore score2) {
				if (score1.getScore() < score2.getScore()) {
					return 1;
				} else {
					if (score1.getScore() == score2.getScore()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});

		if (arrHightScore.size() > 10) {
			arrHightScore.remove(arrHightScore.size() - 1);
		}

		try {
			FileOutputStream fileOutput = new FileOutputStream("src/hightscore/HightScore.txt");
			for (int i = 0; i < arrHightScore.size(); i++) {
				String content = arrHightScore.get(i).getName() + ":" + arrHightScore.get(i).getScore() + "\n";
				fileOutput.write(content.getBytes());
			}
			fileOutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
