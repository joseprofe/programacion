package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeView {

	private JFrame frame;
	private JLabel lblBienvenido;
	private String username;
	
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
		
		frame.setVisible(true);
	}

}
