package Test;

import Entity.User2;
import Model.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Thanh Ha on 4/1/2017.
 */
public class Main {

    @PersistenceContext
    EntityManager entityManager;

    public  List<User2>  getAllUser()
    {
        entityManager= PersistenceUtil.getEntityManager();
       List<User2> user2s;
       user2s=entityManager.createQuery("from "+User2.class.getName()).getResultList();
       return user2s;
    }
    public static void main(String[] args) {
        (new Main()).getAllUser();
    }
}

