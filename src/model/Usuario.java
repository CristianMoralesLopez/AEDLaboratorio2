package model;

public class Usuario {

	private String cedula;
	private String nombre;
	private Caballo caballoApostado;
	private double montoApostado;
	
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
	
}
