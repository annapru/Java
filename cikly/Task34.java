package by.home.les3.cikly;

public class Task34 {

	public static void main(String[] args) {
		
		int k=1000,b,c,d,i,a;
		
		while(k<10000) {a = (k % 100) % 10;    // четвертая цифра
        b = (k % 100) / 10;        // третья цифра
        c = (k % 1000) / 100;    // вторая цифра
        d = k / 1000;         // первая цифра
        i = a + b + c + d;
        if (i == 15) {
        	System.out.println(k);
            k++;
        }
        else {
            k++;}
	}}
}
