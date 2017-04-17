package Module2;
import  java.util.Date;
import module1.Person;
import java.util.Calendar;
/**
 * Created by Thanh Ha on 3/21/2017.
 */
public class Test
{
    public static  void main(String[] args)
    {
        Calendar cal=Calendar.getInstance();
        cal.set(1995,8,18);
        Person person=new Person("Tran Van Linh",cal,"Tan lac hoa binh");
        person.getInformation();
    }
}
