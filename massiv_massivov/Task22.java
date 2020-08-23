package by.home.les7.massiv_massivov;

public class Task22 {

	public static void main(String[] args) {
		int n = 6, i, j;
		int[][] mas = new int[n][n];

		System.out.println("матрица:");
		for (i = mas.length - 1; i >= 0; i--) {
			for (j = 0; j < n; j++) {
				if (i + j == n - 1) {
					mas[i][j] = n;
				}
				if (i + j == 4) {
					mas[i][j] = n - 1;
				}
				if (i + j == 3) {
					mas[i][j] = n - 2;
				}
				if (i + j == 2) {
					mas[i][j] = n - 3;
				}
				if (i + j == 1) {
					mas[i][j] = n - 4;
				}
				if (i + j == 0) {
					mas[i][j] = n - 5;
				}

			}

		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
