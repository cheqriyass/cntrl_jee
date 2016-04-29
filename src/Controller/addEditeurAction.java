package Controller;

import FormBeans.EditeurForm;
import Model.Editeur;
import Model.EditeurDao;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class addEditeurAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        EditeurForm editeurForm = (EditeurForm) form;
        String nomDomaine = editeurForm.getNomDomaine();
        int indexAlexa = Integer.parseInt(editeurForm.getIndexAlexa());
        int visiteursParMois = Integer.parseInt(editeurForm.getVisiteursParMois());
        double prixParJour = Double.parseDouble(editeurForm.getPrixParJour());
        String emailRespo = editeurForm.getEmailRespo();

        Editeur editeur = new Editeur(nomDomaine, indexAlexa, visiteursParMois, prixParJour, emailRespo);

        EditeurDao editeurDao = new EditeurDao();
        editeurDao.addEditeur(editeur);


        return mapping.findForward("success");
    }




}

