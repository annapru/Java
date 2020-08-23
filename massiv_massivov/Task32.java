package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task32 {

	public static void main(String[] args) {
		int n = 4;
		int[][] mas = new int[n][n];

		Random rand = new Random();
		int i, j;
		System.out.println("строки матрицы по возрастанию :");

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}

		int b;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				for (int k = j + 1; k < mas.length; k++) {
					if (mas[i][j] > mas[i][k]) {
						b = mas[i][j];
						mas[i][j] = mas[i][k];
						mas[i][k] = b;
					}
				}
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

		b = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				for (int k = j + 1; k < mas.length; k++) {
					if (mas[i][j] < mas[i][k]) {
						b = mas[i][j];
						mas[i][j] = mas[i][k];
						mas[i][k] = b;
					}
				}
			}
		}
		System.out.println("строки матрицы по убыванию");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
