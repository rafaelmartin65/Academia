/**
 * 
 */
package com.cga.oop2;

import javax.swing.JOptionPane;

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
		
		String modelo = JOptionPane.showInputDialog("Por favor ingresa el modelo del avión");
		String nAsientos = JOptionPane.showInputDialog("Por favor ingresa el número de asientos");
		String velocidadMaxima = JOptionPane.showInputDialog("Por favor ingresa la velocidad máxima");
		
		avion1.setModelo(modelo);
		avion1.setnAsientos(Integer.parseInt(nAsientos));
		avion1.setVelocidadMaxima(Integer.parseInt(velocidadMaxima));
		
		System.out.println("Avion 1: " + avion1);
		
		//new object instance with arguments
		Avion avion2 = new Avion("Airbus 380", 480, 1025);
		
		System.out.println("Avion 2: " + avion2 + "\n");
		
		//Print airplane 1 model
		JOptionPane.showMessageDialog(null, avion1.getModelo() + avion1.getnAsientos() + avion1.getVelocidadMaxima());
		
		System.out.println("El modelo del avion 1 es: " + avion1.getModelo());
		System.out.println("Los asientos del avion 1 son: " + avion1.getnAsientos());
		System.out.println("La velocidad máxima del avion 1 es: " + avion1.getVelocidadMaxima());
		
		
		Aeropuerto aeropuerto = new Aeropuerto("TFE Norte", "España", "carret", 1, "La Laguna", 1930, 180);
		
		System.out.println(aeropuerto);
		
		System.out.println("El aeropuerto " + aeropuerto.getNombre() + " tiene " + aeropuerto.aniosAbierto() + " años operando");
	}

}
