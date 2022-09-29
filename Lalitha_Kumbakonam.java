class Lalitha_Kumbakonam 
{
int offer;
 Lalitha_Kumbakonam(int offer)
{
super(offer);
this.offer=offer;
System.out.println("kk offer" + this.offer);
}
public static void main(String[] args)
{
Lalitha_Kumbakonam lk=new Lalitha_Kumbakonam(2000);
lk.buy();
}
void buy()
{
System.out.println("KK" + this.offer);
System.out.println("LC" + super.offer);
}
}

