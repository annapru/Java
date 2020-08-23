package by.home.les3.cikly;

public class Task39 {

	public static void main(String[] args) {

		int i, a;
		for (i = 100; i <= 999; i++) {
			a = i % 100;
			if (7 * a == i) {
				System.out.println(i);
			}
		}

	}

}
