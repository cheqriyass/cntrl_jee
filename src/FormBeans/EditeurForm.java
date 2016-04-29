package FormBeans;

import Model.EditeurDao;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

public class EditeurForm extends ActionForm {
    private String nomDomaine;
    private String indexAlexa;
    private String visiteursParMois;
    private String prixParJour;
    private String emailRespo;

    public String getNomDomaine() {
        return nomDomaine;
    }

    public void setNomDomaine(String nomDomaine) {
        this.nomDomaine = nomDomaine;
    }

    public String getIndexAlexa() {
        return indexAlexa;
    }

    public void setIndexAlexa(String indexAlexa) {
        this.indexAlexa = indexAlexa;
    }

    public String getVisiteursParMois() {
        return visiteursParMois;
    }

    public void setVisiteursParMois(String visiteursParMois) {
        this.visiteursParMois = visiteursParMois;
    }

    public String getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(String prixParJour) {
        this.prixParJour = prixParJour;
    }

    public String getEmailRespo() {
        return emailRespo;
    }

    public void setEmailRespo(String emailRespo) {
        this.emailRespo = emailRespo;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (StringUtils.isBlank(nomDomaine)) {
            errors.add("nomDomaine",new ActionMessage("required"));
        }else{
            if (!Pattern.matches("www\\.[a-zA-Z0-9][a-zA-Z0-9]*\\.[a-zA-Z0-9][a-zA-Z0-9]*",nomDomaine))
                errors.add("nomDomaine",new ActionMessage("email.invalide"));
            else{
                EditeurDao editeurDao = new EditeurDao();
                if (editeurDao.findByNomDomaine(nomDomaine)!=null)
                    errors.add("nomDomaine",new ActionMessage("email.exist",new String[]{nomDomaine}));
            }
        }

        if (StringUtils.isBlank(emailRespo)) {
            errors.add("emailRespo",new ActionMessage("required"));
        }

        return errors;
    }
}
