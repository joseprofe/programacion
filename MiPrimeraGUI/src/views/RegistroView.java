package views;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.UsuarioDAO;
import models.Usuario;

public class RegistroView {

	private JFrame frame;
	private JTextField tfUsername;
	private JPasswordField passfield;
	private JPasswordField passfield2;
	private JLabel lblRegistro;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblRepitePassword;
	private JButton btnRegistrar;
	private UsuarioDAO usuarioDAO;
	private JFrame parent;
	private JButton btnBack;

	/**
	 * Create the application.
	 */
	public RegistroView(JFrame loginView) {
		initialize();
		this.usuarioDAO = new UsuarioDAO();
		this.parent = loginView;
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setUIComponents();
		setListeners();
		frame.setVisible(true);
	}

	private void setUIComponents() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblRegistro = new JLabel("Registro de usuarios");
		lblRegistro.setBounds(146, 29, 163, 16);
		frame.getContentPane().add(lblRegistro);

		lblUsername = new JLabel("Username");
		lblUsername.setBounds(57, 83, 110, 16);
		frame.getContentPane().add(lblUsername);

		tfUsername = new JTextField();
		tfUsername.setBounds(179, 78, 130, 26);
		frame.getContentPane().add(tfUsername);
		tfUsername.setColumns(10);

		passfield = new JPasswordField();
		passfield.setBounds(179, 120, 130, 26);
		frame.getContentPane().add(passfield);

		lblPassword = new JLabel("Password");
		lblPassword.setBounds(58, 125, 84, 16);
		frame.getContentPane().add(lblPassword);

		lblRepitePassword = new JLabel("Repite password");
		lblRepitePassword.setBounds(57, 173, 110, 16);
		frame.getContentPane().add(lblRepitePassword);

		passfield2 = new JPasswordField();
		passfield2.setBounds(178, 168, 130, 26);
		frame.getContentPane().add(passfield2);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(109, 228, 117, 29);
		frame.getContentPane().add(btnRegistrar);
		
		btnBack = new JButton("Volver");

		btnBack.setBounds(238, 228, 117, 29);
		frame.getContentPane().add(btnBack);
	}

	private void setListeners() {
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String pass1 = new String(passfield.getPassword());
				String pass2 = new String(passfield2.getPassword());
				String username = tfUsername.getText();

				// Si las contraseñas coinciden
				if (pass1.equals(pass2)) {
					// Comprobar que el username no está ya registrado
					if (!usuarioDAO.comprobarUsername(username)) {
						// Registrar usuario
						Usuario u = new Usuario(username, pass1);
						usuarioDAO.registrarUsuario(u);
						JOptionPane.showMessageDialog(frame, "Usuario registrado!!! :)", "ÉXITO",
								JOptionPane.INFORMATION_MESSAGE);
						parent.setVisible(true);
						frame.dispose();
						
					} else {// El usuario está registrado.
						JOptionPane.showMessageDialog(frame, "El usuario ya existe.", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(frame, "Las contraseñas no coinciden.", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				parent.setVisible(true);
				frame.dispose();				
			}
		});
	}
}
