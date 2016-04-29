package Model;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.*;
import java.util.Properties;

@NamedQueries({
        @NamedQuery(name = "findEditeurById", query = "select a from Editeur a where a.nomDomaine = :nomDomaine"),
        @NamedQuery(name = "findEditeurByPrix", query = "select a.nomDomaine from Editeur a where a.prixParJour<=:prix")
})
@Entity
public class Editeur {
    @Id
    private String nomDomaine;
    private int indexAlexa;
    private int visiteursParMois;
    private double prixParJour;
    private String emailRespo;

    public Editeur() {
    }

    public Editeur(String nomDomaine, int indexAlexa, int visiteursParMois, double prixParJour, String emailRespo) {
        this.nomDomaine = nomDomaine;
        this.indexAlexa = indexAlexa;
        this.visiteursParMois = visiteursParMois;
        this.prixParJour = prixParJour;
        this.emailRespo = emailRespo;
    }

    public String getNomDomaine() {
        return nomDomaine;
    }

    public void setNomDomaine(String nomDomaine) {
        this.nomDomaine = nomDomaine;
    }

    public int getIndexAlexa() {
        return indexAlexa;
    }

    public void setIndexAlexa(int indexAlexa) {
        this.indexAlexa = indexAlexa;
    }

    public int getVisiteursParMois() {
        return visiteursParMois;
    }

    public void setVisiteursParMois(int visiteursParMois) {
        this.visiteursParMois = visiteursParMois;
    }

    public double getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(double prixParJour) {
        this.prixParJour = prixParJour;
    }

    public String getEmailRespo() {
        return emailRespo;
    }

    public void setEmailRespo(String emailRespo) {
        this.emailRespo = emailRespo;
    }

    @PostPersist
    public void pre() {
        System.out.println("********inside post persist");
//        sendEmail(emailRespo);
    }

    void sendEmail(String to) {
        String from = "cheqriyass@gmail.com";
        String password = "";
        String subject = "Test ";
        String body = "Hello World";


        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props, null);

        try {

            Message message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setContent(body, "text/html");

            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", from, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
