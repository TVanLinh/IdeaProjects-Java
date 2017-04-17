package Model;

import Entity.Sach;

import javax.persistence.EntityManager;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
public class SachIML implements  SachDAO
{
    public boolean insertSach(Sach sach) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        try
        {
            entityManager.getTransaction().begin();
            entityManager.persist(sach);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
    }

    public Sach find(int idSach) {
        return PersistenceUtil.getEntityManager().find(Sach.class,idSach);
    }
}
