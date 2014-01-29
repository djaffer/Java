
/* File: HailStone.java

  Description: 

  Student Name: Danish Jaffer


  Date Created: 2/20/2012

  Date Last Modified:

*/
import java.util.Scanner;
public class HailStone
{

	
	public static void main(String[] args) 
	{
    
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter starting number of the range: ");
	    int lRan = kb.nextInt();
		System.out.print("Enter ending number of the range: ");
		int uRan = kb.nextInt();
		if (lRan>uRan || lRan<=0 ||uRan<=0)
		 {
		    System.out.println("Input positive numbers in right order");
		    main(args);//restarting program so user can input again by calling the method again
		    return;
		    
		  }
		
		        
	  int count = 0;// counting no. of iterations 
	  int length = 0;//using to compare last value 
	  int number = 0;//keeping track of actual number 
		for(int x=lRan;x<=uRan;x++)
		 {
			count = 0;
   
    	int clRan = x;//making a copy of the number
    	while(clRan>1)//performing algorithm for hail stone 
    	{
    	if(clRan%2==0)
    	{
    		clRan = clRan/2;
    		count ++;
    	}
    	
    	else
    	{
    		clRan = (clRan*3)+1;
    		count ++;
    		
    	}
    	
		 }
    	if(count>=length)//checking if current iterations is greater than last one 
    	{
    		number = x;
    		length=count;	
    	}
    	
		 }
		System.out.print("The number " +number+ " has the longest cycle length of "+length+".");
		
	}

}