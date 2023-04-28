//stack in java 
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Vector;
import java.util.Stack;
import java.util.HashMap;
public class HashMap123
{
public static void main(String...args)
{
HashSet<ArrayList> obj=new  HashSet<ArrayList>(); 
ArrayList<String> obj1=new ArrayList<String>();
obj1.add("RED");
obj1.add("BLUE");
obj1.add("GREEN");
ArrayList<String> obj2=new ArrayList<String>();
obj2.add("RAM");
obj2.add("Shaym");
obj2.add("Vishnu");

obj.add(obj1);  obj.add(obj2);
System.out.println(obj.size());
}}