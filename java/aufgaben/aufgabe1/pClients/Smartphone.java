package aufgaben.aufgabe1.pClients;

public class Smartphone extends Endgeraete implements SMSClient, MailClient {
    public Smartphone(String identNr, String hersteller) {
        super(identNr, hersteller);
    }

    public void sendeSMS(String message) {
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: " + mitteilung);
    }

    public void sendeMail(String message) {
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: " + mitteilung);
    }
}