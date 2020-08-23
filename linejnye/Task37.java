package by.home.les1.linejnye;

public class Task37 {

	public static void task37() {
		
		int N=-13;
		if ((((N<100)&(N>9))|((N<-9)&(N>-100)))&(N%2==0)) {System.out.println("true");}
		else {System.out.println("false");
		
		int X=3437,X1,X2,X3,X4;
		X1=X%10;
		X2=(int)((X%100)/10);
		X3=(int)((X%1000)/100);
		X4=(int)((X%10000)/1000);
		if (X1+X2==X3+X4) {System.out.println("true");}
		else {System.out.println("false");}      
		
		N=347;
		X1=N%10;
		X2=(int)((N%100)/10);
		X3=(int)((N%1000)/100);
		if((X1+X2+X3)%2==0) {System.out.println("true");}
		else {System.out.println("false");} 
		
		int x=5,m=3,n=9;
		if ((x>m) &(x<n)) {System.out.println("true");}
		else {System.out.println("false");}
		
		int K=578;
		X1=K%10;
		X2=(int)((K%100)/10);
		X3=(int)((K%1000)/100);
		if(Math.pow((X1+X2+X3),3)==Math.pow(K,2)) {System.out.println("true");}
		else {System.out.println("false");}
		
		int a=3,b=7,c=3;
		if ((a==b) ^ (a==c)) {System.out.println("true");}
		else {System.out.println("false");} 
		
		N=549;
		X1=N%10;
		X2=(int)((N%100)/10);
		X3=(int)((N%1000)/100);
		if (X1+X2==X3|X1+X3==X2|X3+X2==X1){System.out.println("true");}
		else {System.out.println("false");}
		
		n=9;a=3;
		if ((n==1) | (n==a) | (n==a*a) | (n==a*a*a) | (n==a*a*a*a)){System.out.println("true");}
		else {System.out.println("false");}
	
		int y;
		a=5;b=1;c=6;m=3;n=7;
		x=m;y=n;
		if (y==a*x*x+b*x+c){System.out.println("true");}
		else {System.out.println("false");}
		
		
		
	}

	}	
}
