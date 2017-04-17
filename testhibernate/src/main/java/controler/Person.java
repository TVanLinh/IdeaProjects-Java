package controler;

/**
 * Created by Thanh Ha on 3/31/2017.
 */
public  class Person
{
    static  int a=0;
    public  Person()
    {
        a++;
    }
    public static  void main(String[] args)
    {
        new Person();
        new Person();
        new Person();
        System.out.println(Person.a);
    }
}
