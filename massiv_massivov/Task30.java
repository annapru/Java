package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task30 {

	public static void main(String[] args) {

		int[][] mas = new int[10][20];

		Random rand = new Random();
		int i, j, kol;

		for (i = 0; i < 10; i++) {
			kol = 0;
			for (j = 0; j < 20; j++) {
				mas[i][j] = rand.nextInt(15);
				if (mas[i][j] == 5) {
					kol++;
				}
			}
			if (kol > 2) {
				System.out.println("в строке " + (i + 1) + " число 5 встречается " + kol + " раза");
			}
		}
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 20; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

}
