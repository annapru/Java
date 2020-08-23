package by.home.les2.vetvlenie;

public class Task28 {

	public static void main(String[] args) {
		
		int a=98,b=68,c=78,d=57;
		
		if(a!=d & b!=d &c!=d) {if(d-a>d-b & d-a>d-c) {System.out.println("max="+(d-a));}  // max из (d-a,d-b,d-c)
		                      else {if (d-b>d-a & d- b>d-c) {System.out.println("max="+(d-b));}
		                            else{System.out.println("max="+(d-c));}}}
		if(a==d) {System.out.println("a=d="+d);}
		if(b==d) {System.out.println("b=d="+d);}
		if(c==d) {System.out.println("c=d="+d);}
	
	}
}
