package Ejercicio12;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Obtener el promedio de N notas
		
		Scanner tc=new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, nota5, nota6, suma, promedio;
		String nombre;
		
		System.out.println("Ingrese el nombre del Alumno");
		nombre= tc.next();
		
		System.out.println("Ingrese la nota 1");
		nota1= tc.nextDouble();
		
		System.out.println("Ingrese la nota 2");
		nota2= tc.nextDouble();
		
		System.out.println("Ingrese la nota 3");
		nota3= tc.nextDouble();
		
		System.out.println("Ingrese la nota 4");
		nota4= tc.nextDouble();
		
		System.out.println("Ingrese la nota 5");
		nota5= tc.nextDouble();
		
		System.out.println("Ingrese la nota 6");
		nota6= tc.nextDouble();
		
		suma= nota1+nota2+nota3+nota4+nota5+nota6;
		promedio= suma/6;
		
		System.out.println("El promedio del estudiante es de= "+ promedio +"pts");
		
		
	}

}
