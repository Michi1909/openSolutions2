package aufgaben.aufgabe1.pClients;

public class Notebook extends Endgeraete implements MailClient {
    public Notebook(String identNr, String hersteller) {
        super(identNr, hersteller);
    }

    @Override
    public void sendeMail(String mitteilung) {
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: " + mitteilung +"\n------------------");
    }

}