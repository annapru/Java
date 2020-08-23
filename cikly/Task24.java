package by.home.les3.cikly;

public class Task24 {

	public static void main(String[] args) {

		int n=2185,sum=0;
		
		while(n>0) 
		{if (n%10%2==0) { sum=sum+n%10;}
		n=(int)n/10;}
		System.out.println("сумма чётных цифр "+sum);
		
		n=2185;
		int p=0;
		while(n>0) 
		{p=p*10+n % 10;
		n=n / 10;}
		System.out.println("перевёрнутое число "+p);

	}

}