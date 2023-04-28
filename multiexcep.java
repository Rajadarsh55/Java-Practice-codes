//multiple try catch block
class multiexcep
{
public static void main(String[] args)
{
try
{
int a=10, b=0, c;
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
  System.out.println("divide by zero not possible");
}

}
try
{
int a[]={1,2,3,4,5}; 
System.out.println(a[10]);
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println("beyond array limit");
}}