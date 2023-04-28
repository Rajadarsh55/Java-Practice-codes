//throws exception
class throwexception2
{
void div(int a, int b)
{
    if(b==0)
{
    throw new ArithmeticException();
}
else
{
    int c=a/b;
    System.out.println(c);
}}
public static void main(String[] args)
{
    throwexception2 obj=new throwexception2();
    try
   { obj.div(20,0);}
   catch (Exception e)
   {
    System.out.println("the value of b is zero");
   }
}}

//to find out whether the student is passed or not and passing percentage is 50% and we have to  craete an exception for 