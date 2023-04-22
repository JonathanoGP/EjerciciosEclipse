package Ejercicio4;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc=new Scanner(System.in);
// Determine la raíz Cuadrada de un número cualquiera
		
		double a;
		
		System.out.println("Ingrese la variable a");
		a= tc.nextInt();
		
		double raiz =+ Math.sqrt(a);
		
		System.out.println("La raiz cuadrada de a es:"+ raiz);
		
		
	}

}
