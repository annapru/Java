package by.home.les7.massiv_massivov;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		
		
		int[][] mas = new int[4][4] ;
		
		Random rand=new Random();
		int i,j;
		System.out.println("матрица:");
		
		for ( i = 0; i < 4; i++) {
			for ( j = 0; j < 4; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		
		for ( i = 0; i < 4; i++) {
			for ( j = 0; j < 4; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("первый и последний столбцы");
		for ( i = 0; i < 4; i++) {
			for ( j = 0; j < 4; j++) {
				if(j==0|j==3) {
				System.out.print(mas[i][j] + " ");}
			}
			System.out.println();
		}
		
	}

}
