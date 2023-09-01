/**
 * 
 */
package com.cga.oop3;

/**
 * @author Rafael Martin
 *
 */
public class DireccionPrueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instanciar el objeto de la clase dirección
		
		Direccion dir = new Direccion("España", "Carret Norte", 1, "La Laguna");
		
		Aeropuerto airport = new Aeropuerto("TFE Norte", dir, 1930, 300);
		
		System.out.println(airport);
		
		System.out.println(airport.toString());

	}

}
