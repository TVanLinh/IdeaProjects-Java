package Model;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
public class PersistenceUtil
{
    private   static final  String NAMEPERSISTEN="csdlsach";
    private static EntityManager entityManager;

    public  static  EntityManager getEntityManager()
    {
        if(entityManager!=null)
        {
            return entityManager;
        }
        return (entityManager=Persistence.createEntityManagerFactory(NAMEPERSISTEN).createEntityManager());
    }
}
