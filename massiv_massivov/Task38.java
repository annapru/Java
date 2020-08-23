package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task38 {

	public static void main(String[] args) {

		int[][] mas = new int[4][4];
		int[][] mas2 = new int[4][4];
		int[][] mas3 = new int[4][4];
		Random rand = new Random();
		int i, j;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				mas[i][j] = rand.nextInt(100);
				mas2[i][j] = rand.nextInt(100);
			}
		}

		System.out.println("первая матрица :");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("вторая матрица :");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {

				System.out.printf("%4d", mas2[i][j]);
			}
			System.out.println();
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				mas3[i][j] = mas[i][j] + mas2[i][j];
			}
		}
		System.out.println("сумма двух матриц :");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {

				System.out.printf("%4d", mas3[i][j]);
			}
			System.out.println();
		}

	}

}
