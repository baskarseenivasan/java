package chennai.myhome;
public class SmartPhone extends CellPhone//multiple inheritance
{
public static void main(String[] args)
{
SmartPhone v25 = new SmartPhone();
v25.make_calls();
v25.receive_calls();
v25.send_message();
v25.browse();
}
public void browse()
{
System.out.println("Browse");
}
}
