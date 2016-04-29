package Controller;

import FormBeans.CompagneForm;
import Model.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addCompagneAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        CompagneForm compagneForm = (CompagneForm) form;
        String societe = compagneForm.getSociete();
        String nomDomaine = compagneForm.getNomDomaine();
        int nbrJours = Integer.parseInt(compagneForm.getNbrJours());
        double prixTot = Double.parseDouble(compagneForm.getPrixTot());

        AnnonceurDao annonceurDao = new AnnonceurDao();
        Annonceur annonceur = annonceurDao.findBySociete(societe);

        EditeurDao editeurDao = new EditeurDao();
        Editeur editeur = editeurDao.findByNomDomaine(nomDomaine);

        Compagne compagne = new Compagne(annonceur,editeur,nbrJours,prixTot);

        CompagneDao compagneDao = new CompagneDao();
        compagneDao.addCompagne(compagne);

        return mapping.findForward("success");
    }
}
