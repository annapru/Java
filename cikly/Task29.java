package by.home.les3.cikly;

public class Task29 {

	public static void main(String[] args) {

		int a = 4587, b = 8456, d, c, z;
		while (a > 0) {
			d = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				z = c % 10;
				c = c / 10;
				if (z == d) {
					System.out.println(d + " "); // общая цифра
				}
			}
		}

	}

}
