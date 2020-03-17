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
	public static final String NAME = "El indomable Spirit";
	
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
	 * @param cedula
	 * @param nombre
	 * @param IDCaballo
	 * @param valorApostado
	 * @return retorna true si el registro fue exitoso y false en caso contrario.
	 */
	public boolean registrarApuesta(String cedula, String nombre, int IDCaballo, double valorApostado ) {
		
		Caballo select = caballos.get(IDCaballo);
		return apuestas.agregarApuesta(cedula, nombre, select, valorApostado);
		
	}

}
