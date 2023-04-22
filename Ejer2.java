package Ejer2;

import java.util.Scanner;

public class Ejer2 {

	private static double perimetro;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc=new Scanner(System.in);
		
		//System.out.print("2.	Determinar el Perímetro de una circunferencia y el área de un círculo");
		System.out.println("Mostrar el valor de PI:"+ Math.PI);
		
		double r=0;
		System.out.println("Ingresa el radio de la circunferencia");
		double r1= tc.nextDouble();
		
		double perimetro = 2*r1*Math.PI;
		double area = Math.PI*Math.pow(r1, 2);
		
		System.out.println("El perimetro de la circunferencia es:"+ perimetro);
		System.out.println("El area del circulo es:"+ area);
		
		
		
	
		
		
		
	}

}
