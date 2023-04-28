//stack in java 
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Vector;
import java.util.Stack;
public class Stack12
{
public static void main(String...args)
{
Stack<String> obj=new Stack<String>();  //LIFO
obj.add("RED");
obj.add("BLUE");
obj.pop();

System.out.println("---------------- using iterator-------------------");
Iterator<String>itr=obj.iterator();
while(itr.hasNext())
{
  String color=(String)itr.next();
  System.out.println(color);
}
}}