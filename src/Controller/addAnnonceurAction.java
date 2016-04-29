package Controller;

import FormBeans.AnnonceurForm;
import FormBeans.EditeurForm;
import Model.Annonceur;
import Model.AnnonceurDao;
import Model.Editeur;
import Model.EditeurDao;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addAnnonceurAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        AnnonceurForm annonceurForm = (AnnonceurForm) form;
        String societe = annonceurForm.getSociete();
        String raisonSociale = annonceurForm.getRaisonSociale();
        String adresse = annonceurForm.getAdresse();
        String tele = annonceurForm.getTele();

        Annonceur annonceur = new Annonceur(societe,raisonSociale,adresse,tele);

        AnnonceurDao annonceurDao = new AnnonceurDao();
        annonceurDao.addAnnonceur(annonceur);

        return mapping.findForward("success");
    }
}
