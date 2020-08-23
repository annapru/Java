package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {

		int[][] mas = new int[2][3];

		Random rand = new Random();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
