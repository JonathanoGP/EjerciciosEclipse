package Ejercicio10;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*10.	Determine el valor de la fuerza de un cuerpo que tiene por masa “M” y aceleración “A”*/
		
		Scanner tc=new Scanner(System.in);
		
		float m, a;
		
		float m1;
		System.out.println("Ingresa la masa del objeto");
		m1= tc.nextFloat();
		
		float a1;
		System.out.println("Ingresa la aceleracion del objeto");
		a1= tc.nextFloat();
		
		double fuerza= m1*a1;
		System.out.println("La fuerza del objeto es="+ fuerza +"N");
		
	}

}
