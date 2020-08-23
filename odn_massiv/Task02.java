package by.home.les5.odn_massiv;

public class Task02 {

	public static void main(String[] args) {

		int[] ar = new int[] { 25, 56, 0, 45, 71, 24, 0, 65 };
		int i;

		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				ar[i] = i;
			} else {
				ar[i] = 0;
			}
		}

		for (i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				System.out.print(ar[i] + " ");
			}
		}
	}

}
