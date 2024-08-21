package aufgaben.aufgabe1.pClients;

public class GSMHandy extends Endgeraete implements SMSClient {
    public GSMHandy(String identNr, String hersteller) {
        super(identNr, hersteller);
    }

    @Override
    public void sendSMS(String mitteilung) {
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: "+ mitteilung +"\n------------------");
    }
}