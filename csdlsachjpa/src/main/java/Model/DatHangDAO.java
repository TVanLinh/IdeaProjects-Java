package Model;

import Entity.Dathang;
import Entity.Sach;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Thanh Ha on 4/5/2017.
 */
public class DatHangDAO
{
    public Long getCountByMaSach(int maS)
    {
        String str="select count(s.maSach) from  "+ Dathang.class.getName()+" s where s.maSach="+maS;
        EntityManager em=PersistenceUtil.getEntityManager();
        Query query=em.createQuery(str);
       // query.setParameter("maS",maS);
        return (Long)query.getSingleResult();
    }

    public List<Integer> getMaSachs(int maHD)
    {
        SachIML sachIML=new SachIML();
        String str="select s.maSach from  "+ Dathang.class.getName()+" s where s.hoadon="+maHD;
        EntityManager em=PersistenceUtil.getEntityManager();
        Query query=em.createQuery(str);
        return  query.getResultList();
    }

    public  Double getTongTien(int maHD)
    {
        List<Integer> list=getMaSachs(maHD);
        if(list.size()==0)
        {
            return 0.0;
        }
        Sach sach;
        double count=0;
        SachIML sachIML=new SachIML();
        for (int i=0;i<list.size();i++)
        {
            count+=sachIML.find(list.get(i)).getGia();
        }
        return count;
    }
    public static void main(String[] args) {
        DatHangDAO datHangDAO=new DatHangDAO();
         System.out.println(datHangDAO.getTongTien(40));
        System.out.println(datHangDAO.getMaSachs(40).size());
    }
}
