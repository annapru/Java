package by.home.les2.vetvlenie;

public class Task35 {

	public static void main(String[] args) {
	    int num=364,ch;
		if (num>0 & num<32) {System.out.println(num +" январь");}
		if (num>31 & num<60) { ch=num-31;System.out.println(ch+" февраль");}
		if (num>59 & num<91) {ch=num-59;System.out.println(ch+" март");}
		if (num>90 & num<121) {ch=num-90;System.out.println(ch+" апрель");}
		if (num>120 & num<152) {ch=num-120;System.out.println(ch+" май");}
		if (num>151 & num<182) {ch=num-151;System.out.println(ch+" июнь");}
		if (num>181 & num<213) {ch=num-181;System.out.println(ch+" июль");}
		if (num>212 & num<244) {ch=num-212;System.out.println(ch+" август");}
		if (num>243 & num<274) {ch=num-243;System.out.println(ch+" сентябрь");}
		if (num>273 & num<305) {ch=num-273;System.out.println(ch+" октябрь");}
		if (num>304 & num<335) {ch=num-304;System.out.println(ch+" ноябрь");}
		if (num>334 & num<366) {ch=num-334;System.out.println(ch+" декабрь");}
		

	}

}
