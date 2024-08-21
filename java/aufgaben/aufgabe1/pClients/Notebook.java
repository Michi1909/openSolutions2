package aufgaben.aufgabe1.pClients;

public class Notebook extends Endgeraete implements SMSClient, MailClient {
    public Notebook(String identNr, String hersteller) {
        super(identNr, hersteller);
    }

    public void sendeMail(String mitteilung) {
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: " + mitteilung);
    }
}