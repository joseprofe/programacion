package Tema8;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class conversorGraficoMejorado {

	// Variables del display del conversor
	JFrame windows;
	JPanel conversionPanel, numberPanel;
	JLabel titleLabel, baseFromLabel, numberLabel, baseToLabel, resultLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
	JButton conversionButton;
	JComboBox<String> baseFrom, baseTo;
	ChoiceHandler choiceHandler = new ChoiceHandler();
	JTextField number;
	JTextField result;

	public static void main(String[] args) {
		new conversorGraficoMejorado();
	}

	public conversorGraficoMejorado() {

		windows = new JFrame("Super Conversor");
		windows.setSize(800, 600);
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windows.setLocationRelativeTo(null);
		conversionPanel = new JPanel(new GridBagLayout());
		windows.setContentPane(conversionPanel);

		// Titulo del programa
		titleLabel = new JLabel("Conversor");
		titleLabel.setFont(titleFont);
		addItem(conversionPanel, titleLabel, 0, 0, 1, 1, GridBagConstraints.PAGE_START);

		// Eleccion de base
		baseFromLabel = new JLabel("<html><p>Elija la base en la que esta su numero</p></html>");
		baseFromLabel.setFont(normalFont);
		addItem(conversionPanel, baseFromLabel, 0, 1, 1, 1, GridBagConstraints.WEST);
		baseFrom = new JComboBox<String>();
		baseFrom.addItem("Binario");
		baseFrom.addItem("Octal");
		baseFrom.addItem("Decimal");
		baseFrom.addItem("Hexadecimal");
		baseFrom.setPreferredSize(new Dimension(200, 25));
		addItem(conversionPanel, baseFrom, 0, 1, 1, 1, GridBagConstraints.EAST);
		// Poner numero de base
		numberLabel = new JLabel("<html><p>Escriba su numero</p></html>");
		numberLabel.setFont(normalFont);
		addItem(conversionPanel, numberLabel, 0, 2, 1, 1, GridBagConstraints.WEST);
		number = new JTextField();
		number.setPreferredSize(new Dimension(200, 25));
		addItem(conversionPanel, number, 0, 2, 1, 1, GridBagConstraints.EAST);
		// Eleccion de base
		baseToLabel = new JLabel("<html><p>Elija la base a la que quiere pasar su numero</p></html>");
		baseToLabel.setFont(normalFont);
		addItem(conversionPanel, baseToLabel, 0, 3, 1, 1, GridBagConstraints.WEST);
		baseTo = new JComboBox<String>();
		baseTo.addItem("Binario");
		baseTo.addItem("Octal");
		baseTo.addItem("Decimal");
		baseTo.addItem("Hexadecimal");
		baseTo.setPreferredSize(new Dimension(200, 25));
		addItem(conversionPanel, baseTo, 0, 3, 1, 1, GridBagConstraints.EAST);
		// Resultado
		resultLabel = new JLabel("<html><p>Resultado:</p></html>");
		resultLabel.setFont(normalFont);
		addItem(conversionPanel, resultLabel, 0, 4, 1, 1, GridBagConstraints.WEST);
		result = new JTextField();
		result.setPreferredSize(new Dimension(200, 25));
		addItem(conversionPanel, result, 0, 4, 1, 1, GridBagConstraints.EAST);
		// Parte del boton de conversor
		conversionButton = new JButton("Convertir");
		conversionButton.setFont(normalFont);
		conversionButton.addActionListener(choiceHandler);
		addItem(conversionPanel, conversionButton, 0, 5, 1, 1, GridBagConstraints.CENTER);
		windows.setVisible(true);
	}

	private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
		gc.weightx = 100.0;
		gc.weighty = 100.0;
		gc.insets = new Insets(5, 5, 5, 5);
		gc.anchor = align;
		gc.fill = GridBagConstraints.NONE;
		p.add(c, gc);
	}

	// Clase para hacer la accion del boton
	public class ChoiceHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			Conversor();
		}
	}

	public void Conversor() {
		String numberString = number.getText();
		int baseFromString = Base((String) baseFrom.getSelectedItem());
		int baseToString = Base((String) baseTo.getSelectedItem());
		if (Validador(numberString, baseFromString)) {
			result.setText(
					Integer.toString(Integer.parseInt(numberString, baseFromString), baseToString).toUpperCase());
		} else {
			JOptionPane.showMessageDialog(null, "Error, no ha escrito un numero valido");
		}

	}

	private int Base(String base) {
		switch (base) {
		case "Binario":
			return 2;
		case "Octal":
			return 8;
		case "Decimal":
			return 10;
		case "Hexadecimal":
			return 16;
		}
		return 0;
	}

	private boolean Validador(String number, int base) {
		try {
			Integer.parseInt(number, base);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}