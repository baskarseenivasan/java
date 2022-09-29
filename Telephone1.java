package baskar.myhome;
public class Telephone1

{
public static void main(String[] args)
{
Telephone1 ppp = new Telephone1();
ppp.make_calls();
ppp.receive_calls();
}
public void make_calls()
{
System.out.println("Call to friends");
}
public void receive_calls()
{
System.out.println("receive calls from friends");
}
protected void do_project()
{
System.out.println("project");
}
}
