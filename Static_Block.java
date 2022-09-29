class Static_Block
{
{
System.out.println("non static block");
}
static
{
System.out.println("Static Block");
}
{
System.out.println("non static block");
}
public static void main(String[] args)
{
Static_Block sd1 = new Static_Block();
System.out.println("static Block2");
}
}
