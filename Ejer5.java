package Ejercicio5;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Evaluar la Función Y= 5X^4 + 2X^3 + 3X^2 + 7 para el valor de  
	a)	X=1; 
	b)	X un número cualquiera*/
		
		Scanner tc=new Scanner(System.in);
		
		float Y, x;
		float p1, p2, p3;
		
		float x1=1;
		
		p1=(float) (5*Math.pow(x1, 4));
		p2=(float) (2*Math.pow(x1, 3));
		p3=(float) (3*Math.pow(x1, 2));
		
		Y= p1+p2+p3+7;
		
		System.out.println("El resultado de la ecuacion Y= 5X^4 + 2X^3 + 3X^2 + 7 es="+ Y);
		
		int x2 = 0;
		
		System.out.println("Ingrese el valor de x=");
		x2= tc.nextInt();
		
		p1=(float) (5*Math.pow(x2, 4));
		p2=(float) (2*Math.pow(x2, 3));
		p3=(float) (3*Math.pow(x2, 2));
		
		Y= p1+p2+p3+7;
		
		System.out.println("El resultado de la ecuacion Y= 5X^4 + 2X^3 + 3X^2 + 7 es="+ Y);
		
	}



}
