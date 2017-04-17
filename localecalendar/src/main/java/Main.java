import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by Thanh Ha on 3/31/2017.
 */
public class Main
{
    public static void main(String[] args) {

        //Locale locale=new Locale("VN","vn");
        Locale locale=new Locale("VN","vn");
        Calendar calendar= GregorianCalendar.getInstance(locale);
        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println(dateFormat.format(calendar.getTime()));


        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(1235445.5));
    }
}
