package Ejercicio8;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc= new Scanner(System.in);
		
		double a = 0, b=0, c=0, s = 0;
		double lados= a, b1, c1;
		
		System.out.println("Ingresa el lado a del triangulo");
		a= tc.nextDouble();
		System.out.println("Ingresa el lado b del triangulo");
		b1= tc.nextDouble();
		System.out.println("Ingresa el lado c del triangulo");
		c1= tc.nextDouble();
		
		double perimetro= a+b1+c1;
		System.out.println("El perimetro del triangulo es:" +perimetro);
		
		
		double s1= perimetro/2;
		System.out.println("El semiperimetro del triangulo es:"+ s1);
		
		double sa1 = s1-a;
		double sb1 = s1-b1;
		double sc1 = s1-c1;
		double sd = s1*sa1*sb1*sc1;
		
		double area1 = Math.sqrt(sd);
		System.out.println("El area del triangulo es ="+area1 + "m²");
		area1= tc.nextDouble();
		
		
	}

}
