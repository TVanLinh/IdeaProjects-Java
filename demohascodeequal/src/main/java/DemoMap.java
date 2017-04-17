import java.util.*;

/**
 * Created by Thanh Ha on 3/31/2017.
 */
public class DemoMap
{
	public  static  void  main(String[] args)
	{
		//Map<Person,String> hmap=new HashMap<Person, String>();
//		hmap.put(new Person("TVLinh","Tran Van Linh"),"Tran Van Linh");
//		hmap.put(new Person("TVLinh","Tran Van Linh"),"Tran Van Linh2");
//		hmap.put(new Person("TVLinh","Tran Van Linh"),"Tran Van Linh3");
//		System.out.println(hmap.size());
//
//		Collection<String> people=hmap.values();
//		for(String str:people)
//		{
//			System.out.println(str);
//		}


		Map<Person,String> htable=new Hashtable<Person, String>();
		htable.put(new Person("TVLinh","Tran Van Linh"),"Tran Van Linh");
		htable.put(new Person("TVLinh","Tran Van Linh1"),"Tran Van Linh2");
		htable.put(new Person("TVLinh","Tran Van Linh2"),"Tran Van Linh3");
		System.out.println(htable.size());

//		Collection<String> people=htable.values();
//		for(String str:people)
//		{
//			System.out.println(str);
//		}

//		TreeMap<Person,String> treeMap=new TreeMap<Person, String>();
//		treeMap.put(new Person("TVLinh","A",3),"A");
//		treeMap.put(new Person("TVLinh","B",2),"B");
//		treeMap.put(new Person("TVLinh","C",1),"C");
//		Collection<String> people=treeMap.values();
//		for(String str:people)
//		{
//			System.out.println(str);
//		}
//		System.out.println(treeMap.containsKey(new Person("TVLinh","A",3)));


	}
}
