package by.home.les7.massiv_massivov;

public class Task15 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		int i, j;
		System.out.println("матрица:");
		int number = 6;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == i) {
					mas[i][j] = number;
					number--;
				}
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
