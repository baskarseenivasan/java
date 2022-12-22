package tamilnadu.chennai;

import java.util.Scanner;

public class Atm_Machine {
	


	
	static
	{
		System.out.println("Welcome To ATM\n");
		System.out.println("Insert your Card");
		System.out.println("cardless Transaction");
		System.out.println("Do you want Cardless Transaction press 5");
	}
	
	

	public static void main(String[] args) {
		  int balance=5000,withdraw,deposit,Pin_Number,OTP_Number; 
		  Scanner sc = new  Scanner(System.in); 
		  while(true) 
		  { 
			  //System.out.println("ATM Machine\n");
			  //System.out.println("Welcome To ATM\n");
			 // System.out.println("cardless Transaction");
		      System.out.println("press 1 for withdraw"); 
		      System.out.println("press 2 for Deposit"); 
		      System.out.println("press 3 for balance Enquiry"); 
		      System.out.println("press 4 for Generate pin"); 
		      System.out.println("choose the operation");
		      int choice=sc.nextInt();
		      switch(choice)
		      {
		      case 1:
		    	  System.out.println("Enter money to be withdraw");
		    	  withdraw=sc.nextInt();
		    	  System.out.println("Enter your 4 digit Pin");
		    	  Pin_Number=sc.nextInt();
		    	  sc.nextLine();
		    	  if(balance>=withdraw)
		    	  {
		    		  balance=balance-withdraw;
		    		  System.out.println("please Enter your account if savings Account enter1 or Current Acount Enter2");
		    		  int account_type=sc.nextInt();
		    		  if(account_type==1)
		    		  {
		    			  System.out.println("processing please wait");
		    			  System.out.println("please collect money");
		    		  }
		    		  else
		    		  {
		    			System.out.println("processing please wait");  
		    			System.out.println("please collect your money");
		    		  }
		    					  
		    	  }
		    	  else
		    	  {
		    		  System.out.println("Insufficient Balance");
		    	  }
		    	  System.out.println("");
		    	  break;
		      case 2:
		    	  System.out.println("Enter money to be deposited");
		    	  deposit=sc.nextInt();
		    	  System.out.println("Enter your 4 digit pin Number");
		    	  Pin_Number=sc.nextInt();
		    	  balance=balance+deposit;
		    	  System.out.println("Your money has been sucessfully deposited");
		    	  System.out.println("");
		    	  break;
		      case 3:
		    	  System.out.println("Enter your 4 digit pin");
		    	  Pin_Number=sc.nextInt();
		    	  System.out.println("Balance "+ balance);
		    	  System.out.println("");
		    	  break;
		      case 4:
		    	  System.out.println("Enter old pin Number");
		    	  int num1=sc.nextInt();
		    	  System.out.println("Enter new pin Numbe");
		    	  int num2=sc.nextInt();
		    	  System.out.println("Enter your confirm new pin number");
		    	  int num3=sc.nextInt();
		    	  if(num2==num3)
		    	  {
		    		  System.out.println("Enter your otp number");
		    	  }
		    	  else
		    	  {
		    		  System.out.println("please check confirm pin number");
		    	  }
		    	  int num4=sc.nextInt();
		    	  if(num4>=4)
		    	  {
		    		  System.out.println("Your trancation is process please wait");
		    		  System.out.println("Your pin is sucessfully Generated");
		    	  }
		    	  else
		    	  {
		    		  System.out.println("Sorry Try again later");
		    	  }
		    		break;	  
		      
		      case 5:
		    	  System.out.println("Enter your Account_number");
		    	  
		    	 String no= sc.next();
		    	 int length=no.length();
		    	 
		    	 if((length==18)||(length==16)||(length==15)||(length==14)||(length==13)||(length==12)||(length==11)||(length==10)||(length==8))
		  
		    	  {
		    		  System.out.println("processing please wait");
		    	  }	
		    	  System.out.println("Enter your OTP Number");
		    	  String OTP_Number1=sc.next();
		    	  int length1=OTP_Number1.length();
		    	  if((length1==4)||(length1==6))
		    	  {  
		    	  
		    	  System.out.println("your money has been Sussefully deposited");
		      }
		      else
		      {
		    	  System.out.println("check your otp");
		      }
		    	  System.out.println("");
		      }
		    	  
		    			  
		      
		      
		   
		    	  break;
		      }
		  System.out.println("visit again !!!");   
	
	}
	}



	


		    	 
		    	  

		  




		 
	

	
	


	
