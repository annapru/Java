package by.home.les3.cikly;

public class Task35 {

	public static void main(String[] args) {
		
		int n=24566,kol=0; 
		while(n>0) 
		{if (n%10%2==0) { kol=kol+1;}
		n=(int)n/10;}
		System.out.println("сумма чётных цифр "+kol);
		    
		  

	}

}