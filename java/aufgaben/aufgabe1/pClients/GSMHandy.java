package aufgaben.aufgabe1.pClients;

public GSMHandy extends
Endgeraet implement
SMSClient,

MailClient {
    public GSMHandy(String identNr, String hersteller) {
        super(identNr, hersteller);
    }
    public void sendeSMS (String mitteilung){
        System.out.println("Identnummer: " + this.getIdentNr() + "\nHersteller: " + this.getHersteller() + "\nMitteilung: " + mitteilung);
    }
}