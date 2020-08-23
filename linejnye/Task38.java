package by.home.les1.linejnye;

public class Task38 {

	public static void task38() {
		
		int x=4,y=-1;
		
		if (((x>=-4)&(x<=0))&((y>=0)&(y<=4)&(y<=x+4))|((x>=0)&(x<=4))&((y>=0)&(y<=4)&(y<=-x+4))) 
		{System.out.println("a)true");}
		else {System.out.println("a)false");} 
		
		if (((x>=-4)&(x<=4))&((y>=-3)&(y<=0))|((x>=-2)&(x<=2)) &((y>=0) & (y<=4))) {System.out.println("b)true");}
		else {System.out.println("b)false");}
		
		if ((((x>=0)&(x<=4))&((y>=0)&(y<=4))&(y<=(int)(Math.sqrt(16-x*x))))|(((x>=0)&(x<=4))&((y>=-5)&(y<=0))&(y<=(int)(Math.sqrt(25-x*x)))))  
		{System.out.println("c)true");}
		else {System.out.println("c)false");}
		 
	}

}
