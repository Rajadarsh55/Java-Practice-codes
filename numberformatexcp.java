//Number format exception
class numberformatexcp
{
    public static void main(String[] args)
    {
        String str="HELLO";
        try
        {
        int a=Integer.parseInt(str);
        System.out.println(a);
        }
        catch(NumberFormatException e)
        {
            System.out.println( "String" + " " + str + " " + "cannot be converted into integer");
        }
    }}