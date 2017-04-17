package Model;

import Entity.Hoadon;
import Entity.Khachhang;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Thanh Ha on 4/3/2017.
 */
public class HoaDonIML implements HoaDonDAO
{

    public boolean insertHoaDon(Hoadon hd) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        try
        {
            entityManager.getTransaction().begin();
            entityManager.persist(hd);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
    }

    public List<Hoadon> getHoaDons() {
            EntityManager entityManager=PersistenceUtil.getEntityManager();
            String strQuery="from "+Hoadon.class.getName();
            return  entityManager.createQuery(strQuery).getResultList();
    }

    public Hoadon findHoaDon(int idHd) {
       return  PersistenceUtil.getEntityManager().find(Hoadon.class,idHd);
    }

    public boolean deleteHoaDon(int  idHd) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        Hoadon hoadon;
        if((hoadon=entityManager.find(Hoadon.class,idHd))==null)
        {
            System.out.println("Null roi");
            return  false;
        }
        System.out.println("OK");
        entityManager.remove(hoadon);
        entityManager.getTransaction().commit();
        //entityManager.clear();
       // entityManager.close();
        return true;
    }

    public Double getTongTieng(int hoadonID) {
        String query = "select do.tongTien from " + Hoadon.class.getName() + " do where do.maHd = :hoadonId";
        Query q = PersistenceUtil.getEntityManager().createQuery(query);
        q.setParameter("hoadonId", hoadonID);
        return (Double) q.getSingleResult();
    }
}
