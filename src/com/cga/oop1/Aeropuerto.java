/**
 * 
 */
package com.cga.oop1;

import java.util.Calendar;

/**
 * @author Rafael Martín
 *
 */
public class Aeropuerto {

	// Declare arguments
	private String nombre;
	private String pais;
	private String calle;
	private int numero;
	private String ciudad;
	private int anioInauguracion;
	private int capacidad;
	
	// Constructor
	public Aeropuerto() {
//		this.nombre = "";
//		this.pais = "";
//		this.calle = "";
//		this.numero = 0;
//		this.ciudad = "";
//		this.anioInauguracion = 0;
//		this.capacidad = 0;	
	}
	
	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
		this.nombre = nombre;
		this.pais = pais;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;	
	}

	//
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
		return "Aeropuerto [nombre=" + nombre + ", pais=" + pais + ", calle=" + calle + ", numero=" + numero
				+ ", ciudad=" + ciudad + ", anoInauguracion=" + anioInauguracion + ", capacidad=" + capacidad + "]";
	}
	
	
	
	
}
