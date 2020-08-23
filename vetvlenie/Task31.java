package by.home.les2.vetvlenie;

public class Task31 {

	public static void main(String[] args) {
		
		int A=56,B=45,x=35,y=74,z=15;
		
		if (((x<=A & y<=B)|(x<=B & y<=A))|((x<=A & z<=B)|(x<=B & z<=A)))
		{System.out.println("кирпич влезает");}
		else {System.out.println("кирпич не влезает");}
		

	}

}
