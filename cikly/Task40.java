package by.home.les3.cikly;

public class Task40 {

	public static void main(String[] args) {

		int n = 40, i, A, k, d;

		for (i = 1; i <= n; i++) {
			A = i;
			k = 0;
			d = 0;
			while (A > 0) {
				k = k + 1;
				if (A % 10 != 0) {
					if (i % (A % 10) == 0) {
						d = d + 1;
					}
				}
				A = A / 10;
			}
			if (k == d) {
				System.out.println(i);
			}

		}
	}
}
