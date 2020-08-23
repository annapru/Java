package by.home.les7.massiv_massivov;

public class Task24 {

	public static void main(String[] args) {

		int n = 5, i, j;
		int[] mas = new int[] { 3, 5, 6, 7, 1 };
		int[][] mas2 = new int[n][n];

		for (i = 0; i < mas2.length; i++) {
			for (j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) Math.pow(mas[j], (i + 1));
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%6d", mas2[i][j]);
			}
			System.out.println();
		}
	}

}
