package Test;

import Entity.Address;
import Entity.Employee;
import Model.AddrDAO;
import Model.AddressIML;
import Model.EmployeeIML;

import java.util.List;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
public class Main2
{
    public static void main(String[] args) {
        EmployeeIML employeeIML=new EmployeeIML();
        //employeeIML.intsert(new Employee("Tran Van Linh",15000000));

        AddrDAO addrDAO=new AddressIML();

        //addrDAO.intsert(new Address("Ha Noi","Ly thai to"));

    //    Employee employee=employeeIML.find(1);
//        System.out.println(employee);
//        Address address=new Address("Ha Dong","Ly thai to",employee);
//        addrDAO.intsert(address);
//
//        System.out.println(employee);

//        Address address=new Address("Ha Dong2","Ly thai to");
//        Employee employee1=new Employee("Tra Sinh Thanh2",12348997,address);
//        address.setEmployee(employee1);
//        System.out.println( employeeIML.intsert(employee1));

          Employee  employee2=employeeIML.find(9);
//          employee2.setName("Ma Van Tai");
//          employee2.getAddress().setCountry("Tan Lac Hoa Binh");
//          employeeIML.update(employee2);
//        List<Employee> employees=employeeIML.getALlEmployee();
//
//        for(Employee employee:employees)
//        {
//            System.out.println(employee);
//        }
        employee2.setSalary(999999);
        employeeIML.update2(employee2);
    }
}
