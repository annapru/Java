package by.home.les7.massiv_massivov;

public class Task01 {

	public static void main(String[] args) {
		int[][] mas = new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
