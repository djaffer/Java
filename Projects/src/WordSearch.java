/*
  File: WordSearch.java

  Description:

  Student Name: Danish Jaffer

  Date Created: 4/10/2013

  Date Last Modified:

*/

import java.util.Scanner;
import java.io.*;
public class WordSearch {


	public static void main(String[] args) throws IOException
	{
	
		File inFile = new File("hidden.txt");//inputing file 
		File outFile = new File("found.txt");//outputting file
		Scanner sc = new Scanner(inFile);
		FileWriter fWriter = new FileWriter(outFile);
		PrintWriter pWriter = new PrintWriter(fWriter);
		
		int row = sc.nextInt();//getting number of rows 
		int col = sc.nextInt();//getting number of columns
		sc.nextLine();
		sc.nextLine();
		String [][] a = new String[row][col]; 
		for(int x =0;x<a.length;x++)//putting the grid in an array
		{
			String line = sc.nextLine();
			String [] b = line.split(" ");
			for(int y =0;y<a[x].length;y++)
			{
				a[x][y]=b[y];	
			}					
			
		}
		
		sc.nextLine();
       int nWords = sc.nextInt();//number of words to be searched
       sc.nextLine();
       for(int x=0;x<nWords;x++)
       {
    	   String check = sc.nextLine();
    	   int [] rows = checkRow(a,check);//calling method to search in rows
    	   int [] cols = checkCol(a,check);//calling method to search in columns
    	     if(rows[0]==0&&rows[1]==0&&cols[0]==0&&cols[1]==0)
    	     {
    	    	 pWriter.printf("%-15s %2d\t   %2d\n",check,0,0);
    	     }
    	     if(rows[0]!=0&&rows[1]!=0)
    	     {

pWriter.printf("%-15s %2d\t   %2d\n",check,rows[0],rows[1]);
    	     }
    	    else if(cols[0]!=0&&cols[1]!=0)
    	     {

pWriter.printf("%-15s %2d\t   %2d\n",check,cols[1],cols[0]);
    	     }
    	     
    	     
       }
       pWriter.close();
       sc.close();
	}
	public static int [] checkRow(String[][]a,String one) //search in the rows 
	{
		StringBuffer two = new StringBuffer(one);
		StringBuffer oneRev= two.reverse();//reversing the string
		int count =0;
		int count1 =0;
		int contains = 0;
		int [] b = new int[2];//using array to store column and letter of first letter of the word
		for(int x=0;x<a.length;x++)
		{
			
			for(int y=0;y<a[x].length;y++)
			{   count = 0; 
			    count1 =0;
			    
			 if(y+one.length()-1<a[x].length)
			     {
			for(int p=0;p<one.length();p++)
			{  			
				if(one.charAt(p)==a[x][y+p].charAt(0))//counting letters of word present in grid
				{
					count++;
				} 
				if(oneRev.charAt(p)==a[x][y+p].charAt(0))//counting letters of words present in grid
				{
					count1++;
				}
 			}
				
			     }	
			     
			 if(count==one.length())//if count is same as the length of word means contains the word
		     {   b[0] = x+1;//storing row 
		         b[1] = y+1;//storing column
		    	 contains = 1;
		    	 break;
		     }
			     else if(count1==one.length())
			     {   b[0] = x+1;//storing row
			         b[1] = y+one.length();//storing column
			    	 contains = 1;
			    	 break;
			     }

			    
			}	
			
	   }
		
	  if(contains == 1)//returning row and column in array
		  return b;
	  else
	  {
		  b[0] = 0;//returning 0 for row if word is not present
		  b[1] = 0;//returning 0 for column if word is not present
		  return b;
	  }
	  
	}
	
	public static int [] checkCol(String[][]a,String one) 
	{
		StringBuffer two = new StringBuffer(one);
		StringBuffer oneRev= two.reverse();//reversing the string
		int count =0;
		int count1 =0;
		int contains = 0;
		int [] b = new int[2];//using array to store column and letter of first letter of the word
		for(int x=0;x<a[0].length;x++)
		{
			
			for(int y=0;y<a.length;y++)
			{   count = 0;
			    count1 =0;
			    
			 if(y+one.length()-1<a.length)
			     {
			for(int p=0;p<one.length();p++)
			{  			
				if(one.charAt(p)==a[y+p][x].charAt(0))//counting letters of word present in grid
				{
					count++;
				} 
				if(oneRev.charAt(p)==a[y+p][x].charAt(0))//counting letters of words present in grid
				{
					count1++;
				}
 			}
				
			     }	
			     
			 if(count==one.length())//if count is same as the length of word means contains the word
		     {   b[0] = x+1;//storing row 
		         b[1] = y+1;//storing column
		    	 contains = 1;
		    	 break;
		     }
			     else if(count1==one.length())
			     {   b[0] = x+1;//storing row 
			         b[1] = y+one.length();//storing column
			    	 contains = 1;
			    	 break;
			     }

			    
			}	
			
	   }
		
	  if(contains == 1)//returning row and column in array
		  return b;
	  else
	  {
		  b[0] = 0;//returning 0 for row if word is not present
		  b[1] = 0;//returning 0 for column if word is not present
		  return b;
	  }
	  
	}
}
