package by.home.les2.vetvlenie;

public class Task30 {

	public static void main(String[] args) {
		
		double a=20.24, b=-54.7,c=-68.4;
		
		if (a>b & b>c) {a=2*a;b=2*b;c=c*2;}
		else {a=Math.abs(a);b=Math.abs(b);c=Math.abs(c);}
		
		System.out.println(a+"  "+b+"  "+c);
	}

}
