class Poorvika2
{
float price;
int discount;
String model;
Poorvika2()
{
System.out.println("juice");
}
Poorvika2(String model, float price)
{
this();
this. model = model;
this.price = price;
System.out.println("Calendar"+ this.model);
}
Poorvika2(String model, float price, int discount)
{
this(model,price);
this.model =  model;
this.price = price;
this.discount = discount;
System.out.println("Gift Vocher for"+ this.model);
}
public static void main(String [] args)
{
Poorvika2 nokia = new Poorvika2("nokia 1000",1000,0);
Poorvika2 apple = new Poorvika2("Apple 14 pro Max",100000,10000);
Poorvika2 samsung =new Poorvika2("S22 Ultra", 5000,500);
System.out.println(nokia.price);
}
}
