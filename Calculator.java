class Calculator
{
public static void main (String[] args)
{
Calculator Calc = new Calculator();
int result = Calc.add();
System.out.println(result);
Calc.subtract(result, 5);
}
void subtract(int no1, int no2)
{
System.out.println(no1-no2);
return;
}
int add()
{
//return 5+10+25;
int no1 = 5, no2 = 10, no3 = 25;
return no1+no2+no3;
//System.out.println("hi");
}
}
