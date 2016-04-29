package Controller;

import FormBeans.AnnonceurForm;
import Model.Annonceur;
import Model.AnnonceurDao;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NutriciaActionStep1 extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String forward = "success";
        if(request.getParameter("btnstep1") != null){
            forward = "step2";
        }

        return mapping.findForward(forward);
    }
}
