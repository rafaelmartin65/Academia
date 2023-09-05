/**
 * 
 */
package com.cga.oop4;

/**
 * @author Alumno
 *
 */
public class Direccion {
	// Declare arguments
	
	private String pais;
	private String calle;
	private int numero;
	private String ciudad;
	
	
	// Constructores
	
	public Direccion() {
		
	}
	
	public Direccion(String pais, String calle, int numero, String ciudad ) {
		
		this.pais = pais;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	

	//Getters y Setters
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

	//ToString
	@Override
	public String toString() {
		return "Direccion [pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}
	
	
	
	
	
}
