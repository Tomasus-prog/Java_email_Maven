import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SentEmail {
    public static void main(String[] args) throws EmailException {


        Email email = new SimpleEmail();
        email.setHostName("smtp.gazeta.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("tomasus@gazeta.pl", "4102germany"));
        email.setSSLOnConnect(true);
        email.setFrom("tomasus@gazeta.pl");
        email.setSubject("TestMail");
        email.setMsg("To jest wiadomość testowa z projektu Maven :-)");
        email.addTo("tomasus@gazeta.pl");
        System.out.println("Rozpoczęto wysyłanie maila");
        email.send();
        System.out.println("Wiadomość wysłana");
    }
}
