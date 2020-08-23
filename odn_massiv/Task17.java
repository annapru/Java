package by.home.les5.odn_massiv;

public class Task17 {

	public static void main(String[] args) {

		int[] mas = new int[] { -6, -25, 45, 32, -47, 56, 25,-47,69 };

		int i, min = mas[0];

		for (i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		for (i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				System.out.print(mas[i] + "  ");

			}
		}
	}
}
