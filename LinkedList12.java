//linked list in java 
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
public class LinkedList12
{
public static void main(String...args)
{
LinkedList<String> obj=new LinkedList<String>();
obj.add("RED");
obj.add("BLUE");
obj.add("GREEN");
obj.addFirst("Hello");
obj.addLast("Students");
obj.remove(1);
obj.removeFirst();
obj.removeLast();
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
