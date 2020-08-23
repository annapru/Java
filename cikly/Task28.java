package by.home.les3.cikly;

import java.util.Scanner;

public class Task28 {
	public static void main(String[] args) {
		int z;
		char s;

		do {
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.print("введите новые значения:");
			System.out.print("x=");
			int x = in.nextInt();
			System.out.print("y=");
			int y = in.nextInt();
			System.out.print("введите знак операции:");
			String str;
			str = in.next();
			s = str.charAt(0);

			switch (s) {
			case '+':
				z = x + y;
				System.out.println("результат:" + z);
				break;
			case '-':
				z = x - y;
				System.out.println("результат:" + z);
				break;
			case '*':
				z = x * y;
				System.out.println("результат:" + z);
				break;
			case '/':
				if (y == 0) {
					System.out.println("Не определена");
				} else {
					z = x / y;
					System.out.println("результат:" + z);
					break;}
			case '0':
				continue;
				
			default:
				System.out.println("Неправильный знак");
			}
		} while (s != '0');
	}
}