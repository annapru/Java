package by.home.les7.massiv_massivov;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		int[][] mas = new int[][] { { 13, 9, 78, 46 }, { 12, 75, 15, 89 }, { 45, 63, 57, 14 } };
		int i, j, first, second;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("введите номера столбцов от 1 до 4");
		first = sc.nextInt() - 1;
		second = sc.nextInt() - 1;
		for (i = 0; i < mas.length; i++) {
			int temp = mas[i][first];
			mas[i][first] = mas[i][second];
			mas[i][second] = temp;
		}
		System.out.println("поменяли местами два столбца");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
