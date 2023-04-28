class finally1
{
    public static void main(String[] args)
{
int a=10, b=0, c;
try
{
    c=a/b;
    System.out.println(c);
}
catch(ArithmeticException e)
{
    int x=20,y=0,z;
    z=x/y; System.out.println(z);
}
finally
{
    System.out.println("No exception in catch block");
}
System.out.println("end of program");
}}