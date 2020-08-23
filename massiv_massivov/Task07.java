package by.home.les7.massiv_massivov;


public class Task07 {

	public static void main(String[] args) {
	
		
		int[][] mas = new int[][]{{74,-54,-6,7,-1},{6,-5,-6,67,-6},{3,-5,-67,9,-1},{56,-5,-4,72,-7},{3,-51,-9,7,-12}};


		int i, j;
		System.out.println("матрица:");

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				System.out.printf("%-4d",mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("сумма модулей отрицательных нечетных элементов");
        int sum=0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				if ((mas[i][j] < 0)&(mas[i][j] %2!=0)) {
					sum=sum+Math.abs(mas[i][j]);
				}
			}
		}
		System.out.println(sum);
	}

}
