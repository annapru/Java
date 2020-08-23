package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task36 {

	public static void main(String[] args) {
		int Row = 3;
		int Col = 4;
		double[][] mas = new double[Row][Col]; //

		Random rand = new Random();
		int i, j;
		System.out.println("матрица:");

		for (i = 0; i < Row; i++) {
			for (j = 0; j < Col; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		for (i = 0; i < Row; i++) {
			for (j = 0; j < Col; j++) {
				System.out.printf("%5.2f", mas[i][j]);
			}
			System.out.println();
		}

		double[][] mas2 = new double[Row][Col];
		double sum;
		int kol_sosed;
		for (i = 0; i < Row; i++) {
			for (j = 0; j < Col; j++) {
				sum = 0;
				kol_sosed = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					for (int l = j - 1; l <= j + 1; l++) {
						if (k >= 0 && l >= 0 && k < Row && l < Col) {
							if (!(k == i && l == j)) {
								sum += mas[k][l];
								kol_sosed++;
							}
						}
						if (k == i + 1 && l == j + 1) {
							mas2[i][j] = (sum / kol_sosed);
						}
					}
				}
			}
		}
		System.out.println();
		for (i = 0; i < Row; i++) {
			for (j = 0; j < Col; j++) {
				System.out.printf("%5.2f", mas2[i][j]);
			}
			System.out.println();
		}
	}

}
