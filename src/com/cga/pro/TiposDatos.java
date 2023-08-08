/**
 * 
 */
package com.cga.pro;

/**
 * @author Rafael Martin
 *
 */
public class TiposDatos {

	/**
	 * @param args
	 */
	
	public enum Meses {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre};
	
	public static void main(String[] args) {
		//inicializar tipos de vairables e imprimirlas por pantalla
		
		byte myByte = 127;
		short myShort = 32700;
		int myInt = 45000;
		long myLong = 15895654546565l;
		float myFloat = 293.9874f;
		double myDouble = 2.568;
		String myString = "programa de tipos de datos";
		char myChar = 'B';
		boolean myBoolean = true;
		final String CONSTANT = "Escuela";
		String diasSemana[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		
		int[] years = new int[3];
		years[0] = 2020;
		years[1] = 2021;
		years[2] = 2022;
		
		String texto = "Juan dijo: \"Hoy hace un día fantástico..\"";
	
		System.out.println("Este es un valor byte: " + myByte);
		System.out.println("Este es un valor short: " + myShort);
		System.out.println("Este es un valor int: " + myInt);
		System.out.println("Este es un valor long: " + myLong);
		System.out.println("Este es un valor float: " + myFloat);
		System.out.println("Este es un valor double: " + myDouble);
		System.out.println("Este es un valor String: " + myString);
		System.out.println("Este es un valor char: " + myChar);
		System.out.println("Este es un valor boolean: " + myBoolean);
		System.out.println("Este es un valor constant: " + CONSTANT);
		System.out.println("Este es un valores del array: " + diasSemana[0]);
		System.out.println("Este es un valor longitud del array: " + diasSemana.length);
		System.out.println("Este es un valor del array de enteros: " + years[0]);
		System.out.println("Este es un valores de enum: " + Meses.Abril);

		System.out.println("Este es un valor string: " + texto);
		
	}

}
