package by.home.les5.odn_massiv;

public class Task04 {

	public static void main(String[] args) {

		double[] ar = new double[] { 25.54, 65.54, 84.32, 98.74, 102.2 };
		int i;

		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();

		boolean f = true;
		for (i = 2; i < ar.length; i++) {
			if ((ar[i] > ar[i -1]) &(f==true)) {f=true;} 
			else {f=false;}
		}
		if (f==true) {System.out.print( "Последовательность возврастает ");}
		else {System.out.print( "Последовательность не возврастает ");}
	}

}
