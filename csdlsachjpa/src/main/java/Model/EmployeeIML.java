package Model;

import Entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
public class EmployeeIML implements EmployeeDAO {
    public boolean intsert(Employee employee)
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
        Employee employee;
        if((employee=entityManager.find(Employee.class,id))!=null)
        {
            entityManager.remove(employee);
            entityManager.getTransaction().commit();
            return  true;
        }
        return false;
    }

    public Employee find(int id) {
        return PersistenceUtil.getEntityManager().find(Employee.class,id);
    }

    public boolean update(Employee employee) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        if(entityManager.find(Employee.class,employee.getIdEm())!=null)
        {
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
            return true;
        }
        return false;
    }

    public List<Employee> getALlEmployee() {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        String strQuery="select e from "+Employee.class.getName()+" e";
        TypedQuery<Employee> typedQuery=entityManager.createQuery(strQuery,Employee.class);
        return typedQuery.getResultList();
    }

    public boolean update2(Employee employee) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        entityManager.getTransaction().begin();
        Employee em=entityManager.find(Employee.class,employee.getIdEm());
        if(em!=null)
        {
            em.setName(employee.getName());
            em.setSalary(employee.getSalary());
            entityManager.getTransaction().commit();
            return true;
        }
        return false;
    }
}
