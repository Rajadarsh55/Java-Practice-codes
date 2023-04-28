//array list in java 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class ArrayList12
{
public static void main(String...args)
{
ArrayList<String> obj=new ArrayList<String>();
obj.add("RED");
obj.add("BLUE");
obj.add("GREEN");
obj.add(1, "HELLO");
obj.add(0, "GOOD");
obj.remove(1);
obj.set(2, "STUDENTS");
Collections.sort(obj);
Collections.sort(obj, Collections.reverseOrder());


System.out.println("---------------- using for each loop -------------------");
for(String i:obj)
{
System.out.println(i);
}
System.out.println("---------------- using iterator-------------------");
Iterator<String>itr=obj.iterator();
while(itr.hasNext())
{
  String color=(String)itr.next();
  System.out.println(color);
}
System.out.println("---------------- using for loop -------------------");
}
}
