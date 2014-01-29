/*
 File: Deal.java

 Description: Monte Hall

 Student Name:Danish J.

 Date Created: 3/14/2013

 Date Last Modified:

*/

import java.util.Scanner;
public class Deal 
{

	public static void main(String[] args) 
	{
    
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of times you want to play: ");
	int times = sc.nextInt();//number of times game needs to played
	int games = times;
	
	System.out.println("\nPrize  \tGuess  \tView  \tNew Guess");
	int count = 0;
	
	
	while(times>0)
	{
		int prize =(int) (1+Math.random()*3);//randomly generating door number 
		int guess =(int) (1+Math.random()*3);//first guess of the player
		int view = 0;
		for(view=1;view<=3;view++)//finding the door to open where there is no prize and is not guess
		{
			if(view!=guess&&view!=prize)
				break;
			else
			    continue;
		}
		int nGuess = 0; 
		
		for(nGuess=1;nGuess<=3;nGuess++)//generating new guess which is not the old guess and door opened
		{
			if(view!=nGuess&&guess!=nGuess)
				break;
			else
			    continue;
		}
		
		System.out.println("  "+prize+"  \t"+"  "+guess+"  \t"+"  "+view+"  \t"+"    "+nGuess);
		if(nGuess==prize)//if player wins then increments count
			count++;
		
		times--;
	}
	double sWin = 1.0*count/games;//Probability of winning by switching(no. of games won/total games)
	
	System.out.printf("\nProbability of winning if you switch = %.2f", sWin);
	System.out.printf("\nProbability of winning if you do not switch = %.2f", 1-sWin);//probability of winning by not switching 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
