class SuperMarket
{
static String name = "Baskar SuperMarket";
int price;
static int offer = 10;//Declaration and instaliZation
public static void main(String[] args)
{
SuperMarket product1 = new SuperMarket();
SuperMarket product2 = new SuperMarket();
product1.price = 100;
product2.price = 120;
product1.sell();//method calling statement
System.out.println(product1.price);
System.out.println(product2.price);
//we can acess static values using class name
System.out.println(SuperMarket.name);
//we can acess static values using instance name
System.out.println(product1.price);
//we can acess static values directly in the same class
System.out.println(name);
offer();


}
void sell()//methd signature,sell - method name
//() - aruguments
{//method body -defination
System.out.println("The price of " +name);
}
static void offer()
{
System.out.println("The offer of the product is " +offer);
}


}

