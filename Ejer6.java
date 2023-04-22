package Ejercicio6;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Convertir N kilogramos a Libras. 
		
		Scanner tc=new Scanner(System.in);
		
		float kg, lb = 0;
		float kg1= 1;
		float lb1=0;
		
		System.out.println("Ingrese los kilogramos: ");
		kg1= tc.nextFloat();
		
		lb1= (float) (kg1* 2.20462);
		
		System.out.println("La cantidad en libras es de =" + lb1 + "lb");
		lb1= tc.nextFloat();
		
	}

}
