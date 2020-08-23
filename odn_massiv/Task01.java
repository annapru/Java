package by.home.les5.odn_massiv;

public class Task01 {

	public static void main(String[] args) {
		
		int[] ar = new int[] { 25, 56, 84, 45, 71 };
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		
		
		
		int sum = 0, k = 3;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % k == 0) {
				sum = sum + ar[i];
			}
		}
		System.out.println("sum = " + sum);

		

	}
}
