package Ejercicio9;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc=new Scanner(System.in);
		
		System.out.println("Mostrar el valor de PI:"+ Math.PI);
		
		double r=0;
		System.out.println("Ingresa el radio del cilindro");
		double r1= tc.nextDouble();
		
		double h=0;
		System.out.println("Ingresa la altura del cilindro");
		double h1= tc.nextDouble();
		
		double volumen= Math.PI*Math.pow(r1, 2)*h1;
		System.out.println("El volumen del cilindro es="+ volumen +"cm³" );
		
		
		
	}

}
