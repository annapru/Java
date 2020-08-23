package by.home.les3.cikly;

public class Task36 {

	public static void main(String[] args) {

		int i, j;
		for (i = 10; i <= 99; i++) {
			for (j = 10; j <= 99; j++) {
				if ((i * 100 + j) % (i * j) == 0) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

}
