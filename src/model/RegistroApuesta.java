package model;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class RegistroApuesta {

	/**
	 * 
	 */
	private String cedula;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	private Caballo caballoApostado;

	/**
	 * 
	 */
	private double montoApostado;

	/**
	 * 
	 * @param cedula
	 * @param nombre
	 * @param caballoApostado
	 * @param montoApostado
	 */
	public RegistroApuesta(String cedula, String nombre, Caballo caballoApostado, double montoApostado) {
		this.caballoApostado = caballoApostado;
		this.cedula = cedula;
		this.montoApostado = montoApostado;
		this.nombre = nombre;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the caballoApostado
	 */
	public Caballo getCaballoApostado() {
		return caballoApostado;
	}

	/**
	 * @param caballoApostado the caballoApostado to set
	 */
	public void setCaballoApostado(Caballo caballoApostado) {
		this.caballoApostado = caballoApostado;
	}

	/**
	 * @return the montoApostado
	 */
	public double getMontoApostado() {
		return montoApostado;
	}

	/**
	 * @param montoApostado the montoApostado to set
	 */
	public void setMontoApostado(double montoApostado) {
		this.montoApostado = montoApostado;
	}

	public String toString() {
		return "CEDULA : " + getCedula() + "\nNOMBRE : " + getNombre() + "\nCABALLO : "
				+ getCaballoApostado().getNombreCaballo() + "\nAPUESTA : " + getMontoApostado();
	}

}
