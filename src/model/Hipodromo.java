package model;

import java.util.Random;

import utils.Queue;
import utils.Stack;

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
	private Queue<Caballo> carrera;

	/**
	 * 
	 */
	private Stack<Caballo> stack;
	
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
	 * @param cedula
	 * @return
	 */
	public String buscarRegistro(String cedula) {
		String respuesta = "NO EXISTE UN REGISTRO CON ESA CEDULA";
		RegistroApuesta registroApuesta = apuestas.consultarApuesta(cedula);
		if (registroApuesta != null) {
			respuesta = registroApuesta.toString() + "\nRESULTADO : "
					+ (registroApuesta.getCaballoApostado().getID() == ((Caballo) caballos.get(0)).getID() ? "GANADOR"
							: "PERDEDOR");
		}

		return respuesta;
	}

	/**
	 * 
	 */
	public void simularCorrida() {

		carrera = caballos;

		Object[] hourses = caballos.getArray();

		// 1º método: posición aleatoria
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

	public void revancha() {

		Stack<Caballo> stack = new Stack<Caballo>();

		while (caballos.getSize() > 0)
			stack.push(caballos.pop());

		while (stack.getSize() > 0)
			caballos.add(stack.pop());

		simularCorrida();

	}

	public String[] caballosInicial() {

		String[] array = new String[carrera.getSize()];

		for (int i = 0; i < array.length; i++) {
			Caballo tmp = (Caballo) carrera.get(i);
			array[i] = (i + 1) + ". " + "Caballo  : " + tmp.getNombreCaballo();
		}

		return array;
	}

	public String[] caballosTerminan() {
		String[] array = new String[caballos.getSize()];

		for (int i = 0; i < array.length; i++) {
			Caballo tmp = (Caballo) caballos.get(i);
			array[i] = (i + 1) + ". " + "Caballo : " + tmp.getNombreCaballo();
		}

		return array;
	}

	/**
	 * 
	 * @return
	 */
	public String[] getPodium() {

		String[] array = new String[3];

		for (int i = 0; i < array.length; i++) {
			Caballo tmp = (Caballo) caballos.get(i);
			array[i] = (i + 1) + ". " + "Caballo : " + tmp.getNombreCaballo() + ", Jinete : " + tmp.getNombreJinete();
		}

		return array;
	}

}
