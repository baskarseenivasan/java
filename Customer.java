class Customer
{
public static void main(String[] args)
{
Bank indian_bank = new Bank();
indian_bank.deposit();
indian_bank.withdraw();
System.out.println(indian_bank.minimum_balance);
indian_bank.minimum_balance = 500;
System.out.println(indian_bank.minimum_balance);

}
}
