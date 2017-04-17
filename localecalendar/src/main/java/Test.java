/**
 * Created by Thanh Ha on 3/31/2017.
 */
public class Test
{
    public static void main(String[] args) {
//        String str="Hello word ";
//        String str2=str+" added";
//        str+="ok";
//        System.out.println("str "+str);
//        System.out.println("str2 "+str2);
        String str="hello.word";
        String a[]=str.split("\\.");
        System.out.println(a[0]);
        for (String s:a)
        {
            System.out.println(s);
        }
//        StringBuilder stringBuilder=new StringBuilder();
//        stringBuilder.append("Helloword");
//        stringBuilder.append(1==3);
//        stringBuilder.insert(5,"\t");
//
//        System.out.println(stringBuilder);

    }
}
