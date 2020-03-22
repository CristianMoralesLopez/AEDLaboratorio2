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

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 */
public class WindowsRegisterBets extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private JLabel lblTime;

	/**
	 * 
	 */
	private JLabel lblTimer;

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
	private int time;

	/**
	 * 
	 * @param registersAction
	 */
	public WindowsRegisterBets(final InterfaceRegisterBet registersAction) {
		setLayout(new GridLayout(6, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

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
				if (validateData()) {
					int bet = Integer.parseInt(txtAmount.getText());
					int ID = optionsHorses.getSelectedIndex();
					registersAction.registerBet(txtId.getText(), txtName.getText(), ID, bet);

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
		add(butFinish);

		lblTime = new JLabel("Tiempo restante : ");
		add(lblTime);

		lblTimer = new JLabel("00:00");
		add(lblTimer);

		time = 180;

		(new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (time > 0) {
					try {
						int minutes = time / 60;
						int seconds = time % 60;
						lblTimer.setText(minutes + ":" + seconds);
						Thread.sleep(990);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					time--;
				}
				registersAction.finish();

			}
		})).start();

		pack();

	}

	/**
	 * 
	 * @return
	 */
	public boolean validateData() {

		try {
			int bet = Integer.parseInt(txtAmount.getText());
			return bet > 0 && !txtId.getText().equals("") && !txtName.getText().equals("");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}
