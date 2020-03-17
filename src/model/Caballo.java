package model;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class Caballo {

	/**
	 * 
	 */
	private String nombreJinete;

	/**
	 * 
	 */
	private String nombreCaballo;

	/**
	 * 
	 */
	private String pista;

	/**
	 * 
	 * @param nombreJinete
	 * @param nombreCaballo
	 * @param pista
	 */
	public Caballo(String nombreJinete, String nombreCaballo, String pista) {
		this.nombreJinete = nombreJinete;
		this.nombreCaballo = nombreCaballo;
		this.pista = pista;
	}

	/**
	 * @return the nombreJinete
	 */
	public String getNombreJinete() {
		return nombreJinete;
	}

	/**
	 * @param nombreJinete the nombreJinete to set
	 */
	public void setNombreJinete(String nombreJinete) {
		this.nombreJinete = nombreJinete;
	}

	/**
	 * @return the nombreCaballo
	 */
	public String getNombreCaballo() {
		return nombreCaballo;
	}

	/**
	 * @param nombreCaballo the nombreCaballo to set
	 */
	public void setNombreCaballo(String nombreCaballo) {
		this.nombreCaballo = nombreCaballo;
	}

}
