package by.home.les3.cikly;

public class Task21 {

	public static void main(String[] args) {
		
		double x=-5,y,h=0.5;
		System.out.println("   x      y ");
		while(x<=5)
		{y=x-Math.sin(x);
		System.out.println(x+"     "+y);
		x=x+h;}

	}

}
