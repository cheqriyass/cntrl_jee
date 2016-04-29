package Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompagneDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public CompagneDao() {
        emf = Persistence.createEntityManagerFactory("ensam");
        em = emf.createEntityManager();
    }

    public void addCompagne(Compagne compagne) throws Exception {
        try {
            EntityTransaction tr =  em.getTransaction();
            tr.begin();
            em.persist(compagne);
            tr.commit();
        } catch (Exception e) {
            throw e;
        }
    }
}
