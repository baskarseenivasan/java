package chennai.myhome;

public class CellPhone extends Telephone
{
public static void main(String[] args)
{
CellPhone mobile = new CellPhone();
mobile.make_calls();
mobile.receive_calls();
mobile.send_message();
}
public void send_message()
{
System.out.println("send sms");
}
}
