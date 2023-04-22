package Ejercicio3;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Determine el valor de Y= X*C-2 donde C es una constante con valor C=2.5, 
 * Sabiendo que X=2, Considerando a X un valor cualquiera*/
			
		Scanner tc=new Scanner(System.in);
		
		float Y, x, c;
		
		float c1= (float) 2.5, x1= 2;

		Y= (x1*c1)-2;
	
		System.out.println("Y= X*C-2:"+ Y);
	
		float x2=0;
	
		System.out.println("Ingrese la varriable x");
		float x21= tc.nextFloat();
		
		Y= (x21*c1)-2;
		System.out.println("Y= X*C-2:"+ Y);
		
		
		

	
		
		
	}

}
