package by.home.les5.odn_massiv;

public class Task11 {

	public static void main(String[] args) {

		int[] mas = new int[] { 26, 58, 54, 46, 86, 62, 91, 28 };
		int M = 6, L = 4, i;
		boolean k = true;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] % M == L) {
				System.out.print(mas[i] + " ");
				k = false;
			}

		}
		if (k == true) {
			System.out.print("Таких чисел нет");
		}
	}
}
