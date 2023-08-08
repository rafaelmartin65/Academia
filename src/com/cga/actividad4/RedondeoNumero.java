/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 10: Ingresar numero devolver redondeado.
 *
 */
public class RedondeoNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//definir variables
		double numero;
		int entero;
		
		Scanner sc = new Scanner(System.in);
		
		// Pedir valores por teclado
		
		System.out.println("Introduce un número decimal: " );
		String data = sc.next();

		numero = Double.parseDouble(data);
		
		entero = (int) numero;
		

		System.out.println(entero);
		
		sc.close();

	}

}
