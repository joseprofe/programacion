package views;

import java.awt.Font;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JLabel;

import io.FicheroWeather;
import models.Weather;

public class WelcomeView {

	private JFrame frame;

	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public WelcomeView() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFecha = new JLabel("New label");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFecha.setBounds(56, 11, 268, 87);
		frame.getContentPane().add(lblFecha);
		
		JLabel lblEstado = new JLabel("New label");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstado.setBounds(56, 70, 268, 87);
		frame.getContentPane().add(lblEstado);
		
		JLabel lblMax = new JLabel("New label");
		lblMax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMax.setBounds(56, 129, 99, 87);
		frame.getContentPane().add(lblMax);
		
		JLabel lblMin = new JLabel("New label");
		lblMin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMin.setBounds(166, 129, 99, 87);
		frame.getContentPane().add(lblMin);
		
		Weather w = FicheroWeather.leerTiempo();
		if(w != null) {
			lblFecha.setText(w.getFecha());
			lblEstado.setText(w.getEstado());
			lblMin.setText(String.valueOf(w.getMin()));
			lblMax.setText(String.valueOf(w.getMax()));
		} else {
			lblFecha.setText("No hay predicción para hoy.");
			lblEstado.setVisible(false);
			lblMin.setVisible(false);
			lblMax.setVisible(false);
		}
		
		frame.setVisible(true);
	}
}
