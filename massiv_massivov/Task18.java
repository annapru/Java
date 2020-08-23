package by.home.les7.massiv_massivov;

public class Task18 {

	public static void main(String[] args) {

		int n = 6, i, j;
		int[][] mas = new int[n][n];

		System.out.println("матрица:");
		int k = mas.length, l = 0;
		for (j = 0; j < n; j++) {
			int number = 1;
			k = mas.length - l;
			for (i = 0; i < k; i++) {
				mas[i][j] = number;
				number++;
			}

			l++;
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
