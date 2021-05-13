package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import io.FicheroUsuarios;
import models.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView {

	private JFrame frmLogin;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnRegister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Username");
		txtUsername.setBounds(152, 75, 114, 20);
		frmLogin.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		passwordField.setBounds(152, 119, 114, 20);
		frmLogin.getContentPane().add(passwordField);
		
		btnLogin = new JButton("Login");
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = new String(passwordField.getPassword());
				if(!username.isEmpty() && !password.isEmpty()) {
					Usuario u = new Usuario(username, password);
					if(FicheroUsuarios.login(u)) {
						JOptionPane.showMessageDialog(btnLogin, "Éxito");
					}
					else {
						JOptionPane.showMessageDialog(btnLogin, "Credenciales erróneas");
					}
				} else {
					JOptionPane.showMessageDialog(btnLogin, "Escriba un usuario y una contraseña, beibi.");
				}
			}
		});
		
		btnLogin.setBounds(92, 173, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		btnRegister = new JButton("Registrar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView(frmLogin);
				frmLogin.setVisible(false);
			}
		});
		btnRegister.setBounds(230, 173, 89, 23);
		frmLogin.getContentPane().add(btnRegister);
	}
}
