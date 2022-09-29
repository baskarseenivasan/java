class Shop
{
int price;//int price,discount;
int discount;
//constructor has its name class name
//no return datatype is present in constructor
//constructor gets called automatically when object is created.
Shop(int price, int discount)
{
this.price = price;
this.discount = discount;
System.out.println("I am Constructor");
}
public static void main(String[] args)
{
Shop product1 = new Shop(30, 3);
Shop product2 = new Shop(40, 5);
product1.add_to_cart();
product2.add_to_cart();
product1.make_payment();
}
void add_to_cart()
{
System.out.println(price);
System.out.println(discount);
}
void make_payment()
{
System.out.println("Actual price is "+ (price-discount));
}
}
