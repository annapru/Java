package by.home.les3.cikly;

public class Task20 {

	public static void main(String[] args) {
		
		int n=3;
		double e=0.1,a,sum=0,i;
		
		for (i=1;i<=n;i++)
		{a=1/((3*i-2)*(3*i+1));
		if(Math.abs(a)>=e) 
		{sum=sum+a;}}
		
		System.out.println(sum);

	}

}
