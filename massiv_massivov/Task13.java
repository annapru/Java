package by.home.les7.massiv_massivov;

public class Task13 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[4][n];

		int i, j, count;
		System.out.println("матрица:");

		for (i = 0; i < mas.length; i++) {
			count = 1;
			for (j = 0; j < n; j++) {
				mas[i][j] = count;
				count++;
			}
		}

		for (i = 0; i < mas.length; i++) {
			System.out.println();
			if (i % 2 != 0) {
				for (j = n - 1; j >= 0; j--) {
					System.out.print(mas[i][j] + " ");
				}
			} else {
				for (j = 0; j < n; j++) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}

	}

}
