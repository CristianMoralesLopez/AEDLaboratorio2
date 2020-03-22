package model;

import java.util.Random;

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
	 * @param nameHourse
	 * @param nameHourseman
	 * @return
	 */
	public void registrarCaballo(String nameHourse, String nameHourseman) {
		Caballo caballo = new Caballo(nameHourseman, nameHourse, Caballo.DEFAULT, caballos.getSize());
		caballos.add(caballo);
	}

	/**
	 * 
	 * @return
	 */
	public String[] listaNombresCaballos() {

		Object[] hourses = caballos.getArray();
		String[] namesHorses = new String[hourses.length];

		for (int i = 0; i < hourses.length; i++) {
			Caballo tmp = (Caballo) hourses[i];
			namesHorses[i] = "Caballo : " + tmp.getNombreCaballo() + ", Jinete : " + tmp.getNombreJinete();
		}

		return namesHorses;

	}

	/**
	 * 
	 */
	public void simularCorrida() {

		Object[] hourses = caballos.getArray();

		// 1� m�todo: posici�n aleatoria
		for (int i = 0; i < hourses.length; i++) {
			int posAleatoria = (new Random()).nextInt(hourses.length);
			Object temp = hourses[i];
			hourses[i] = hourses[posAleatoria];
			hourses[posAleatoria] = temp;
		}

		caballos = new Queue<Caballo>();
		for (int i = 0; i < hourses.length; i++)
			caballos.add((Caballo) hourses[i]);

	}

}
