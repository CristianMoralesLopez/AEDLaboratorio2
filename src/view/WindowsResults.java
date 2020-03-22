package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.prism.Image;

import utils.InterfaceResults;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class WindowsResults extends JFrame {

	/**
	 * 
	 */
	private Image banner;

	/**
	 * 
	 */
	private JList<String> listResults;

	/**
	 * 
	 */
	private JLabel lblId;

	/**
	 * 
	 */
	private JTextField txtId;

	/**
	 * 
	 */
	private JButton butFinish;

	/**
	 * 
	 * @param interfaceResults
	 */
	public WindowsResults(InterfaceResults interfaceResults) {
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel aux = new JPanel();
		aux.setLayout(new GridLayout(1, 1));

	}

}
