package by.home.les7.massiv_massivov;

public class Task23 {

	public static void main(String[] args) {
		int n = 6;
		double[][] mas = new double[n][n];
		int kol = 0;
		int i, j;
		System.out.println("матрица:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				mas[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				if (mas[i][j] > 0) {
					kol++;
				}
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%10.3f", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("количество положительных элементов " + kol);

	}

}
