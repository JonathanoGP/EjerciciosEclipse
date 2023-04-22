package Ejercicio14;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Determinar la solución lineal que tiene la forma ax + b =0 donde a y b son números reales
		Scanner tc=new Scanner(System.in);
		
		double a, b;
		
		
		System.out.println("Ingresa la variable a");
		a= tc.nextDouble();
		System.out.println("Ingresa la variable b");
		b= tc.nextDouble();
		
		double x = (-1.0*b)/a;
		System.out.println("El valor de x es: "+x);
		
		
	}
}
	



