package Ejercicio13;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			// Convertir Y yardas, F pies y I pulgadas a Centímetros
	
			Scanner tc=new Scanner(System.in);
			
			double Y, ft, I, cm;
			
			double Y1=0, cm1;
			System.out.println("Ingrese la longitud en yardas");
			Y1= tc.nextDouble();
			
			cm1= (double)(Y1*91.44);
			System.out.println("La conversion de yardas a centimetros es="+ cm1 +"cm");	
			
			double ft1=0, cm2;
			System.out.println("Ingrese la longitud en pies");
			ft1= tc.nextDouble();
			
			cm2= (double)(ft1*30.48);
			System.out.println("La conversion de pies a centimetros es="+ cm2 +"cm");	

			double I1=0, cm3;
			System.out.println("Ingrese la longitud en pulgadas");
			I1= tc.nextDouble();
			
			cm3= (double)(I1*2.54);
			System.out.println("La conversion de pulgadas a centimetros es="+ cm3 +"cm");	
			
	}
	
}
		
