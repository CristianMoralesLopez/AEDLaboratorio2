/**
 * 
 */
package utils;

/**
 * @author Cristian Alejandro Morales Lopez
 *
 */
public interface InterfaceRegisterBet {

	/**
	 * 
	 * @return
	 */
	public String[] getNamesHorses();

	/**
	 * 
	 * @param id
	 * @param name
	 * @param hourse
	 * @param bet
	 */
	public void registerBet(String id, String name, int hourse, double bet);

	/**
	 * 
	 */
	public void finish();

}
