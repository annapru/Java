package by.home.les2.vetvlenie;

public class Task10 {

	public static void main(String[] args) {
		
		final double pi=3.1415926;
		int R1=9,R2=7;
		double S1,S2;
		S1=pi*Math.pow(R1, 2);
		S2=pi*Math.pow(R2, 2);
		if(S1<S2) {System.out.println("площадь круга с радиусом "+R1+" меньше кргуа с радиусом "+R2);}
		else { System.out.println ("площадь круга с радиусом "+R2+" меньше кргуа с радиусом "+R1);}
		

	}

}
