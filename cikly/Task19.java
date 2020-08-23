package by.home.les3.cikly;

public class Task19 {

	public static void main(String[] args) {
		
		int n=3,i;
		double e=0.3,a,sum=0;
		
		for (i=1; i<=n;i++)
		{a=1/Math.pow(2,i)+1/Math.pow(3,i);
		if(Math.abs(a)>=e) 
		{sum=sum+a;}}
		
		System.out.println(sum);

	}

}
