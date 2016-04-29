package Model;

import javax.persistence.*;
import java.util.List;

public class AnnonceurDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public AnnonceurDao() {
        emf = Persistence.createEntityManagerFactory("ensam");
        em = emf.createEntityManager();
    }

    public void addAnnonceur(Annonceur annonceur) throws Exception {
        try {
            EntityTransaction tr =  em.getTransaction();
            tr.begin();
            em.persist(annonceur);
            tr.commit();
        } catch (Exception e) {
            throw e;
        }finally {
            em.close();
        }
    }

    public List<String> fingAll(){
        List<String> annonceurList = null;

        Query query = em.createQuery("select a.societe from Annonceur a");

        try {
            annonceurList = (List<String>) query.getResultList();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            em.close();
        }
        return annonceurList;
    }


    public Annonceur findBySociete(String societe){
        Annonceur annonceur = null;
        Query query = em.createNamedQuery("findAnnonceurBySociete");
        query.setParameter("societe",societe);

        try {
            annonceur = (Annonceur) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            em.close();
        }
        return annonceur;
    }
}
