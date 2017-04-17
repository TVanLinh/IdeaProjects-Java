package Embedded.Model;

import Embedded.Entity.User;
import  Entity.*;
import Model.PersistenceUtil;

import javax.persistence.EntityManager;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
public class UserIML implements  UserDAO
{
    public boolean insert(User user) {
        EntityManager entityManager= PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(user);
            entityManager.getTransaction().commit();
            return  true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            return false;
        }
    }

    public User find(int idUser) {
        return PersistenceUtil.getEntityManager().find(User.class,idUser);
    }
}
