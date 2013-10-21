/*
	  File: EasterSunday.java

	  Description: 

	  Student Name: Danish Jaffer

	  Student UT EID: dsj398

	  Course Name: CS 312

	  Unique Number: 53230/53240

	  Date Created:2/12/13

	  Date Last Modified:2/15/2013

	*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EasterSunday 
{	
	public static void main(String[] args) 
	{
		
		
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter year: ");
		int y = kb.nextInt();
		//performing algorithm for easter sunday
		int a = y%19;
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b+13)/25;
		int h = (19*a+b-d-g+15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a+11*h)/319;
		int r = (2*e+2*j-k-h+m+32)%7;
		int n = (h-m+r+90)/25;//easter month
		int p = (h-m+r+n+19)%32;//easter day
		
		String month = null;//converting easter month from number to word
		     
			  if (n ==3)
				  month = "March";
			  else if(n==4)
				  month = "April";
			  
			  Calendar today = new GregorianCalendar();//extra credit 
			  int sysYear = today.get(Calendar.YEAR);//getting year
			  int sysMonth = today.get(Calendar.MONTH);//getting month
			  int sysDay = today.get(Calendar.DAY_OF_MONTH);//getting day

			    
			  
		   if(y>sysYear || (sysYear<=y && (sysMonth+1)<=n && sysDay<=p) )//month starts from 0 so added 1
			  {
				  System.out.print("In " +y+", Easter Sunday will be on " +p+" "+ month+". ");

			  }
			  
			  else
			  {
				  System.out.print("In " +y+", Easter Sunday was on " +p+" "+ month+". ");  
			  }
			  
			  

		
	}

}
