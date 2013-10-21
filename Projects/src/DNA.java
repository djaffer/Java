/*
  File: DNA.java

  Description: Longest Common Sequence

  Student Name: Danish Jaffer
  
  Date Created: 3/17/2013

  Date Last Modified:

*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class DNA 
{

	
	public static void main (String [] args) throws IOException 
	
	{
		File inFile = new File("./dna.txt");//importing the text file
		Scanner sc = new Scanner(inFile);
		int time = Integer.parseInt(sc.nextLine());//Getting the number of pair line in the text file
		System.out.println("Longest Common Sequences\n");

		for(int z = 1;z<=time;z++)//loop for number of pairs
			{
			String one = sc.nextLine();//getting the first dna sequence line
			one = one.toUpperCase();
			String two = sc.nextLine();//getting the second dna sequence line 
			two = two.toUpperCase();
		
			System.out.print("Pair "+z+": ");
			
			ArrayList<String> list = sequence(one,two);//getting array list from method of all the common sequences
			
			if(list.size()==0)//if there are no common sequences between pairs printing the message
			{
				System.out.println("No Common Sequence Found");
				
			}
			
			
		for(int x = 0;x<list.size();x++) //printing list of common sequences by using an array list
			{
				System.out.println(list.get(x));
				if(list.size()>0&&x<list.size()-1)
				{
				   System.out.print("\t");
				}
			}
	     }
			
		sc.close();
			
	}		
			
	
	public static ArrayList <String> sequence (String one, String two)
			{
				ArrayList<String> list = new ArrayList<String>();
				int length = 0;
				String temp = " ";
				String strand1 = " ";
				String strand2 = " ";
				int bigstring = 0;
				//getting shorter string as strand1 and bigger as strand2
				if(one.length()<two.length()) 
				{
					length=one.length();
				    strand1 = one;
				    strand2 = two;
				}   
				
				else
				{
					length = two.length();
					strand1 = two;
					strand2 = one;
				}	
				//getting the length of longest sequence between two strings
				for(int x = 0;x<length-1;x++)
				{  
					for(int y =length;y>x+1;y--)
					{  
						temp = strand1.substring(x,y);
						int size = strand2.indexOf(temp);
						if(size>-1&&temp.length()>bigstring)//comparing the length of previous common sequence	
						{
							bigstring = temp.length();  	
						}   	 
					}
				}		
				 
				// saving the longest common sequence(s) in an array list and returning it
				for(int x = 0;x<length-1;x++)
				{  
					for(int y =length;y>x+1;y--)
					{  
						temp = strand1.substring(x,y);
						
					    
						int size = strand2.indexOf(temp);
						if(size>-1&&temp.length()==bigstring)
							
						{
							list.add(temp);
						}
				  }
		        }
				return list;
			}
}
