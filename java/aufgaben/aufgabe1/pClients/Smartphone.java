package aufgaben.aufgabe1.pClients;

public class Smartphone extends Endgeraete implements SMSClient, MailClient {
    public Smartphone(String identNr, String hersteller) {
        super(identNr, hersteller);
    }
    @Override
    public void sendSMS(String mitteilung) {
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: " + mitteilung +"\n------------------");
    }
    @Override
    public void sendeMail(String mitteilung) {
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: " + mitteilung +"\n------------------");
    }
}