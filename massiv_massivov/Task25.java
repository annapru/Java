package by.home.les7.massiv_massivov;

public class Task25 {

	public static void main(String[] args) {
		int n = 6, i, j;
		int[][] mas = new int[n][n];
		int number = 1;
		System.out.println("матрица:");
		int k = mas.length;

		for (i = 0; i < k; i++) {
			k = mas.length;
			for (j = 0; j < n; j++) {
				mas[i][j] = number;
				number++;
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
