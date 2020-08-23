package by.home.les2.vetvlenie;

public class Task33 {

	public static void main(String[] args) {
		int pass=3331;
		
		if (pass==9583 | pass==1747) {System.out.println("доступны модули баз А, В, С");}
		if (pass==3331 | pass==7922) {System.out.println("доступны модули баз В, С");}
		if (pass==9455 | pass==8997) {System.out.println("доступны модули баз А, В, С;");}
		if (pass!=9583&pass!=1747&pass!=3331 &pass!=7922&pass!=9455 & pass!=8997) {System.out.println(" модули не доступны");}
		

	}

}
