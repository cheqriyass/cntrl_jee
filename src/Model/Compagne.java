package Model;

import javax.persistence.*;

@Entity
public class Compagne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Annonceur annonceur;
    @OneToOne
    private Editeur editeur;
    private int nbrJours;
    private double prixTot;


    public Compagne() {
    }

    public Compagne(Annonceur annonceur, Editeur editeur, int nbrJours, double prixTot) {
        this.annonceur = annonceur;
        this.editeur = editeur;
        this.nbrJours = nbrJours;
        this.prixTot = prixTot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Annonceur getAnnonceur() {
        return annonceur;
    }

    public void setAnnonceur(Annonceur annonceur) {
        this.annonceur = annonceur;
    }

    public Editeur getEditeur() {
        return editeur;
    }

    public void setEditeur(Editeur editeur) {
        this.editeur = editeur;
    }

    public int getNbrJours() {
        return nbrJours;
    }

    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }

    public double getPrixTot() {
        return prixTot;
    }

    public void setPrixTot(double prixTot) {
        this.prixTot = prixTot;
    }
}
