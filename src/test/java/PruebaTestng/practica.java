package PruebaTestng;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class practica {

	public static void main(String[] args) {     
	
		
		int personas[]= {50,60,60,45,70};
		int resul[]= {0,0};
		int g=0;
		for(int i=0; i<personas.length;i+=2) {
			g=personas[i]+g;
		}
		resul[0]=g;
		g=0;
		for(int i=1; i<personas.length;i++) {
		
			if(2/personas.length==0) {
				System.out.println(personas[i]);
			}
		}
		resul[1]=g;
		
		for(int i=0; i<resul.length;i++) {
			
			
			//System.out.println(resul[i]);
		}
	}
}
