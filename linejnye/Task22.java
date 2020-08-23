package by.home.les1.linejnye;

public class Task22 {

	public static void task22() {
		int x,ch,c,min,sec,l,z;
		x=125467;
		z= x/3600;
		ch=(int)z; 
		c=x-(ch*3600);
		l=c/60;
		min=(int)l;
		sec=c-(min*60);
		
		System.out.println( ch+" чч "+min+" мм "+sec+" сс");	
	

	}

}
