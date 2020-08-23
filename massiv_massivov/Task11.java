package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {

		int n = 3,m=4;
		int[][] mas = new int[m][n];

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

		System.out.println(
				"первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее");

		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			if (i % 2 == 0) {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(mas[i][j] + " ");
				}
			} else {
				for (int j = 0; j < n; j++) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
	}

}
