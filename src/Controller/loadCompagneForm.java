package Controller;

import FormBeans.CompagneForm;
import Model.AnnonceurDao;
import Model.Champ;
import Model.Compagne;
import Model.EditeurDao;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class loadCompagneForm extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        AnnonceurDao annonceurDao = new AnnonceurDao();
        EditeurDao editeurDao = new EditeurDao();

        double prix = 0;

        List<String> societeList = annonceurDao.fingAll();
        List<String> domaineList = null;


        if (form!=null){
//            System.out.println("++++++++++not null");
            String pr = ((CompagneForm)form).getFiltrePrix();
            if (!StringUtils.isBlank(pr)){
                prix = Double.parseDouble(((CompagneForm)form).getFiltrePrix());
                domaineList = editeurDao.findByPrix(prix);
            }else{
//                System.out.println("............. null");
                domaineList = editeurDao.findAll();
            }
        }else{
//            System.out.println("++++++++++ null");
            domaineList = editeurDao.findAll();
        }


        Collection domaines = new ArrayList<Champ>();
        Collection societes = new ArrayList<Champ>();


        for (String st : societeList){
            societes.add(new Champ(st,st));
//            System.out.println("++++++++++"+st);
        }


        for (String st : domaineList){
            String pr = Double.toString(editeurDao.findByNomDomaine(st).getPrixParJour());
            domaines.add(new Champ(st,pr));
//            System.out.println("************"+st);
        }



        request.getSession().setAttribute("domaineList",domaines);
        request.getSession().setAttribute("societeList",societes);
        return mapping.findForward("success");
    }
}
