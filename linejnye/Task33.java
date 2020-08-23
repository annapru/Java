package by.home.les1.linejnye;

public class Task33 {

	public static void task33() {
		char character='K';
		int number=(int)character;
		System.out.println("порядковый номер "+number);
		char pred= (char)(number-1);
		char succ=(char)(number+1);

		System.out.println("предыдущий номер "+pred);
		System.out.println("последующий номер "+succ);


	}

}
