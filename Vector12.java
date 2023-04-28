//vector in java 
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Vector;
public class Vector12
{
public static void main(String...args)
{
Vector<String> obj=new Vector<String>();
obj.add("RED");
obj.add("BLUE");
obj.add("GREEN");
obj.remove(1);  //index value
obj.set(0, "Hello");  //to replace element at particular postion
obj.insertElementAt("Student", 0);

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
