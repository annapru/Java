package by.home.les2.vetvlenie;

public class Task27 {

	public static void main(String[] args) {
		
		int a=56,b=52,c=44,d=86,min1,min2,max;
		
		if (a<b) {min1=a;}
		else {min1=b;}
		
		if (c<d) {min2=c;}
		else {min2=d;}
		
		if (min1>min2) {max=min1;}
		else {max=min2;}
		
		System.out.println(max);
	}

}
