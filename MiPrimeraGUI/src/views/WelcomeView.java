package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class WelcomeView {

	private JFrame frame;
	private JLabel lblBienvenido;
	private String username;
	private JMenuBar barritaMenu;
	private JMenu menuAcciones;
	private JMenuItem opcMenuSaludar;
	private JMenuItem opcMenuSalir;
	
	/**
	 * Create the application.
	 */
	public WelcomeView(String username) {
		this.username = username;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 400, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setForeground(Color.RED);
		lblBienvenido.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblBienvenido.setBounds(177, 126, 186, 16);
		frame.getContentPane().add(lblBienvenido);
		
		lblBienvenido.setText("Bienvenido "+ this.username);
		
		//Creo la barrita de menu de arriba y lo coloco y le tamaño.
		barritaMenu = new JMenuBar();
		barritaMenu.setLocation(0, 0);
		barritaMenu.setSize(105, 22);
		frame.getContentPane().add(barritaMenu);
		
		//Creo el menu desplegable y lo añado a la barrita del menu.
		menuAcciones = new JMenu("Acciones");
		barritaMenu.add(menuAcciones);
		
		//Creo las opciones y se las añado al menú correspondiente.
		opcMenuSaludar = new JMenuItem("Saluda beibi");
		
		opcMenuSalir = new JMenuItem("Adiós");

		menuAcciones.add(opcMenuSaludar);
		menuAcciones.add(new JSeparator());
		menuAcciones.add(opcMenuSalir);
		
		//Pongo los listeners a cada componente
		setListeners();
		frame.setVisible(true);
	}
	
	public void setListeners(){
		
		opcMenuSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Hola bebesito " + username);
			}
			
		});
		

		opcMenuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Adiós bebesito " + username);
				frame.dispose();
				System.exit(0);
			}
		});

	}
}
