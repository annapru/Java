package by.home.les3.cikly;

public class Task27 {

	public static void main(String[] args) {
		
		int m=2,n=9,i;
		while(m<=n)
		{System.out.println("делители числа "+m+",кроме 1 и самого числа:");
		    for(i=2;i<=m-1;++i)
		    	{if (m%i==0) {System.out.println(i);} }
		    m=m+1;}
		

	}

}
