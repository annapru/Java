package by.home.les3.cikly;

public class Task38 {

	public static void main(String[] args) {

		int i;
		int[] mas = new int[3];
		mas[0] = 6;
		mas[1] = 4;
		mas[2] = 2;
		i = 1;
		if (mas[i] - mas[i - 1] == mas[i + 1] - mas[i]) {
			System.out.println("число образует арифметическую прогрессию");
		} else {
			System.out.println("число не образует арифметическую прогрессию");
		}

	}

}
