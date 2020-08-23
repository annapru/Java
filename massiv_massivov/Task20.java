package by.home.les7.massiv_massivov;

public class Task20 {

	public static void main(String[] args) {
		int n = 6, i, j;
		int[][] mas = new int[n][n];

		System.out.println("матрица:");
		int k = n, d = 0;
		int number = 1;

		for (j = 0; j < mas.length; j++) {
			for (i = d; i < k; i++) {
				mas[i][j] = number;
			}
			k--;
			d++;

		}
		k = n;
		d = 0;
		for (j = mas.length - 1; j > 0; j--) {
			for (i = k - 1; i >= d; i--) {
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
