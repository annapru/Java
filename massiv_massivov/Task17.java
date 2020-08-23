package by.home.les7.massiv_massivov;

public class Task17 {

	public static void main(String[] args) {

		int n = 6, i, j;
		int[][] mas = new int[n][n];

		for (i = 0; i < mas.length; i++) {
			mas[i][0] = 1;
			mas[i][mas.length - 1] = 1;
			for (j = 1; j < mas.length; j++) {
				if (i == 0 || i == (mas.length - 1))
					mas[i][j] = 1;
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