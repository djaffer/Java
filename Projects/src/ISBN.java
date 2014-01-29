/*
  File: ISBN.java

  Description: checksum for isbn

  Student Name: Danish Jaffer		

  Date Created: 3/25/2013

  Date Last Modified:
*/

import java.util.Scanner;
import java.io.*;
public class ISBN
{

	public static void main(String[] args) throws IOException
	{
    File inFile = new File("isbn_input.txt");//name of file to input
    File outFile = new File ("isbn_output.txt"); //name of file to output
    FileWriter fWriter = new FileWriter(outFile);
    PrintWriter pWriter = new PrintWriter(fWriter);
	Scanner sc = new Scanner(inFile);
	
	while(sc.hasNextLine())
	{
		
	 String isbn = sc.nextLine();//gets the line
	 String cisbn = isbn.replaceAll("-", "");//removes all the hyphens
	 boolean check;
	 
	 if(cisbn.length()>10 ||cisbn.length()<10)//checking length of string
	 {
		 pWriter.println(isbn+"\tinvalid");
		 continue;
	 }
	 //checking last checksum digit if other than 0 to 9 or x prints error
	 if(cisbn.charAt(cisbn.length()-1)=='x'||cisbn.charAt(cisbn.length()-1)=='X'||(cisbn.charAt(cisbn.length()-1)>='0'&&cisbn.charAt(cisbn.length()-1)<='9'))
	 {
		 check = false;
	 }
	 else
	 {
	   pWriter.println(isbn+"\tinvalid"); 
	   continue;
		
	 }
	 
	      
	 for(int y=0;y<cisbn.length()-1;y++)//checking if every digit except last one that is between 0 to 9
	 {   
		 
		 if(cisbn.charAt(y)>='0'&&cisbn.charAt(y)<='9')
		 {
			 check = true;
		 }
		 else
		 {
			 check =false;
		 } 
		 if(check==false)
		 {
			 pWriter.println(isbn+"\tinvalid");	
			 break;
		 } 
    		 
		 
	 }
	 
	 if(check==true) //if passes the test starts the algorithm to calculate partial sums
	  {
		 String [] number = cisbn.split("");//splits the string into array
			if(number[number.length-1].equals("X")||number[number.length-1].equals("x"))//if last digit x substitutes the value of 10
			{
				number[number.length-1] = "10";
			}
			
			int sum1 =0;
			int [] s1 = new int [10];
			for(int x =1;x<number.length;x++) //getting s1 partial sum of original isbn
			{   
				int temp = Integer.parseInt(number[x]);
				sum1 +=temp;
				s1[x-1] = sum1;
				
			}
		
		 int [] s2 = new int [10];
		 int sum2 = 0;
			  for(int x =0;x<s1.length;x++) //getting s2 partial sum of s1
			   {       
				 
				   sum2 +=s1[x]; 
			       s2[x]=sum2; 
			   }
		 
		 if(s2[(s2.length)-1]%11==0)//checks if last element of s2 is divisible by 11
		 {
			 pWriter.println(isbn+"\tvalid");	
		 }
		 else
		 {
			 pWriter.println(isbn+"\tinvalid");
			 
		 }
			 	 
	  }		
  }
		
	pWriter.close();
	sc.close();	
	
	}

}
