package by.home.les5.odn_massiv;

public class Task14 {

	public static void main(String[] args) {

		int[] mas = new int[] { 26, -58, 54, 46, -86, 62, 91, 27 };

		int i, min = mas[1], max = mas[0];

		for (i = 0; i < mas.length; i = i + 2) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		for (i = 1; i < mas.length; i = i + 2) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}
		System.out.println(max + min);
	}

}
