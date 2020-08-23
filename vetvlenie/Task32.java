package by.home.les2.vetvlenie;

public class Task32 {

	public static void main(String[] args) {
		int a=-23,b=-56,c=45;
		if (a+b>0) {{System.out.println("Сумма "+a+" и "+b+" положительная");}}
		if (a+c>0) {{System.out.println("Сумма "+a+" и "+c+" положительная");}}
		if (c+b>0) {{System.out.println("Сумма "+c+" и "+b+" положительная");}}
		if (a+b<0 & a+c<0 & b+c<0) {{System.out.println("Сумма любых двух чисел отрицательна");}}
	}

}
