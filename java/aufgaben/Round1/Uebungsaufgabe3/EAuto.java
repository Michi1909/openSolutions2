package aufgaben.Round1.Uebungsaufgabe3;

import java.io.Serializable;

public class EAuto extends PKW implements EAutoI{
    @Override
    public void aufladen(String ladeart) {
        System.out.println("\nDas Hybridfahrzeug " + this.getModell()
                + " von " + this.getHersteller()
                + " mit Kennzeichen " + this.getKennzeichen()
                + " lädt " + ladeart + " ! ");
    }
}
