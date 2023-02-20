package Practica_programer;

public class practica1 {

	public static void main (String[] args) {
		
		String nom="angel";
		//char a[]=nom.toCharArray();
		String b="";
		for(int i = 0 ; i<nom.length();i++) {
			
			if(i==0) {
				b="*"+nom;
			
			}
		}
		b=b+"*";
		System.out.print(b);
	}
}
