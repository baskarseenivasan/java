
class Maths
{
//int a=45;
//float b=50.8f;
//int result=a+b;
//System.out.println(a+b);
public static void main(String[] args)
{
Maths m = new Maths();
//int a+b = m.multiplication();

//int result = m.add1();
m.multiplication(30.05f,40.6f);
//System.out.println(result);
m.subtract();
}
float multiplication(float a, float b)
{
System.out.println(a+b);
return a+b;
}
void subtract()
{
int a=25;
float b=10.5f;
System.out.println(a-b);
}
//void add1()
//{
//System.out.println(result);
//}
}
