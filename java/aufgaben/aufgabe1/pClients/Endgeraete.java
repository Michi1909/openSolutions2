package aufgaben.aufgabe1.pClients;

public abstract class Endgeraete {
    private String identNr;
    private String hersteller;

    public Endgeraete(String identNr, String hersteller) {
        this.identNr = identNr;
        this.hersteller = hersteller;
    }

    public String getIdentNr() {
        return identNr;
    }

    public String getHersteller() {
        return hersteller;
    }
}