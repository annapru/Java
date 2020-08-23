package by.home.les7.massiv_massivov;

public class Task29 {

	public static void main(String[] args) {
		int[][] mas = new int[][] { { 2, -6, 3, 2 }, { 66, -88, 47, -96 }, { 32, 65, 67, 32 }, { 36, -7, 56, -74 } };

		int i, j;
		System.out.println("матрица:");

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("положительные элементы главной диагонали квадратной матрицы");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if ((j == i) & (mas[i][j] > 0)) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}

	}

}
