package aufgaben.aufgabe2.thermometerAnwendung.thermGUI_6;

import javax.swing.*;

//Klasse zum Starten der grafischen Benutzungsoberflaeche
public class ThermometerGUI
{
	public static void main(String[] args)
	{
		// Erzeugen eines benannten Fensters
		JFrame frame = new ThermometerFrame("Thermometer GUI");
		// Fenster sichtbar machen
		frame.setVisible(true);
	}
}

