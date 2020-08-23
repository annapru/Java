package by.home.les5.odn_massiv;

public class Task16 {

	public static void main(String[] args) {

		double[] mas = new double[] { 23.1, 52.4, 12, 68, 43.7, 23.4 };

		int i, j = 0, p = 1;
		for (i = 0; i < mas.length / 2; i++) {
			mas[j] = mas[i] + mas[mas.length - p];
			p++;
			j++;
		}

		double max = mas[0];
		for (j = 0; j < mas.length / 2; j++) {
			System.out.print(mas[j] + "  ");
			if (mas[j] > max) {
				max = mas[j];
			}
		}
		System.out.println();
		System.out.println("max=" + max);
	}

}
