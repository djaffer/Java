/*
  File: CreditCard.java

  Description: Validity of Credit Card

  Student Name: Danish Jaffer

  Date Created: 2/1/2012

  Date Last Modified:

*/


import java.util.Scanner;


public class CreditCard 
{

	public static void main(String[] args) 
	{
		int count = 0;//initialize counter to check 16 digit number
		int odd = 0;// sum for odds
		System.out.print("Enter 16-digit credit card number: ");//prompting user
		Scanner kb = new Scanner(System.in);
		long num = kb.nextLong();
		long temp = num;//copy of cc num
		
		 while (temp>0)//counting number of digits inputed   
		 {
		temp = temp/10;
		count ++;
		 }

	
	if (count==16)// checking if digits=16 
	   {
		//getting digits from the number
		int d16 = ((int) (num % 10));
	   
		num = num / 10;

	    int d15 = 2*(int) (num % 10);
	    
		num = num / 10;

	    int d14 = (int) (num % 10);

	    num = num / 10;

	    int d13 = 2*(int) (num % 10);
	    
	    num = num / 10;

	    int d12 = (int) (num % 10);
		  
	    num = num / 10;

	    int d11 = 2*(int) (num % 10);
		  
	    num = num / 10;

	    int d10 = (int) (num % 10);
		  
	    num = num / 10;

	    int d9 = 2*(int) (num % 10);
		  
	    num = num / 10;

	    int d8 = (int) (num % 10);
		  
	    num = num / 10;

	    int d7 = 2*(int) (num % 10);
		  
	    num = num / 10;

	    int d6 = (int) (num % 10);
		  
	    num = num / 10;

	    int d5 = 2*(int) (num % 10);
		  
	    num = num / 10;

	    int d4 = (int) (num % 10);
		  
	    num = num / 10;

	    int d3 = 2*(int) (num % 10);
		  
	    num = num / 10;

	    int d2 = (int) (num % 10);
		  
	    num = num / 10;

	    int d1 = 2*(int) (num % 10);	      
	    
	   int[] oddarray = {d1,d3,d5,d7,d9,d11,d13,d15};// setting odd digits as an array
	  
	  
	   for( int i=0; i<oddarray.length; i++)// sum of digits of odd
	   {
		
		odd= odd + oddarray[i]%10+oddarray[i]/10;
		
		
	   }
	    int even = (d2+d4+d6+d8+d10+d12+d14+d16);//sum of even digits
	    int total = odd+even;
	    total = total%10; //gets the remainder of sum  
	    
	     if (total==0)//checking if card is valid or not Luhn's Test
	     {
	    	 System.out.println("Valid credit card number");
	    	 return;
	     
	     }
	     
	   
	     else
	     {
	    	 System.out.println("Invalid credit card number"); 
	    	 return;
	     }	    
	   }
	else
	{
		System.out.println("Not a 16-digit number");
		return;
	}
  }
}
