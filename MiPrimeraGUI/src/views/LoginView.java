package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.LoginDAO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Color;

public class LoginView {

	private JFrame frame;
	private JTextField tfUsername;
	private JPasswordField passwordField;
	private JLabel lblUsername;
	private JButton btnLogin;
	private JLabel lblPassword;
	private JLabel lblBienvenido;
	private LoginDAO loginDAO;
	private JLabel lblRegistro;

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		loginDAO = new LoginDAO();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		setUIComponents();
		setListeners();
		
		//Esto siempre lo último.
		frame.setVisible(true);
	}
	
	private void setUIComponents() {
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(102, 101, 84, 16);
		frame.getContentPane().add(lblUsername);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(159, 191, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		tfUsername = new JTextField();
		tfUsername.setBounds(204, 96, 130, 26);
		frame.getContentPane().add(tfUsername);
		tfUsername.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(102, 141, 61, 16);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();

		passwordField.setBounds(204, 134, 130, 26);
		frame.getContentPane().add(passwordField);
		
		lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblBienvenido.setBounds(159, 37, 220, 52);
		frame.getContentPane().add(lblBienvenido);
		
		lblRegistro = new JLabel("¿No estás registrado aún? Pulsa aquí para registrarte");
		lblRegistro.setForeground(Color.BLUE);

		lblRegistro.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblRegistro.setBounds(47, 232, 364, 29);
		frame.getContentPane().add(lblRegistro);
	}
	
	private void setListeners() {
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginPressed();
			}
		});

		KeyAdapter comportamientoLogin = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//Si ha pulsado el enter
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					loginPressed();
				}
			}
		};
		
		passwordField.addKeyListener(comportamientoLogin);		
		tfUsername.addKeyListener(comportamientoLogin);
		
		//REGISTRO
		lblRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new RegistroView(frame);
				frame.setVisible(false);
			}
		});
	}
	
	private void loginPressed() {
		String username = tfUsername.getText();
		String password = new String(passwordField.getPassword());
		
		if(loginDAO.login(username, password)) {
			new WelcomeView(username);
			frame.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(frame, "Login INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
