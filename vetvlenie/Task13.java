package by.home.les2.vetvlenie;

public class Task13 {

	public static void main(String[] args) {
		
		int x1=4,x2=11,y1=10,y2=3;
		double R1,R2;
		R1=Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2));
		R2=Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2));
		if (R1<R2) {System.out.println("точка A("+x1+";"+y1+") ближе к началу координат");}
		else {System.out.println("точка B("+x2+";"+y2+") ближе к началу координат");}
		

	}

}