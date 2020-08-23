package by.home.les5.odn_massiv;

public class Task06 {

	public static void main(String[] args) {

		int[] mas = new int[] { -6, -25, 45, 32, -47 };

		int i, max = mas[0], min = mas[0], length;

		for (i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		length = max - min;
		System.out.println("наименьшя длина числовой оси,содержащая все эти числа = " + length);

	}

}
