/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 9: Calcular parte decimal de un número real.
 *
 */
public class ParteDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//definir variables
		double numero, decimal;
		int entero;
		
		Scanner sc = new Scanner(System.in);
		
		// Pedir valores por teclado
		
		System.out.println("Introduce un número: " );
		String data = sc.next();

		numero = Double.parseDouble(data);
		
		entero = (int) numero;
		

		decimal = numero - entero;
		
		System.out.println(decimal);
		
		sc.close();
	}
	
	

}
