package by.home.les1.linejnye;

public class Task35 {

	public static void task35() {
		
		int M=589,N=7;
	
		int Mc=(int)(M/N)%10;
		
		int Sd=((10*(M-N*((int)(M/N))))/N);
		
		System.out.println("старшая цифра дробной части= "+Sd);
		System.out.println("младшая цифра целой части= "+ Mc);
		

	}

}
