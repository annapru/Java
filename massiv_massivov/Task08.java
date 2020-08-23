package by.home.les7.massiv_massivov;

public class Task08 {

	public static void main(String[] args) {

		int[][] mas = new int[][] { { 74, -54, -6, 7, -1 }, { 6, -5, -6, 67, -6 }, { 3, 7, -67, 9, -1 },
				{ 56, -5, -4, 72, -7 } };

		int i, j;
		System.out.println("матрица:");

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				System.out.printf("%-4d", mas[i][j]);
			}
			System.out.println();
		}
		int count = 0;
		
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
		if(mas[i][j]==7) {count++;}
			
			}
		}
		System.out.println("количество раз встречается число 7 среди элементов массива = "+count);
	}

}
