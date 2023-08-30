/**
 * 
 */
package com.cga.oop2;

/**
 * @author Rafael Martín
 *
 */
public class Avion {

	//Declare argument
	private String modelo;
	private int nAsientos ;
	private double velocidadMaxima;
	
	
	
	// Create Constructors (empty)
	public Avion() {
		this.setModelo("");
		this.setnAsientos(0);
		this.setVelocidadMaxima(0);
	}
	
	// Create Constructors with arguments
	public Avion(String modelo, int nAsientos, double velocidadMaxima) {
		this.setModelo(modelo);
		this.setnAsientos(nAsientos);
		this.setVelocidadMaxima(velocidadMaxima);
	}

	// Create Getters and Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getnAsientos() {
		return nAsientos;
	}

	public void setnAsientos(int nAsientos) {
		this.nAsientos = nAsientos;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	// Create toString method
	@Override
	public String toString() {
		return "Avion [modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	
}
