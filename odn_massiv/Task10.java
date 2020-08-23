package by.home.les5.odn_massiv;

public class Task10 {

	public static void main(String[] args) {

		int[] mas = new int[] { -2, 7, 5, 2, 8, 6, -9 };
		int i;
		for (i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}
		}
	}

}
