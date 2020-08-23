package by.home.les7.massiv_massivov;

public class Task12 {

	public static void main(String[] args) {

		int[][] mas = new int[4][4];

		int i, j;
		System.out.println("матрица:");

		int number = 0;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {

				if (j == i) {
					mas[i][j] = number;
					number++;
				}
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
