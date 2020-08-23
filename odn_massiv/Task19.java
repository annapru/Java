package by.home.les5.odn_massiv;

public class Task19 {

	public static void main(String[] args) {

		int[] mas = new int[] { 3,36, 58, 58, 58, 56, 56, 56,57,57,57 };

		int i, Current = 0, Biggest = 0, Frequent = 0;

		for (i = 0; i < mas.length; i++) {
			for (int j = i; j < mas.length; j++) {
				if (mas[i] == mas[j]) {
					Current++;
				}
			}
			if (Current == Biggest) {
				if (mas[i] < Frequent) {
					Frequent = mas[i];
				}
			}
			if (Current > Biggest) {
				Biggest = Current;
				Frequent = mas[i];
			}

			Current = 0;
		}
		System.out.println("Частота =" + Biggest);
		System.out.println("Элемент =" + Frequent);

	}
}
