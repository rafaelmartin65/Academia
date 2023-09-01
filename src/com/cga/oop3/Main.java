/**
 * 
 */
package com.cga.oop3;

/**
 * @author Rafael Martín
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		//New object instance
		Avion avion1 = new Avion();
		
		avion1.setModelo("Boeing 747");
		avion1.setnAsientos(300);
		avion1.setVelocidadMaxima(980);
		
		System.out.println("Avion 1: " + avion1);
		
		//new object instance with arguments
		Avion avion2 = new Avion("Airbus 380", 480, 1025);
		
		System.out.println("Avion 2: " + avion2 + "\n");
		
		//Print airplane 1 model
		System.out.println("El modelo del avion 1 es: " + avion1.getModelo());
		System.out.println("Los asientos del avion 1 son: " + avion1.getnAsientos());
		System.out.println("La velocidad máxima del avion 1 es: " + avion1.getVelocidadMaxima());
		
		
		Aeropuerto aeropuerto = new Aeropuerto("TFE Norte", "España", "carret", 1, "La Laguna", 1930, 180);
		
		System.out.println(aeropuerto);
		
		System.out.println("El aeropuerto " + aeropuerto.getNombre() + " tiene " + aeropuerto.aniosAbierto() + " años operando");
	}

}
