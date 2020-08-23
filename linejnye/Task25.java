package by.home.les1.linejnye;

public class Task25 {

	public static void task25() {
    int a=2,b=3,c=1;
    double D,x1,x2;
     D=Math.pow(b, 2)-4*a*c;
     x1=(-b+ Math.sqrt(D))/(2*a);
     x2=(-b- Math.sqrt(D))/(2*a);
     System.out.println("корни уравнения 2x^2+3x+c=0 : x1="+x1+" x2="+x2);
	}

}
