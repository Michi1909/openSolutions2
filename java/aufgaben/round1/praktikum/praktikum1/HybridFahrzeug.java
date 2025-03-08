package aufgaben.round1.praktikum.praktikum1;

public class HybridFahrzeug extends PKW implements VerbrennerI, EAutoI {
    private String modell;
    private String hersteller;
    private String kennzeichen;

    public HybridFahrzeug(String modell, String hersteller, String kennzeichen) {
        this.modell = modell;
        this.hersteller = hersteller;
        this.kennzeichen = kennzeichen;
    }

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

    public String getModell() {
        return modell;
    }
    public void setModell(String modell) {
        this.modell = modell;
    }
    public String getHersteller() {
        return hersteller;
    }
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    public String getKennzeichen() {
        return kennzeichen;
    }
    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
}
