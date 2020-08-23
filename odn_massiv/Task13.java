package by.home.les5.odn_massiv;

public class Task13 {

	public static void main(String[] args) {

		int[] mas = new int[] { 26, 58, 54, 46, 86, 62, 91, 27 };
		int i, L = 15, N = 75, M = 3, kol = 0;
		for (i = 0; i < mas.length; i++) {
			if (mas[i] % M == 0 & mas[i] > L & mas[i] < N) {
				kol++;
			}
		}
		System.out.println("количество элементов = " + kol);

	}

}
