//Dequeue in java 
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Vector;
import java.util.Stack;
import java.util.ArrayDeque;
public class Dequeue12
{
public static void main(String...args)
{
ArrayDeque<String> obj=new ArrayDeque<String>();  //FIFO
obj.add("RED");
obj.add("BLUE");
obj.add("Green");
obj.pop();

System.out.println("---------------- using iterator-------------------");
Iterator<String>itr=obj.iterator();
while(itr.hasNext())
{
  String color=(String)itr.next();
  System.out.println(color);
}}}