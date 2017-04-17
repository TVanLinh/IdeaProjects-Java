package DAO.User;

import Entity.User2;
import Model.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Thanh Ha on 4/1/2017.
 */
public class UserDAOIML implements  UserDAO
{

    public List<User2> getAllUser() {
       String strQuery="from "+User2.class.getName();
       EntityManager entityManager= PersistenceUtil.getEntityManager();
       Query query =entityManager.createQuery(strQuery);
       return  query.getResultList();
    }

    public List<User2> getUser(String name) {
        String strQuery="select  e from User2 e  where e.username = "+name;
        return (List<User2>) PersistenceUtil.getEntityManager().createQuery(strQuery).getResultList();
    }

    public boolean insertUser(User2 user2) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        if(entityManager.find(User2.class,user2.getUsername())!=null)
        {
            System.out.println("Co roi nhe");
            return false;
        }
        entityManager.getTransaction().begin();
        try
        {
            entityManager.persist(user2);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            return false;
        }

    }

    public boolean updateUser(User2 user2) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        try
        {
            entityManager.merge(user2);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            System.out.println("Update not complete");
            return false;
        }
    }

    public boolean deleletUser(User2 user2) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        try
        {
            entityManager.remove(user2);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            System.out.println("Delete not complete");
            e.printStackTrace();
            return false;
        }

    }
}
