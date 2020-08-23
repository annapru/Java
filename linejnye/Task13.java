package by.home.les1.linejnye;

public class Task13 {

	public static void task13() {
	int x1=2, x2=3,x3=1,y1=3,y2=4,y3=5;
	double a,b,c,P,p,S;
	a=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	b=Math.sqrt(Math.pow((x3-x2), 2)+Math.pow((y3-y2), 2));
	c=Math.sqrt(Math.pow((x3-x1), 2)+Math.pow((y3-y1), 2));
	P=a+b+c;
	p=P/2;
	S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	System.out.println("Периметр= "+P);
	System.out.println("Площадь= "+S);

}
}
