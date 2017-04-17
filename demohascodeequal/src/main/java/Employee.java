import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thanh Ha on 3/31/2017.
 */
public class Employee extends Person
{
	double salary;

	public Employee(double salary) {
		this.salary = salary;
	}

	public Employee(String name, String addr, int num, double salary) {
		super(name, addr, num);
		this.salary = salary;
	}

	public Employee(String name, String addr, double salary) {
		super(name, addr);
		this.salary = salary;
	}

	public static void main(String[] args)
	{

		for(int i=0;i<10;i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println("i  "+i);
		}

	}
}
