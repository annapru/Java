package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task28 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		Random rand = new Random();
		int i, j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		System.out.println("матрица:");
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

		int index = 0, sum = 0, k = 0;
		for (j = 0; j < mas.length; j++) {
			sum = 0;
			for (i = 0; i < mas.length; i++) {
				sum = sum + mas[i][j];
			}
			if (j == 0) {
				k = sum;
			}
			if (j > 0 & sum > k) {
				k = sum;
				index = j;
			}
			System.out.println("сумма элементов " + (j + 1) + " столбца " + sum);
		}
		System.out.println("сумма элементов " + (index + 1) + " столбца содержит максмальную сумму");
	}
}
