package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {

		int n = 3;
		int[][] mas = new int[4][n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < n; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("3-я строка матрицы.");
		int k = 2, p = 2;

		for (int j = 0; j < n; j++) {
			System.out.print(mas[k][j] + " ");
		}
		System.out.println();

		System.out.println("3-й столбец матрицы.");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][p] + " ");
			System.out.println();
		}
	}

}
