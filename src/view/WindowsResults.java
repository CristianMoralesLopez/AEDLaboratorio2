package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
	private JLabel banner;

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
	 */
	private JButton butRematch;

	/**
	 * 
	 */
	private JButton butSearch;

	/**
	 * 
	 */
	private JButton butRestart;

	/**
	 * 
	 * @param interfaceResults
	 */
	public WindowsResults(final InterfaceResults interfaceResults) {
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel aux = new JPanel();
		aux.setLayout(new GridLayout(1, 2));

		JPanel aux2 = new JPanel();
		aux2.setBorder(BorderFactory.createTitledBorder("Resultados"));
		listResults = new JList(interfaceResults.getPodium());
		aux2.add(listResults);

		aux.add(aux2);

		aux2 = new JPanel();
		aux2.setBorder(BorderFactory.createTitledBorder("Opciones"));
		aux2.setLayout(new GridLayout(3, 2));

		lblId = new JLabel("Cédula : ");
		aux2.add(lblId);

		txtId = new JTextField();
		aux2.add(txtId);

		butSearch = new JButton("Consultar");
		butSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, interfaceResults.search(txtId.getText()));
				txtId.setText("");
			}
		});
		aux2.add(butSearch);

		butRematch = new JButton("Revancha");
		butRematch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				interfaceResults.remath();
			}
		});
		aux2.add(butRematch);

		butRestart = new JButton("Reiniciar");
		butRestart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				interfaceResults.restart();
			}
		});
		aux2.add(butRestart);

		butFinish = new JButton("Finalizar");
		butFinish.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				interfaceResults.finish();
			}
		});
		aux2.add(butFinish);

		aux.add(aux2);

		banner = new JLabel(new ImageIcon("./data/banner.jpg"));
		add(banner, BorderLayout.NORTH);
		add(aux, BorderLayout.CENTER);
		pack();
	}

}
