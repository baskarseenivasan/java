class School
{
private void recruit()
{
System.out.println("Management Activity");
}
public static void main(String[] args)
{
School sslc_student = new School();
sslc_student.calculate(90, 95, 98, 100, 87);

School hsc_student = new School();
hsc_student.calculate(90, 87, 98, 96, 95, 94);
hsc_student.calculate(87, 98, 96, 95, 94, "Arun");
}
void calculate(float m1, int m2, int m3, int m4, int m5, String name)//same method name different different type of aruguments
{
System.out.println(m1+m2+m3+m4+m5);
System.out.println(name);
}
void calculate(int m1, int m2, int m3, int m4, int m5, int m6)//same method name different number of aruguments
{
System.out.println(m1+m2+m3+m4+m5+m6);
}
void calculate(int m1, int m2, int m3, int m4, int m5)
{
System.out.println(m1+m2+m3+m4+m5);
}
}
