package model;

import utils.Queue;

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
	private CasaDeApuesta apuestas;

	/**
	 * 
	 */
	private Queue<Caballo> caballos;

	/**
	 * 
	 */
	public Hipodromo() {
		apuestas = new CasaDeApuesta();
		caballos = new Queue<Caballo>();
	}

	/**
	 * 
	 * @param cedula
	 * @param nombre
	 * @param IDCaballo
	 * @param valorApostado
	 * @return retorna true si el registro fue exitoso y false en caso contrario.
	 */
	public boolean registrarApuesta(String cedula, String nombre, int IDCaballo, double valorApostado) {
		Caballo select = caballos.get(IDCaballo);
		return apuestas.agregarApuesta(cedula, nombre, select, valorApostado);

	}

	/**
	 * 
	 * @return
	 */
	public String[] listaNombresCaballos() {

		Caballo[] hourses = caballos.getArray();
		String[] namesHorses = new String[hourses.length];

		for (int i = 0; i < hourses.length; i++)
			namesHorses[i] = hourses[i].getNombreCaballo();

		return namesHorses;

	}

}
