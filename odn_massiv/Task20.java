package by.home.les5.odn_massiv;

public class Task20 {

	public static void main(String[] args) {

		int[] mas = new int[] { 0, -65, 87, 45, -96, 32, 19, -73, 58 };
		int i;
		for (i = 1; i < mas.length; i = i + 2) {
			mas[i] = 0;
		}
		for (i = 0; i < mas.length; i = i + 2) {
			System.out.print(mas[i] + " ");
		}

	}

}
