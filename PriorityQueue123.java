import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.*;

public class PriorityQueue123
{
public static void main(String...args)
{
PriorityQueue<String>obj=new PriorityQueue<String>();
obj.add("RED");
obj.add("BLUE");
obj.add("GREEN");
System.out.println("Head" +obj.element());
System.out.println("Head" +obj.peek());
obj.remove();
obj.poll();


System.out.println("---------------- using iterator-------------------");
Iterator<String>itr=obj.iterator();
while(itr.hasNext())
{
  String color=(String)itr.next();
  System.out.println(color);
}
}}