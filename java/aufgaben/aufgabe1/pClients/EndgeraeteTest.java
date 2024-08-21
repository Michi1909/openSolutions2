package aufgaben.aufgabe1.pClients;

public class EndgeraeteTest {
    public static void main(String[] args) {
        GSMHandy gsmHandy = new GSMHandy("8510", "Nokia");
        Smartphone smartphone = new Smartphone("IPhone 15 Pro Max", "Apple");
        Notebook notebook = new Notebook("X240", "Lenovo");

        testeSMSVersand(gsmHandy);
        testeSMSVersand(smartphone);
        testeMailVersand(smartphone);
        testeMailVersand(notebook);

        gsmHandy.sendeSMS("Test");
        smartphone.sendeSMS("Test");
        smartphone.sendeMail("Test");
        notebook.sendeMail("Test");

        gsmHandy.sendeSMS("This");
        smartphone.sendeSMS("is");
        smartphone.sendeMail("a");
        notebook.sendeMail("Test");

    }

    public static void testeSMSVersand(SMSClient smsClient) {
        smsClient.sendeSMS("Test Mitteilung!");
    }

    public static void testeMailVersand(MailClient mailClient) {
        mailClient.sendeMail("Test Mitteilung!");
    }
}