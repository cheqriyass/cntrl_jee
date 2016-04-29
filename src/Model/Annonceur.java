package Model;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import javax.persistence.*;

@NamedQuery(name="findAnnonceurBySociete", query = "select a from Annonceur a where a.societe = :societe")
@Entity
public class Annonceur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    private String societe;
    private String raisonSociale;
    private String adresse;
    private String tele;

    public Annonceur() {
    }

    public Annonceur(String societe, String raisonSociale, String adresse, String tele) {
        this.societe = societe;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.tele = tele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
}
