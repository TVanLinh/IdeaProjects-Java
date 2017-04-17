package Model;

import Entity.Employee;

import java.util.List;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
public interface EmployeeDAO
{
    boolean intsert(Employee  employee);
    boolean delete(int id);
     Employee find(int id);
     boolean update(Employee employee);
     List<Employee> getALlEmployee();
     boolean update2(Employee employee);

}
