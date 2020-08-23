package by.home.les7.massiv_massivov;

public class Task19 {

	public static void main(String[] args) {

		int n = 6, i, j;
		int[][] mas = new int[n][n];

		System.out.println("матрица:");
		int k = n, d = 0;
		int number = 1;

		for (i = 0; i < mas.length; i++) {
			for (j = d; j < k; j++) {
				mas[i][j] = number;
			}
			k--;
			d++;

		}
		k = n;
		d = 0;
		for (i = mas.length - 1; i > 0; i--) {
			for (j = k - 1; j >= d; j--) {
				mas[i][j] = number;
			}
			k--;
			d++;
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}

}
