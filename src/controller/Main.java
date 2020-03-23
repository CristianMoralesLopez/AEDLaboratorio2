package controller;

import model.Hipodromo;
import utils.InterfaceRegisterBet;
import utils.InterfaceRegisterHourses;
import utils.InterfaceResults;
import view.WindowsRegisterBets;
import view.WindowsRegisterHourses;
import view.WindowsResults;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class Main {

	/**
	 * 
	 */
	private static Hipodromo hipodromo;

	/**
	 * 
	 */
	private static InterfaceRegisterHourses interfaceRegisterHourses;

	/**
	 * 
	 */
	private static InterfaceRegisterBet interfaceRegisterBet;

	/**
	 * 
	 */
	private static InterfaceResults interfaceResults;

	/**
	 * 
	 */
	private static WindowsRegisterHourses windowsRegisterHourses;

	/**
	 * 
	 */
	private static WindowsRegisterBets windowsRegisterBets;

	/**
	 * 
	 */
	private static WindowsResults windowsResults;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hipodromo = new Hipodromo();

		interfaceResults = new InterfaceResults() {

			@Override
			public void finish() {
				// TODO Auto-generated method stub
				windowsResults.dispose();

			}

			@Override
			public void restart() {
				// TODO Auto-generated method stub
				hipodromo = new Hipodromo();
				windowsResults.dispose();
				windowsRegisterHourses = new WindowsRegisterHourses(interfaceRegisterHourses);
				windowsRegisterHourses.setVisible(true);

			}

			@Override
			public String search(String id) {
				// TODO Auto-generated method stub
				return hipodromo.buscarRegistro(id);
			}

			@Override
			public void remath() {
				// TODO Auto-generated method stub
				hipodromo.revancha();
				windowsResults.dispose();
				windowsResults = new WindowsResults(this);
				windowsResults.setVisible(true);

			}

			@Override
			public String[] getPodium() {
				// TODO Auto-generated method stub
				return hipodromo.getPodium();
			}

			@Override
			public String[] getResults() {
				// TODO Auto-generated method stub
				return hipodromo.caballosTerminan();
			}

			@Override
			public String[] getStarted() {
				// TODO Auto-generated method stub
				return hipodromo.caballosInicial();
			}
		};

		interfaceRegisterBet = new InterfaceRegisterBet() {

			@Override
			public String[] getNamesHorses() {
				// TODO Auto-generated method stub
				return hipodromo.listaNombresCaballos();
			}

			@Override
			public void finish() {
				// TODO Auto-generated method stub
				hipodromo.simularCorrida();
				windowsResults = new WindowsResults(interfaceResults);
				windowsRegisterBets.dispose();
				windowsResults.setVisible(true);
			}

			@Override
			public void registerBet(String id, String name, int hourse, double bet) {
				// TODO Auto-generated method stub
				hipodromo.registrarApuesta(id, name, hourse, bet);
			}
		};

		interfaceRegisterHourses = new InterfaceRegisterHourses() {

			@Override
			public void registerHourse(String nameHourse, String nameHourseman) {
				// TODO Auto-generated method stub
				hipodromo.registrarCaballo(nameHourse, nameHourseman);
			}

			@Override
			public void finish() {
				// TODO Auto-generated method stub
				windowsRegisterBets = new WindowsRegisterBets(interfaceRegisterBet);
				windowsRegisterHourses.dispose();
				windowsRegisterBets.setVisible(true);
			}
		};

		windowsRegisterHourses = new WindowsRegisterHourses(interfaceRegisterHourses);
		windowsRegisterHourses.setVisible(true);
	}

}
