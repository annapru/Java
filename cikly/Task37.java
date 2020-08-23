package by.home.les3.cikly;

public class Task37 {

	public static void main(String[] args) {

		int i, j;
		for (i = 10; i <= 99; i++) {
			for (j = 10; j <= 99; j++) {
				if (((i * 100 + j) % (99) == 0) & ((j * 100 + i) % (49) == 0)) {
					System.out.println(i + " " + j);
				}
			}

		}

	}
}
