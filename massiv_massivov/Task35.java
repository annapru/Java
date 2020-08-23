package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task35 {

	public static void main(String[] args) {

		int[][] mas = new int[4][4];

		Random rand = new Random();
		int i, j;
		System.out.println("матрица:");

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		int max = mas[0][0];
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
				;
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
				;
			}
		}
		System.out.println("все нечетные элементы заменели на максимальный элемент матрицы");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
