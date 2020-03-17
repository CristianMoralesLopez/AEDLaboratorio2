package model;

import java.util.HashMap;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class CasaDeApuesta {

	/**
	 * Tiempo limite de apuesta 180.000s ~ 3 minutos
	 */
	public final long TIME = 180000;

	/**
	 * 
	 */
	private HashMap<String, RegistroApuesta> apuestas;

	/**
	 * 
	 */
	private boolean isEnable;

//	/**
//	 * 
//	 */
//	private long time;

	/**
	 * 
	 */
	public CasaDeApuesta() {
		apuestas = new HashMap<String, RegistroApuesta>();
		setEnable(true);
	}

	/**
	 * 
	 * @param registro
	 */
	public void agregarApuesta(RegistroApuesta registro) {
		apuestas.put(registro.getCedula(), registro);
	}

	/**
	 * 
	 * @param registro
	 */
	public boolean agregarApuesta(String cedula, String nombre, Caballo apostado, double valorApostado) {
		RegistroApuesta registro = new RegistroApuesta(cedula, nombre, apostado, valorApostado);
		if (apuestas.get(cedula) == null) {
			agregarApuesta(registro);
			return true;
		} else
			return false;
	}

	/**
	 * 
	 * @param cedula
	 * @return
	 */
	public RegistroApuesta consultarApuesta(String cedula) {
		return apuestas.get(cedula);
	}

	/**
	 * @return the isEnable
	 */
	public boolean isEnable() {
		return isEnable;
	}

	/**
	 * @param isEnable the isEnable to set
	 */
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

}
