package aufgaben.round1.uebungsaufgaben.uebungsaufgabe3;

public class EAuto extends PKW implements EAutoI{
    @Override
    public void aufladen(String ladeart) {
        System.out.println("\nDas Hybridfahrzeug " + this.getModell()
                + " von " + this.getHersteller()
                + " mit Kennzeichen " + this.getKennzeichen()
                + " lädt " + ladeart + " ! ");
    }
}
