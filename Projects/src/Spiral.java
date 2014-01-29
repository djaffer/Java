/*
  File: Spiral.java

  Description:

  Student Name:Danish Jaffer

  Date Created: 4/01/2013

  Date Last Modified:

*/

import java.io.*;
import java.util.Scanner;
public class Spiral 
{

	
	public static void main(String[] args) throws IOException 
	
	{
	
	 File inFile = new File("spiral.txt");
	 Scanner sc = new Scanner(inFile);
	 
	 int dimen = sc.nextInt();
	 if(dimen%2==0)
	 {
		 dimen++;
	 }
	 int num = sc.nextInt();
	 
	 if(num<=0||num>(dimen*dimen))//checking if number will be in range
	 {
		 System.out.println("Number not in Range");
	 }
	 int [][] spiral = makeSpiral(dimen);//calling the method to make spiral 
	
	 for(int p=0;p<spiral.length;p++)
     {
         for(int q =0;q<spiral[p].length;q++)
         {
         	if(spiral[p][q]==num&&(p==0||q==0||(p==dimen-1||q==dimen-1)))//checks if number is in outer edge
         	{
         		System.out.println("Number on Outer Edge");
         		
         		if(p==dimen-1&&q>0&&q<dimen-1)//if number is in last row but not at first and last column
         		{
         			System.out.println(spiral[p-1][q-1]+" "+spiral[p-1][q]+" "+spiral[p-1][q+1]);
         			System.out.print(spiral[p][q-1]+" "+spiral[p][q]+" "+spiral[p][q+1]);
         			break;
         		}
         		else if(p==dimen-1&&q==0)//if number is in last row and first column
         		{
         			System.out.println(spiral[p-1][q]+" "+spiral[p-1][q+1]);
         			System.out.print(spiral[p][q]+" "+spiral[p][q+1]);
         			break;
         		}
         		else if(p==dimen-1&&q==dimen-1)//if number is last row and last column
         		{
         			System.out.println(spiral[p-1][q-1]+" "+spiral[p-1][q]);
         			System.out.print(spiral[p][q-1]+" "+spiral[p][q]);
         			break;
         		}
         		else if(q==dimen-1&&p>0&&p<dimen-1)//if last column and row is from second and second to last
         		{
         			System.out.println(spiral[p-1][q-1]+" "+spiral[p-1][q]);
         			System.out.println(spiral[p][q-1]+" "+spiral[p][q]);
         			System.out.print(spiral[p+1][q-1]+" "+spiral[p+1][q]);
         			break;
         		}
         		else if(p==0&&q==dimen-1)//if first row and last column
         		{
         			System.out.println(spiral[p][q-1]+" "+spiral[p][q]);
         			System.out.print(spiral[p+1][q-1]+" "+spiral[p+1][q]);
         			break;         		
         		}
         		else if(p==0&&q==0)//if first row and first column
         		{
         			System.out.println(spiral[p][q]+" "+spiral[p][q+1]);
         			System.out.print(spiral[p+1][q]+" "+spiral[p+1][q+1]);
         			break;  
         		}
         		else if(p==0&&q>0&&q<dimen-1)//if first row and column is from second to second to last
         		{
         			System.out.println(spiral[p][q-1]+" "+spiral[p][q]+" "+spiral[p][q+1]);
         			System.out.println(spiral[p+1][q-1]+" "+spiral[p+1][q]+" "+spiral[p+1][q+1]);
         			break; 
         		}
         		else if(q==0&&p>0&&p<dimen-1)//if first column and row is from second to second to last
         		{
         			System.out.println(spiral[p-1][q]+" "+spiral[p-1][q+1]);
         			System.out.println(spiral[p][q]+" "+spiral[p][q+1]);
         			System.out.print(spiral[p+1][q]+" "+spiral[p+1][q+1]);
         			break;
         		}
         	}
     
         	if(spiral[p][q]==num&&(p!=0&&q!=0&&(p!=dimen-1&&q!=dimen-1)))//if row and column is not first and last
         		{
         			System.out.println(spiral[p-1][q-1]+" "+spiral[p-1][q]+" "+spiral[p-1][q+1]);
         			System.out.println(spiral[p][q-1]+" "+spiral[p][q]+" "+spiral[p][q+1]);
         			System.out.print(spiral[p+1][q-1]+" "+spiral[p+1][q]+" "+spiral[p+1][q+1]);
         			break;
         			
         		}
         	
         }
         
     }
	 
	 sc.close();
	 
} 
	 
	 public static int[][] makeSpiral(int dimen)
	 {
	 int [][] spiral = new int [dimen][dimen];
	 int start = (dimen*dimen);
	 int temp = 0;
	 int temp1 = spiral.length;
	 int temp2 = spiral[0].length;
	
	
		for(int y =0; y<=dimen;y++)
		{   
			temp1--;
			temp2--;
		  	for(int x =temp2;x>=temp;x--)//column going to left
		  	{
		  		spiral[y][x]=start;
		  		start -= 1;
		  		
		  	}
		  	
		  	for(int x = y+1;x<=temp1;x++)//left row going down
		  	{    
		  		spiral[x][y]= start;
		  		start--;
		  	}
		  	for(int z =y+1;z<=temp2;z++)//column going right
		  	{
		  		spiral[temp2][z]=start;
		  	    start--;
		  	}
		  	
		  	for(int l =temp1-1;l>y;l--) //right row going up
		  	{
		  		spiral[l][temp2]=start;
		        start--;	
		  	}
			
		temp++;
		
		}
		return spiral;
	 }	

}
