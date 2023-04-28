class generic13
{
    public static void main(String[] args)
    {
       test obj=new test("hh", 5);
       obj.display(); 
    }}
    class test
{
    String s1; int a;
    test(String s1, int a)
    {
        this.s1=s1; this.a=a;
    }
    public void display()
    {
        System.out.println(this.s1);
    System.out.println(this.a);
}}
