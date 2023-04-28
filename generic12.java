//GENERIC IN JAVA 
class generic12
{
    public static void main(String[] args)
    {
        display(5,"HH");
         display("Hello", 5); 
         display(5.5F, 6.7F);
    }
public static <T,U> void display(T a, U b )
{
    System.out.println(a);
    System.out.println(b);
}
}