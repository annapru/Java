package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task31 {

	public static void main(String[] args) {

		int[][] mas = new int[2][3];

		Random rand = new Random();
		int kol=0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				mas[i][j] = rand.nextInt(1000);
				if((mas[i][j]<100) & (mas[i][j]>9)) {kol++;}
			}
		}
		System.out.println("количество двузначных чисел "+kol);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
