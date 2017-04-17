package model;

import entity.User2;
import  java.util.*;
import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 * Created by Thanh Ha on 3/30/2017.
 */
public class UserModel
{
    public  UserModel(){}

    public List<User2> getALlUser()
    {
        EntityManager em = PersitencetUtil.getEntityManager();
        em.getTransaction();
        List<User2> users=null;
        Query query = em.createQuery("from " + User2.class.getName());
        users = query.getResultList();
        em.close();
        return users;
    }

    public  List<String>  getUserNames()
    {
        String strQuery="select e.username from "+User2.class.getName()+" e order by e.username ASC";
        EntityManager em = PersitencetUtil.getEntityManager();
        em.getTransaction();
        Query query=em.createQuery(strQuery);
        return (List<String>) query.getResultList();
    }

    public List<User2> getUser(String user)
    {
        String strQuery="from "+User2.class.getName()+" u "+" where u.username='tranvanlinh'";
        EntityManager em = PersitencetUtil.getEntityManager();
        em.getTransaction();
        Query query=em.createQuery(strQuery);
       return  (List<User2>)query.getResultList();
    }

    public List<User2> getUser2(String name)
    {
        String strQuery="from "+User2.class.getName()+" u where u.username = :name";
        EntityManager em = PersitencetUtil.getEntityManager();
        em.getTransaction();
        Query query=em.createQuery(strQuery);
        query.setParameter("name",name);
        System.out.println("ok");
        return  (List<User2>)query.getResultList();
    }

    public void updateUser(User2 user)
    {
       EntityManager em=PersitencetUtil.getEntityManager();
       em.getTransaction().begin();
       em.merge(user);
        em.getTransaction().commit();
        System.out.println("update success full");
    }

    public void insertUser(User2 user)
    {
        EntityManager em=PersitencetUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        System.out.println("update success full");
    }
}
