package aufgaben.aufgabe2.thermometerAnwendung.thermGUI_6;

import aufgaben.aufgabe2.thermometerAnwendung.fkSchicht.Thermometer;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ThermometerFrame extends JFrame {
	private Thermometer model = new Thermometer();

	// Instanzvariablen - Verweise auf Komponenten des GUI
	private JTextField fahrenField = new JTextField(); // Anzeige Grad F
	private JTextField celsiusField = new JTextField(); // Anzeige Grad C
	private JButton celsiusPlusButton = new JButton(); // Schaltfläche
	private JButton celsiusMinusButton = new JButton(); // Schaltfläche
	private JTextArea historieTxtArea = new JTextArea(""); // Anzeige der Temperaturhistorie
	private JScrollPane scrollPaneTxtArea = new JScrollPane(historieTxtArea); // Scrollpane für die Historie
	private JButton orderNormalButton = new JButton("Historie"); // Button für Historie
	private JButton orderReverseButton = new JButton("Historie umgekehrt"); // Button für Historie umgekehrt

	private boolean reverseOrder = false; // Status der Anzeige der Reihenfolge

	public ThermometerFrame(String title) {
		// Eigenschaften des Frames festlegen
		setTitle(title);
		setSize(430, 350); // Platz für die JTextArea und Buttons berücksichtigen

		// Layout des Fensters setzen
		setLayout(new GridLayout(5, 2, 10, 10)); // 5 Zeilen, da wir zwei Buttons hinzufügen

		// Fahrenheit-Komponenten
		JLabel fahrenFuehrungstext = new JLabel("Fahrenheit");
		fahrenFuehrungstext.setFont(new Font("Dialog", Font.BOLD, 12));
		add(fahrenFuehrungstext);
		add(fahrenField);
		fahrenField.setText("" + model.getFahren());
		ActionListener cfl = new CelsiusFahrenheitListener();
		fahrenField.addActionListener(cfl);

		// Celsius-Komponenten
		JLabel celsiusFuehrungstext = new JLabel("Celsius");
		celsiusFuehrungstext.setFont(new Font("Dialog", Font.BOLD, 12));
		add(celsiusFuehrungstext);
		add(celsiusField);
		celsiusField.setText("" + model.getCelsius());
		celsiusField.addActionListener(cfl);

		// Plus- und Minus-Buttons
		celsiusPlusButton.setLabel("Celsius + 1");
		add(celsiusPlusButton);
		celsiusPlusButton.addActionListener(new CelsiusPlusListener());

		celsiusMinusButton.setLabel("Celsius - 1");
		add(celsiusMinusButton);
		celsiusMinusButton.addActionListener(new CelsiusMinusListener());

		// Buttons zur Umschaltung der Historienanzeige
		add(orderNormalButton);
		orderNormalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reverseOrder = false; // Setze auf normale Reihenfolge
				updateHistorie(); // Historie aktualisieren
			}
		});

		add(orderReverseButton);
		orderReverseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reverseOrder = true; // Setze auf umgekehrte Reihenfolge
				updateHistorie(); // Historie aktualisieren
			}
		});

		// Historie-Komponente
		historieTxtArea.setEditable(false); // JTextArea ist nicht editierbar
		add(scrollPaneTxtArea); // JScrollPane wird dem Frame hinzugefügt

		addWindowListener(new WindowCloser());
	}

	// Listener für Celsius und Fahrenheit
	class CelsiusFahrenheitListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if (evt.getSource() == celsiusField) {
				try {
					double celsius = Double.parseDouble(celsiusField.getText());
					model.setCelsius(celsius);
					fahrenField.setText("" + model.getFahren());
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(celsiusField, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
				}
			}

			if (evt.getSource() == fahrenField) {
				try {
					double fahrenheit = Double.parseDouble(fahrenField.getText());
					model.setFahren(fahrenheit);
					celsiusField.setText("" + model.getCelsius());
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(fahrenField, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
				}
			}

			updateHistorie(); // Historie aktualisieren
		}
	}

	// Methode zum Aktualisieren der Temperaturhistorie
	private void updateHistorie() {
		String historie = model.getHistorie();
		if (reverseOrder) {
			historie = reverseHistorie(historie); // Historie in umgekehrter Reihenfolge
		}
		historieTxtArea.setText(historie); // Historie in JTextArea anzeigen
	}

	// Methode zum Umkehren der Historie
	private String reverseHistorie(String historie) {
		String[] lines = historie.split("\n");
		StringBuilder sb = new StringBuilder();
		for (int i = lines.length - 1; i >= 0; i--) {
			sb.append(lines[i]).append("\n");
		}
		return sb.toString();
	}

	// Listener für Celsius-Plus-Button
	class CelsiusPlusListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			model.setCelsius(model.getCelsius() + 1);
			celsiusField.setText("" + model.getCelsius());
			fahrenField.setText("" + model.getFahren());
			updateHistorie(); // Historie aktualisieren
		}
	}

	// Listener für Celsius-Minus-Button
	class CelsiusMinusListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			model.setCelsius(model.getCelsius() - 1);
			celsiusField.setText("" + model.getCelsius());
			fahrenField.setText("" + model.getFahren());
			updateHistorie(); // Historie aktualisieren
		}
	}

	// Schließt das Fenster
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}
}
