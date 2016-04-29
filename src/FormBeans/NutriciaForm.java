package FormBeans;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class NutriciaForm extends ActionForm {
    private String poid;
    private String taille;
    private String tele;
    private String adresse;
    private String sex;
    private String step;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getPoid() {
        return poid;
    }

    public void setPoid(String poid) {
        this.poid = poid;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

//        String step = (String)request.getAttribute("step");
        System.out.println("xxxxxxxxxxxStep="+ step);

        if (("1").equals(step)){
            System.out.println("*********Inside step1");
            if (StringUtils.isBlank(poid)) {
                errors.add("poid",new ActionMessage("required"));
            }

            if (StringUtils.isBlank(taille)) {
                errors.add("taille",new ActionMessage("required"));
            }
        }


        if (("2").equals(step)){
            System.out.println("-------------Inside step2");

            if (StringUtils.isBlank(tele)) {
                errors.add("tele",new ActionMessage("required"));
            }

            if (StringUtils.isBlank(adresse)) {
                errors.add("adresse",new ActionMessage("required"));
            }
        }


        return errors;
    }
}
