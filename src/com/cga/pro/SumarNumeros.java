/**
 * 
 */
package com.cga.pro;

import java.util.Scanner;

/**
 * @author Rafael Martin
 *
 */
public class SumarNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//final double PI = 3.1416;
		
		
		//Se crea el lector
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 2 números para realizar la suma \n");
		
		//Se pide un dato al usuario, en este caso su nombre
		System.out.print("Por favor introduzca el número 1: ");
		
		//Se lee el nombre con nextLine() que retorna un String con el dato
		int numero1 = sc.nextInt();
		
		//Se pide otro dato al usuario, en este caso su edad
		System.out.print("Por favor introduzca el número 2: ");
		
		//Se guarda la edad directamente con nextInt()
		int numero2 = sc.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("------------------------------------");
		System.out.print("El resultado de la suma es:  " + resultado +"");
		
		
		// Cerramos el lector
		sc.close();

		
	}

}
