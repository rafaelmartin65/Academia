/**
 * 
 */
package com.cga.oop4;

import java.util.Calendar;

/**
 * @author Rafael Martín
 *
 */
public class Aeropuerto {
	// Variable final
	private final int MAX_AVIONES = 1;

	// Declare arguments
	private String nombre;
	private Direccion direccion;
	private int anioInauguracion;
	private int capacidad;
	
	// Nuevo atributo
	private Avion[] aviones;
	private int numAviones;
	
	// Constructor
	public Aeropuerto() {

	}
	

	public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
		//super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		
		this.aviones = new Avion [MAX_AVIONES];
		this.numAviones = 0;
	}

	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
		this.nombre = nombre;
		this.direccion = new Direccion(pais, calle, numero, ciudad);
		this.anioInauguracion = anioInauguracion;
		this.capacidad = capacidad;
		
		this.aviones = new Avion [MAX_AVIONES];
		this.numAviones = 0;
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


	public int getNumAviones() {
		return numAviones;
	}


//	public void setNumAviones(int numAviones) {
//		this.numAviones = numAviones;
//	}


	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", direccion=" + direccion.toString() + ", anioInauguracion=" + anioInauguracion
				+ ", capacidad=" + capacidad + "]";
	}

	
	public void AniadirAvion(Avion a) {
		
		try {
			if (numAviones <= MAX_AVIONES) {
				this.aviones[numAviones] = a;
				numAviones++;
				
				
			}else {
				System.out.println("no se puede añadir mas aviones!!! está full...");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("muchos aviones, sólo podemos añadir " + MAX_AVIONES + " error --> " + e.getMessage());
		}
	}

	public String MostrarAvion() {
		String avionesCadena = "";
		
			for (int i = 0; i < numAviones; i++) {
				avionesCadena += this.aviones[i].toString() + "\n";
			}
		
		return avionesCadena;
		
	}
	
	
	
}
