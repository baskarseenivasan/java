package baskar1.myhome;
import baskar.myhome.Telephone1;
public class CellPhone1 extends Telephone1
{
public static void main(String[] args)
{
CellPhone1 mobile = new CellPhone1();
Telephone1 ppp = new Telephone1();
ppp.make_calls();
ppp.receive_calls();
mobile.send_message();
mobile.do_project();
}
public void send_message()
{
System.out.println("send sms");
}
}
