package Entity;

import javax.persistence.*;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
@Entity
public class Employee {
    private  int idEm;
    private  String name;
    private  double salary;
    private Address address;
    public  Employee()
    {

    }

    public Employee( String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Employee( String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address=address;
    }

    @Column(name = "Id_Em")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    public int getIdEm() {
        return idEm;
    }

    public void setIdEm(int idEm) {
        this.idEm = idEm;
    }

    @Column(name = "Name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Salary")
    @Basic
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @OneToOne(mappedBy = "employee",targetEntity = Address.class,fetch =FetchType.EAGER,cascade =CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEm=" + idEm +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address.getIdAddr() +
                '}';
    }
}
