package by.home.les3.cikly;

public class Task18 {

	public static void main(String[] args) {
		
		int n=5,i;
		double e=0.3,a,sum=0;
		
		for (i=1; i<n;i++)
		{a=Math.pow(-1, i-1)/i;
		if(Math.abs(a)>=e) 
		{sum=sum+a;}}
		
		System.out.println(sum);

	}

}
