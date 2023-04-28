//nested try block
class multiexcep13
{
    public static void main(String[] args)
    {
        try { System.out.println(10/0); }
        catch(ArithmeticException e)
            {
                System.out.println("divide by zero not possible"); 
        }
{
    finally
    {
    try
    {
        int k[]={1,2,3,4,5};  System.out.println(k[10]);
    }
    catch(ArrayIndexOutofBoundsException e1)
    {
        System.out.println("beyond array limit");
    }}}}}
    
