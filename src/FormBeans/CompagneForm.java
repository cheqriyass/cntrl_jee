package FormBeans;

import org.apache.struts.action.ActionForm;

public class CompagneForm extends ActionForm {
    private String societe;
    private String nomDomaine;
    private String nbrJours;
    private String prixTot;
    private String filtrePrix;

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getNomDomaine() {
        return nomDomaine;
    }

    public void setNomDomaine(String nomDomaine) {
        this.nomDomaine = nomDomaine;
    }

    public String getNbrJours() {
        return nbrJours;
    }

    public void setNbrJours(String nbrJours) {
        this.nbrJours = nbrJours;
    }

    public String getPrixTot() {
        return prixTot;
    }

    public void setPrixTot(String prixTot) {
        this.prixTot = prixTot;
    }

    public String getFiltrePrix() {
        return filtrePrix;
    }

    public void setFiltrePrix(String filtrePrix) {
        this.filtrePrix = filtrePrix;
    }
}
