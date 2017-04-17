import entity.User2;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import entity.*;

import java.util.List;

/**
 * Created by Thanh Ha on 3/30/2017.
 */
public class Main
{
    public static void main(String []args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mypersisten");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        //------------------------------
//        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
//        CriteriaQuery<User2> cq=cb.createQuery(User2.class);
//        Root<User2> from = cq.from(User2.class);
//        CriteriaQuery<User2> select =  cq.select(from);
//        TypedQuery<User2> typedQuery = entityManager.createQuery(select);
//        List<User2> resultlist = typedQuery.getResultList();


        String queryString = "from " + User2.class.getName();
        Query query=entityManager.createQuery(queryString);
        List<User2> resultlist = query.getResultList();
        for(User2 user:resultlist)
        {
            System.out.println(user.getUsername());
        }
        //---------------------
        entityManager.close();
    }
}
