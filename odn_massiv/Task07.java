package by.home.les5.odn_massiv;

public class Task07 {

	public static void main(String[] args) {

		int[] mas = new int[] { 21, 35, 78, 56, 41, 65, 15 };
		int z = 47, i, kol = 0;
		for (i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				kol++;
			}
		}
		if (kol == 0) {
			System.out.println("нет чисел больше " + z);
		} else {
			System.out.println("количество замен " + kol);
		}
		for (i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	} 
}
