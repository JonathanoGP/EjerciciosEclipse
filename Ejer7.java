package Ejercicio7;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Convertir X grados Fahrenheit a grados Celsius. Celsius= 5/9 (Fahrenheit -323)*/
		
		Scanner tc=new Scanner(System.in);
				
		double c, f = 0, x;
		double x1= f;
		System.out.println("Ingrese el valor en °f");
		x1= tc.nextDouble();
		
		c= (double) (x1-32)/1.8;
		
		System.out.println("La temperatura en grados celcius es:" +c +"C°");
		c= tc.nextDouble();
		
	}

}
