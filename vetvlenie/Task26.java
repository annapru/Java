package by.home.les2.vetvlenie;

public class Task26 {

	public static void main(String[] args) {
		int a=553,b=128,c=884;
		if (a>b) {if(a>c){if(b>c){System.out.println(a+c);}  
		                  else {System.out.println(a+b);}}}
		
		if (b>a) {if(b>c){if(a>c){System.out.println(b+c);}  
                          else {System.out.println(b+a);}}}
		
		if (c>b) {if(c>a){if(b>a){System.out.println(a+c);}  
                          else {System.out.println(c+b);}}}
	}

}
