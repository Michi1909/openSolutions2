package aufgaben.aufgabe2.thermometerAnwendung.fkSchicht;

public class Thermometer {
	private double gradInCelsius = 0; // aktuelle Temperatur in Celsius
	private double[] historie = new double[100]; // Speicher für Temperaturwerte
	private int index = 0; // aktueller Index für die Historie

	/**
	 * Setzt den Wert in Celsius.
	 * Wenn der Wert kleiner als -273,15 °C ist, wird eine IllegalArgumentException geworfen.
	 */
	public void setCelsius(double gradInCelsius) throws IllegalArgumentException {
		if (gradInCelsius < -273.15) {
			throw new IllegalArgumentException("Celsius must be greater than -273.15");
		}
		this.gradInCelsius = gradInCelsius;
		addHistorie(gradInCelsius); // Hinzufügen des neuen Wertes zur Historie
	}

	/**
	 * Setzt den Wert in Fahrenheit.
	 * Wenn der Wert kleiner als -459,67 °F ist, wird eine IllegalArgumentException geworfen.
	 */
	public void setFahren(double gradInFahren) throws IllegalArgumentException {
		if (gradInFahren < -459.67) {
			throw new IllegalArgumentException("Fahrenheit must be greater than -459.67");
		}
		this.gradInCelsius = fromFahrenToCelsius(gradInFahren);
		addHistorie(this.gradInCelsius); // Hinzufügen des neuen Wertes zur Historie
	}

	/**
	 * Gibt die aktuelle Temperatur in Celsius zurück.
	 */
	public double getCelsius() {
		return gradInCelsius;
	}

	/**
	 * Gibt die aktuelle Temperatur in Fahrenheit zurück.
	 */
	public double getFahren() {
		return fromCelsiusToFahren(gradInCelsius);
	}

	/**
	 * Fügt einen neuen Temperaturwert zur Historie hinzu.
	 */
	private void addHistorie(double wert) {
		if (index < 100) {
			historie[index++] = wert;
		} else {
			// Wenn das Array voll ist, überschreiben wir die ältesten Werte (Ringpuffer)
			index = 0;
			historie[index++] = wert;
		}
	}

	/**
	 * Gibt die Historie der Temperaturwerte als String zurück.
	 */
	public String getHistorie() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < index; i++) {
			sb.append(historie[i]).append("\n");
		}
		return sb.toString();
	}

	// Private Methode zur Umrechnung von Fahrenheit in Celsius
	private static double fromFahrenToCelsius(double gradInFahren) {
		double celsius = (gradInFahren - 32.0) * 5.0 / 9.0;
		celsius = Math.rint(celsius * 100) / 100.0; // Rundung auf 2 Dezimalstellen
		return celsius;
	}

	// Private Methode zur Umrechnung von Celsius in Fahrenheit
	private static double fromCelsiusToFahren(double gradInCelsius) {
		double fahrenheit = gradInCelsius * 9.0 / 5.0 + 32.0;
		fahrenheit = Math.rint(fahrenheit * 100) / 100.0; // Rundung auf 2 Dezimalstellen
		return fahrenheit;
	}
}
