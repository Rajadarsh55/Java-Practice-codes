class generic13
{
    public static void main(String[] args)
    {
       test<String, Integer> obj=new test<String, Integer>("hh", 5);
       obj.display(); 
    }}
    class test<T, U>
{
    T s1; U a;
    test(T s1, U a)
    {
        this.s1=s1; this.a=a;
    }
    public void display()
    {
        System.out.println(this.s1);
    System.out.println(this.a);
}}
