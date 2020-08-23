package by.home.les5.odn_massiv;

public class Task09 {

	public static void main(String[] args) {

		double[] mas = new double[] { -35.2, 54.8, 75.12, 0, 14.8 };
		int i, indmax = 0, indmin = 0;
		double max = mas[0], min = mas[0];
		for (i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				indmax = i;
			}
			if (min > mas[i]) {
				min = mas[i];
				indmax = i;
			}
		}

		mas[indmin] = max;
		mas[indmax] = min;

		for (i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "  ");
		}

	}

}
