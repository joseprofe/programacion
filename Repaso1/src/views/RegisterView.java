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

public class RegisterView {

	private JFrame frmRegistrar;
	private JTextField txtUsername;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	private JFrame parent;
	private JButton btnAtras;
	private JButton btnRegistrar;

	/**
	 * Create the application.
	 */
	public RegisterView() {
		initialize();
	}

	
	 public RegisterView(JFrame parent) { initialize(); this.parent = parent; }
	 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrar = new JFrame();
		frmRegistrar.setTitle("Registrar");
		frmRegistrar.setBounds(100, 100, 450, 300);
		frmRegistrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrar.getContentPane().setLayout(null);

		txtUsername = new JTextField();
		txtUsername.setBounds(104, 47, 166, 20);
		frmRegistrar.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		passwordField1 = new JPasswordField();
		passwordField1.setBounds(104, 93, 166, 20);
		frmRegistrar.getContentPane().add(passwordField1);

		passwordField2 = new JPasswordField();
		passwordField2.setBounds(104, 143, 166, 20);
		frmRegistrar.getContentPane().add(passwordField2);

		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRegistrar.dispose();
				parent.setVisible(true);
			}
		});
		btnAtras.setBounds(46, 203, 89, 23);
		frmRegistrar.getContentPane().add(btnAtras);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String pass1 = new String(passwordField1.getPassword());
				String pass2 = new String(passwordField2.getPassword());

				if (!username.isEmpty() && !pass1.isEmpty() && !pass2.isEmpty()) {
					if (pass1.equals(pass2)) {
						Usuario u = new Usuario(username, pass1);
						FicheroUsuarios.insert(u);
						JOptionPane.showMessageDialog(btnRegistrar, "REGISTRADO");
						frmRegistrar.dispose();
						parent.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(btnRegistrar, "Las contraseñas no coinciden");
					}

				} else {
					JOptionPane.showMessageDialog(btnRegistrar, "Rellena todo beibi");
				}
			}
		});
		btnRegistrar.setBounds(232, 203, 89, 23);
		frmRegistrar.getContentPane().add(btnRegistrar);

		frmRegistrar.setVisible(true);
	}

}
