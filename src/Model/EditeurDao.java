package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class EditeurDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public EditeurDao() {
        emf = Persistence.createEntityManagerFactory("ensam");
        em = emf.createEntityManager();
    }

    public void addEditeur(Editeur editeur) throws Exception {
        try {
            EntityTransaction tr =  em.getTransaction();
            tr.begin();
            em.persist(editeur);
            tr.commit();
        } catch (Exception e) {
            throw e;
        }finally {
            em.close();
        }
    }

    public List<String> findAll(){
        List<String> editeurList = null;

        Query query = em.createQuery("select a.nomDomaine from Editeur a");

        try {
            editeurList = (List<String>) query.getResultList();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            em.close();
        }
        return editeurList;
    }

    public Editeur findByNomDomaine(String nomDomaine){
        Editeur editeur = null;
        Query query = em.createNamedQuery("findEditeurById");
        query.setParameter("nomDomaine",nomDomaine);

        try {
            editeur = (Editeur) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            em.close();
        }
        return editeur;
    }
    public List<String> findByPrix(double prix){
        List<String> editeurs = null;
        Query query = em.createNamedQuery("findEditeurByPrix");
        query.setParameter("prix",prix);

        try {
            editeurs = (List<String>) query.getResultList();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            em.close();
        }
        return editeurs;
    }
}
