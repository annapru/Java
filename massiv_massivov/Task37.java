package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task37 {

	public static void main(String[] args) {

		int[][] mas = new int[][] { { 13, 9, 78, 46 }, { 12, 75, 15, 89 }, { 45, 63, 57, 14 } };
		int i, j, first, second;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

		Random rand = new Random();
		first = rand.nextInt(3);
		second = rand.nextInt(3);

		for (j = 0; j < 4; j++) {
			int temp = mas[first][j];
			mas[first][j] = mas[second][j];
			mas[second][j] = temp;
		}

		System.out.println("поменяли местами две строки случайным образом");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
