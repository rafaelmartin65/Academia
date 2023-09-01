/**
 * 
 */
package com.cga.oop4;



/**
 * @author Rafael Martín
 *
 */
public class AsociacionAeropuertoAvion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		
		Direccion dir = new Direccion("España", "Carret Norte", 1, "La Laguna");
		
		Aeropuerto airport = new Aeropuerto("TFE Norte", dir, 1930, 300);
		
		Avion av1 = new Avion("Boing 747", 390 , 980);
		
		Avion av2 = new Avion("Airbus", 410 , 990);
		
		airport.AniadirAvion(av1);
		airport.AniadirAvion(av2);
		
		
		System.out.println(airport.MostrarAvion());
		
		System.out.println("El número de aviones es: " + airport.getNumAviones());
	}

}
