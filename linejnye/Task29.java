package by.home.les1.linejnye;

public class Task29 {

	public static void task29() {
		int a=8,b=6,c=10,P;
		double p,S,A,B,Y;
		P=a+b+c;
		p=P/2;
		S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		A=Math.asin(S*2/(b*c));
		B=Math.asin(S*2/(a*b));
		Y=Math.asin(S*2/(a*c));
			
		System.out.println("угол между b и c ="+ A+" рад");
		System.out.println("угол между a и b = "+B+" рад");
		System.out.println("угол между a и c ="+Y+" рад");
		
		System.out.println("угол между b и c ="+ Math.toDegrees(A));//в градусах
		System.out.println("угол между a и b = "+Math.toDegrees(B));
		System.out.println("угол между a и c ="+Math.toDegrees(Y));
		
		
	}

}
