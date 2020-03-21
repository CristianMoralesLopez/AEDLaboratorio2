package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import utils.InterfaceRegisterHourses;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class WindowsRegisterHourses extends JFrame {

	/**
	 * 
	 */
	private JLabel lblNameHourse;

	/**
	 * 
	 */
	private JTextField txtNameHourse;

	/**
	 * 
	 */
	private JLabel lblNameHourseman;

	/**
	 * 
	 */
	private JTextField txtNameHorseman;

//	/**
//	 * 
//	 */
//	private JLabel lblRunway;
//
//	/**
//	 * 
//	 */
//	private JTextField txtRunway;

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
	public WindowsRegisterHourses(final InterfaceRegisterHourses registersAction) {
		setLayout(new GridLayout(3, 2));

		lblNameHourse = new JLabel("Nombre del caballo : ");
		add(lblNameHourse);

		txtNameHourse = new JTextField();
		add(txtNameHourse);

		lblNameHourseman = new JLabel("Nombre del Jinete : ");
		add(lblNameHourseman);

		txtNameHorseman = new JTextField();
		add(txtNameHorseman);

//		lblRunway = new JLabel("Pista : ");
//		add(lblRunway);
//		
//		txtRunway = new JTextField();
//		add(txtRunway);

		butNext = new JButton("Registrar");
		butNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (countRegister < 10)
					if (!txtNameHorseman.getText().equals("") && !txtNameHourse.getText().equals("")) {
						registersAction.registerHourse(txtNameHourse.getText().trim(),
								txtNameHorseman.getText().trim());
						++countRegister;
						if (countRegister == 10)
							butNext.setEnabled(false);
						if (countRegister > 6)
							butFinish.setEnabled(true);

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

			}
		});
		butFinish.setEnabled(false);
		add(butFinish);

		setVisible(true);
		pack();

	}

}
