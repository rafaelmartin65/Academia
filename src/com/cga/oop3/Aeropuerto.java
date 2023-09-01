/**
 * 
 */
package com.cga.oop3;

import java.util.Calendar;

/**
 * @author Rafael Martín
 *
 */
public class Aeropuerto {

	// Declare arguments
	private String nombre;
	private Direccion direccion;
	private int anioInauguracion;
	private int capacidad;
	
	// Constructor
	public Aeropuerto() {

	}
	

	public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
		//super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
	}

	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
		this.nombre = nombre;
		this.direccion = new Direccion(pais, calle, numero, ciudad);
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
	}

	//Calcular años operativo
	public int aniosAbierto() {
		
		// obtain actual year
		int anioActual = Calendar.getInstance().get(Calendar.YEAR);
		int anios = anioActual - anioInauguracion ;
		
		return anios;
		
	}
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAnoInauguracion() {
		return anioInauguracion;
	}

	public void setAnoInauguracion(int anoInauguracion) {
		this.anioInauguracion = anoInauguracion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", anioInauguracion=" + anioInauguracion + ", capacidad=" + capacidad
				+ "]";
	}


	
	
	
	
}
