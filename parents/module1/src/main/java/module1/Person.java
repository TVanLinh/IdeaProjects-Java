package module1;
import java.util.Calendar;
/**
 * Created by Thanh Ha on 3/21/2017.
 */
public class Person
{
    private  String name;
    private Calendar  birthDay;
    private  String addr;

    public Person(String name,Calendar  birthDay,String addr)
    {
        this.name=name;
        this.birthDay=birthDay;
        this.addr=addr;
    }
    public void getInformation()
    {
        System.out.println(name+"  "+birthDay.YEAR +" : "+birthDay.MONTH+"  "+birthDay.DAY_OF_MONTH+"  "+addr);
    }
}
