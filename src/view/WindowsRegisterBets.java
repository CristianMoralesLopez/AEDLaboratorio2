package view;

import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import utils.InterfaceRegisterBet;
import utils.InterfaceRegisterHourses;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class WindowsRegisterBets extends JFrame {

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
	private JLabel lblName;

	/**
	 * 
	 */
	private JTextField txtName;

	/**
	 * 
	 */
	private JLabel lblAmount;

	/**
	 * 
	 */
	private JTextField txtAmount;

	/**
	 * 
	 */
	private JLabel lblHorses;

	/**
	 * 
	 */
	private Choice optionsHorses;

	/**
	 * 
	 */
	private JButton butNext;

	/**
	 * 
	 */
	private JButton butFinish;

	/**
	 * 
	 */
	private int countRegister;

	/**
	 * 
	 * @param registersAction
	 */
	public WindowsRegisterBets(final InterfaceRegisterBet registersAction) {
		setLayout(new GridLayout(5, 2));

		lblId = new JLabel("Cédula : ");
		add(lblId);

		txtId = new JTextField();
		add(txtId);

		lblName = new JLabel("Nombre : ");
		add(lblName);

		txtName = new JTextField();
		add(txtName);

		lblAmount = new JLabel("$$$ : ");
		add(lblAmount);

		txtAmount = new JTextField();
		add(txtAmount);

		lblHorses = new JLabel("Elija su caballo : ");
		add(lblHorses);

		optionsHorses = new Choice();
		String[] names = registersAction.getNamesHorses();
		for (int i = 0; i < names.length; i++)
			optionsHorses.add(names[i]);
		add(optionsHorses);

		butNext = new JButton("Registrar");
		butNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (countRegister < 10)
					if (!txtName.getText().equals("") && !txtId.getText().equals("")) {

					}

			}
		});
		add(butNext);

		butFinish = new JButton("Finalizar");
		butFinish.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				registersAction.finish();
				dispose();

			}
		});
		add(butFinish);

		setVisible(true);
		pack();

	}

}
