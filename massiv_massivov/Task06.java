package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];

		Random rand = new Random();
		int i, j;
		System.out.println("матрица:");

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("нечетные столбцы, у которых первый элемент больше последнего");

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				if ((j % 2 == 1) & (mas[0][j] > mas[mas.length - 1][j])) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
