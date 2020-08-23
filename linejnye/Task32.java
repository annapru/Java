package by.home.les1.linejnye;

public class Task32 {

	public static void task32() {
		
		 int m=19,n=7,k=20,p=5,q=20,r=23,sec,min,ch;
		 
		 sec=k+r;
		 min=n+q;
		 ch=m+p;
		 
		 if(sec>59) {min=min+1;sec=sec-60;}
		 if(min>59) {ch=ch+1;min=min-60;}
		 if(ch>23) {ch=ch-24;}
		 
         System.out.println(ch+":"+min+ ":"+sec);

	}

}
