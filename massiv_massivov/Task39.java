package by.home.les7.massiv_massivov;

public class Task39 {

	public static void main(String[] args) {
		int[][] mA = { { 3, 4, 23 }, { 5, 9, 1 }, { 21, 4, 7 }, { 4, 2, 5 }, { 3, 7, 17 } };

		int[][] mB = { { 1, 5, 43, 5 }, { 13, 4, 17, 1 }, { 45, 6, 1, 16 } };

		int m = mA.length;
		int n = mB[0].length;
		int o = mB.length;
		int[][] res = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < o; k++) {
					res[i][j] += mA[i][k] * mB[k][j];
				}
			}
		}

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.format("%6d ", res[i][j]);
			}
			System.out.println();
		}

	}
}
