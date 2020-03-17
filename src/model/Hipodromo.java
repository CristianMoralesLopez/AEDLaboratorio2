package model;

import utils.Cola;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class Hipodromo {
	
	/**
	 * Default name of racecourse
	 */
	public static final String NAME = "El idomable Spirit";
	
	/**
	 * 
	 */
	private Apuestas apuestas;
	
	/**
	 * 
	 */
	private Cola<Caballo> caballos;
	
	/**
	 * 
	 */
	public Hipodromo() {
		apuestas = new Apuestas();
		caballos = new Cola<Caballo>();
	}
	
	/**
	 * 
	 */
	public void registrarApuesta(String cedula, String nombre, int IDCaballo, double valorApostado ) {
		
		Caballo select = caballos.get(IDCaballo);
		
		
	}

}
