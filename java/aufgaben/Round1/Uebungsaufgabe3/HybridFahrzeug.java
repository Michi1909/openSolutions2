package aufgaben.Round1.Uebungsaufgabe3;

public class HybridFahrzeug extends PKW implements VerbrennerI, EAutoI{
    @Override
    public void tanken(String kraftstoff) {
        System.out.println("\nDas Hybridfahrzeug " + this.getModell()
                + " von " + this.getHersteller()
                + " mit Kennzeichen " + this.getKennzeichen()
                + " tankt " + kraftstoff + " ! ");
    }

    @Override
    public void aufladen(String ladeart) {
        System.out.println("\nDas Hybridfahrzeug " + this.getModell()
                + " von " + this.getHersteller()
                + " mit Kennzeichen " + this.getKennzeichen()
                + " lädt " + ladeart + " ! ");
    }
}
