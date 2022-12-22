package tamilnadu.chennai;

import java.util.Scanner;

public class Student_CGPA {
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.println("Total no of papers");
	int N = sc.nextInt();
	int[] num=new int[N];
	for(int i=0; i<num.length; i++)
	{
		System.out.println("Enter  "+(i+1)+" st mark");
		num[i]=sc.nextInt();		
	}
	int sum_of_paper=0;
	Float average;
	for(int i: num)
	{
		sum_of_paper=sum_of_paper+i;
	}
	int total_no_of_paper= num.length;
	average=((float)sum_of_paper/(float)total_no_of_paper);
	System.out.println("sum = "+ sum_of_paper);
	System.out.println("average ="+average);
	float f=average;
	int number1;
	number1=(int)f;
	if(average>91)
	{
		System.out.println("O grade");
	}
	else if(average>81)
	{
		System.out.println("A+ grade");
	}
	else if(average>71)
	{
		System.out.println("A grade");
	}
	else if(average>61)
	{
		System.out.println("B+ grade");
	}
	else if(average>50)
	{
		System.out.println("B grade");
	}
	else
	{
		System.out.println("u grade");
	}
	System.out.println("All the Best!!!");
	}
	}
		
	
	




