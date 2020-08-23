package by.home.les3.cikly;

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {

		int i = 1;
		double x;
		while (i <= 5) {
			x = (int) (Math.random() * (15 - 1)) + 1;
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.println(" введите число от 1 до 16:");
			System.out.print("y=");
			int y = in.nextInt();
			if (y < 1 | (y > 15)) {
				System.out.println("ошибочное число");
				continue;
			}
			if (y == x) {
				System.out.print("угадали ");
				System.out.print("x=" + x + " и  y= " + y);
			} else {
				System.out.print("не угадали ");
				System.out.print("x=" + x + " и  y= " + y);
			}
			i++;
		}

	}

}

