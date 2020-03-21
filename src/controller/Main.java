package controller;

import model.Hipodromo;
import utils.InterfaceRegisterHourses;
import view.WindowsRegisterHourses;

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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hipodromo = new Hipodromo();

		InterfaceRegisterHourses interfaceRegisterHourses = new InterfaceRegisterHourses() {

			@Override
			public void registerHourse(String nameHourse, String nameHourseman) {
				// TODO Auto-generated method stub
				hipodromo.registrarCaballo(nameHourse, nameHourseman);
			}

			@Override
			public void finish() {
				// TODO Auto-generated method stub
				System.out.println("Finish()");
			}
		};
		new WindowsRegisterHourses(interfaceRegisterHourses);
	}

}
