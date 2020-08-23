package by.home.les5.odn_massiv;

public class Task05 {

	public static void main(String[] args) {

		int[] mas = new int[] { 25, 44, 84, 69, 23, 58 };
		int[] mas2 = new int[6];
		int f = 0, k = 1;
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		int i;
		for (i = 0; i < mas.length; i++) {
			if ((mas[i] % 2 == 0) & (mas[i] > 0)) {
				f = 1;
				mas2[k] = mas[i];
				k++;
			}
		}
		k = k - 1;
		System.out.println();
		if (f == 0) {
			System.out.print("чётных чисел нет");
		} else {
			System.out.print("чётные числа последовательности:");
		}
		for (i = 1; i <= k; i++) {
			System.out.print(mas2[i] + " ");
		}

	}

}
