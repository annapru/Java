package by.home.les1.linejnye;

public class Task36 {

	public static void task36() {
		int a = 3654;
        int even = 1;
        int odd = 1;
        boolean isOdd = false;
        while (a > 0) {
            int digit = a % 10;
            if (isOdd) {
                odd *= digit;
            } else {
                even *= digit;
            }
            isOdd = !isOdd;
            a /= 10;
          }
        double ch =(double)even/odd;
        System.out.println(ch);

	}

}
