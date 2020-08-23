package by.home.les7.massiv_massivov;

public class Task34 {

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		int sizeCol=6;

	 		for (int j=0;j<sizeCol;j++) {
	 			for(int i=0;i<mas.length;i++) {
	 				if(i<=j) {mas[i][j]=1;}
	 				else{mas[i][j]=0;}
	 			}
	 			
	 		}
	 	}
	}

