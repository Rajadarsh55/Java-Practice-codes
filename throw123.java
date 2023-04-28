//custom exception
//if person age is less than 18, it will raise exception, otherwise print that person allowed for
//voting   ->invalidexception
class InvalidAgeException extends Exception
{
    InvalidAgeException(String str)
{
    System.out.println(str);
}
}
class throw123
{
public static void age(int age) throws InvalidAgeException
{
if(age<18)
{
    throw new InvalidAgeException("not eligible for voting");
}
else
{
    System.out.println("eligible for voting");
}}
public static void main(String[] args)
{
  try
  {  age(12);}
  catch(Exception e)
  {System.out.println(0);
}}}