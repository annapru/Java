package by.home.les5.odn_massiv;

public class Task12 {

	public static void main(String[] args) {

		double[] mas = new double[] { 25.4, 52.6, 47, 6, 87.6, 48.9, 15.2, 20.1, 14.8 };
		int i, j;
		double sum = 0;
		boolean b;
		for (i = 2; i < mas.length; i++) {
			b = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
				} // значит число не простое
			}
			if (b == true) {
				sum = sum + mas[i];
			}
		}
		System.out.println(sum);
	}

}
