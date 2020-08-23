package by.home.les5.odn_massiv;

import java.util.Arrays;
import java.util.Random;

public class Task18 {

	public static void main(String[] args) {

		int[] array = { 1, 0, 0, 0, 0, 0, 4, 0, 0, 0 };
		unlock(array);
		System.out.println(Arrays.toString(array));
	}

	public static void unlock(int[] array) {
		int[] sequence = { 6, 3, 1 }; // sum = 10;

		for (int i = 0; i <= array.length - sequence.length; i++) {
			// find sequence of 3 empty cells
			int counter = 0;
			for (int j = 0; j < sequence.length; j++) {
				if (array[i + j] == 0) {
					counter++;
				}
			}
			// if empty sequence was found, fill it with sequence with sum = 10
			if (counter == 3) {
				for (int j = 0; j < sequence.length; j++) {
					array[i + j] = sequence[j];
				}
				break;
			}
		}

		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = random.nextInt(6) + 1;
			}
		}

	}
}
