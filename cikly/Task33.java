package by.home.les3.cikly;

public class Task33 {

	public static void main(String[] args) {
		
		int n=35694,a,max=0;
		while (n > 0) {
            a = (int)(n % 10);
            if (a > max) { max = a;}
            n /= 10;}
            System.out.println("наибольшая цифра "+max);
            
	       

	}}
