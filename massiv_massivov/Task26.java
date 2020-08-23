package by.home.les7.massiv_massivov;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {

		int n = 3, m = 4, sum, max, i, j;
		int[][] mas = new int[m][n];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("введите элементы построчно");
		for (i = 0; i < m; i++) {
			sum = 0;
			max = 0;
			for (j = 0; j < n; j++) {
				mas[i][j] = sc.nextInt();
				if (mas[i][j] < 0) {
					sum = sum + mas[i][j];
				}
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
			System.out.println("сумма отрицательных элементов в строке " + sum);
			System.out.println("максимальный элемент в строке " + max);
		}

		i = 0;
		j = 0;
		int maxm = mas[i][j], minm = mas[i][j], x = i, y = j, s = i, d = j;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < n; j++) {
				if (mas[i][j] > maxm) {
					maxm = mas[i][j];
					x = i;
					y = j;
				} // max
				if (mas[i][j] < minm) {
					minm = mas[i][j];
					s = i;
					d = j;
				} // max
			}
		}
		mas[x][y] = minm;
		mas[s][d] = maxm;
		System.out.println("максимальный и минимальный элементы матрицы переставлены");
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
