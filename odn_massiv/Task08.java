package by.home.les5.odn_massiv;

public class Task08 {

	public static void main(String[] args) {

		// Подсчитать, сколько в нем отрицательных,положительных и нулевых элементов.
		double[] mas = new double[] { -35.2, 54.8, -2.1, 0, 14.8 };
       
		int zero=0,pos=0,neg=0,i;
		
        for(i=0;i<mas.length;i++) {
		if(mas[i]==0) {zero++;}
		if(mas[i]>0) {pos++;}	
		if(mas[i]<0) {neg++;}	
		}
        System.out.println("количество нулевых элементов- "+zero);
        System.out.println("количество положительных элементов- "+pos);
        System.out.println("количество отрицательных элементов- "+neg);
	}

}
