package Model;

import Entity.Address;

import javax.persistence.EntityManager;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
public class AddressIML implements  AddrDAO{

    public boolean intsert(Address employee)
    {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        try
        {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            return false;
        }
    }

    public boolean delete(int id) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        Address address;
        if((address=entityManager.find(Address.class,id))!=null)
        {
            entityManager.remove(address);
            entityManager.getTransaction().commit();
            return  true;
        }
        return false;
    }

    public Address find(int id) {
        return PersistenceUtil.getEntityManager().find(Address.class,id);
    }
}
