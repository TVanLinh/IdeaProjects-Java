import java.util.List;

/**
 * Created by Thanh Ha on 3/31/2017.
 */
public class Person  implements Comparable
{
    private String name;
    private  String addr;
    private   int num;
    public Person()
    {

    }
    public Person(String name, String addr, int num) {
        this.name = name;
        this.addr = addr;
        this.num = num;
    }

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        Person p=(Person)o;
        if(this.name.equals(p.name)&&this.addr.equals(this.addr))
        {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        System.out.println("in hash code");
        return this.name.hashCode()+this.addr.hashCode();
    }

    public int compareTo(Object o) {
        Person p=(Person)o;
        System.out.println("in compareTo");
       if(this.num>p.num)
       {
           return 1;
       }
       if(this.num<p.num)
       {
           return -1;
       }
       return 0;
    }

}