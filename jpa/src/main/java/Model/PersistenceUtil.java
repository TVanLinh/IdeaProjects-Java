package Model;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Thanh Ha on 4/1/2017.
 */
public class PersistenceUtil
{
    private   static final  String NAMEPERSISTEN_UNIT="PersistenceDemo";
    private static EntityManager em;

    public  static EntityManager getEntityManager()
    {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(NAMEPERSISTEN_UNIT).createEntityManager();
        }
        return em;
    }
}
