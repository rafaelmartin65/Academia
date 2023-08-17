/**
 * 
 */
package com.cga.pro.metodo;

/**
 * @author Rafael Martin
 * 
 * Actividad #Metodos --> ejercicio 1: crear un metodo 
 *
 *
 */
public class DefinirMetodo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar variables
		int one, two;
		
		one = 4;
		two=7;
		System.out.println("La suma es: " + sumar(one, two));

	}
	
	// función que suma dos valores enteros
	
	public static int sumar(int num1, int num2) { 
		
		
		return (num1 + num2);
		
	}

}
