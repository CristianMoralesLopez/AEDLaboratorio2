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
	public static final String DEFAULT = "default";

	/**
	 * 
	 */
	private int ID;
	
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
	public Caballo(String nombreJinete, String nombreCaballo, String pista, int ID) {
		this.nombreJinete = nombreJinete;
		this.nombreCaballo = nombreCaballo;
		this.ID = ID;
		this.setPista(pista);
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

	/**
	 * @return the pista
	 */
	public String getPista() {
		return pista;
	}

	/**
	 * @param pista the pista to set
	 */
	public void setPista(String pista) {
		this.pista = pista;
	}

}
