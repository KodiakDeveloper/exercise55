package bookExercises;

import javax.swing.JOptionPane;

public class Ex55 {

	public static void main(String[] args) {

		int[][] numbers = new int[6][2];

		int line = 6, column = 2;

		int userInput1, prod = 0;

		String userAnswer;

		do {

			for (int i = 0; i < line; i++) {

				for (int j = 0; j < column; j++) {

					userInput1 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Input" + "\nLine: " + i + "\nColumn: " + j));

					numbers[i][j] = userInput1;

				}

			}

			for (int i = 0; i < line; i++) {

				prod = 1;

				for (int j = 0; j < column; j++) {

					prod *= numbers[i][j];

				}

				JOptionPane.showMessageDialog(null, "Line " + i + ": " + Math.round(Math.sqrt(prod)));

			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
