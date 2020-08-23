package by.home.les5.odn_massiv;

public class Task15 {

	public static void main(String[] args) {
		
		int[] mas = new int[] { 26, -58, 54, 46, -86, 62, 91, 27 };

		int i,c=5,d=30;
        boolean b=true;
		for (i = 0; i < mas.length; i++) {
			b=true;
			if(mas[i]>=c & mas[i]<=d) {System.out.print(mas[i]+"  ");}
			else {b=false;}
		}
		if (b==false) {System.out.println("таких элементов нет ");}
		

	}

}
