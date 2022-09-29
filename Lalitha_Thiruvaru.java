class Lalitha_Thiruvaru extends Lalitha_Chennai
{
int offer;
public Lalitha_Thiruvaru(int offer)
{
super(offer);
this.offer=offer;
System.out.println("kk offer" + this.offer);
}
public static void main(String[] args)
{
Lalitha_Thiruvaru lt=new Lalitha_Thiruvaru(2000);
lt.buy();
}
void buy()
{
System.out.println("KK" + this.offer);
System.out.println("Lc" + super.offer);
System.out.println("lt" + this.offer);
}
}

