package Algorithms;

import java.util.Arrays;

public class Alg {

	public static int[] revArray(int []a) //reversing array
	{
		for(int i=0;i<a.length/2;i++)
		{
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		return a;
	}
	public static String revString (String s)//reversing string
	{

		for(int i=0;i<s.length()/2;i++)
		{
			char temp = s.charAt(i);
			s = s.substring(0,i)+s.charAt(s.length()-i-1)+s.substring(i+1);
			s = s.substring(0,s.length()-i-1)+temp+s.substring(s.length()-i);
			
		}
		return s;
	}
	
	public static boolean anagram(String s, String t)//Checks if two String are anagrams like "eat" and "tea"
	{   
		if(s.length()!=t.length())
		{
			return false;
		}
		for(int i=0;i<s.length();i++)
		{
			if((t.indexOf(s.charAt(i)))==-1)
			{
				return false;
				
			}
			else if((s.indexOf(t.charAt(i)))==-1)
			{
				return false;
				
			}
			
			
		}
		
      	return true;	
	}
	
	public static boolean hasDuplicateChars(String s)
	{
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)))
		  {
			  return true;
		  }
		  
		  
	  }
		
		return false;
	}
	public static void towerOfHanoi (int disk, char source,char spare, char dest) //Using recursion to tell minimum no. of steps to take to solve Towers Of Hanoi game
	{
		if(disk==1)
		{
			System.out.println("Move from "+source+" to "+dest);
		}
		else
		{
			
			towerOfHanoi(disk-1,source,dest,spare);
			System.out.println("Move from "+source+" to "+dest);
			towerOfHanoi(disk-1,spare,source,dest);
		}
	}
	
	public static String decToBin(int n,String bin) //Converts Decimal no. to Binary
	{
		if(n==1)
		{
			bin+="1";
			StringBuilder rev = new StringBuilder(bin);
			return rev.reverse().toString();
		}
		else
		{
		  if(n%2==1)
		  {
			  bin+="1";
             return decToBin(n/2,bin);
		  }
		  else
		  {
			  bin+= "0";
			  return decToBin(n/2,bin);
		  }
		
		}
		
	}
	public static int binToDec(String bin) //Converts Binary Number to Decimal
	{
		int n = 0;
		for(int x=0;x<bin.length();x++)
		{
			if(bin.charAt(x)=='1')
			{
				n=n<<1;
				n=n|1;
			}
			else
			{
				n=n<<1;
			}
			
		}
		return n;
		
	}
	
	public static void  palindromeNum(int n) //print out all palindrome num till n
	{
		for(int i=0;i<=n;i++)
		{
			int rev = 0;//variable to hold rev
			int num = i;//copies original num
			while(num>0)
			{
				rev= rev*10+num%10;
				num/=10;
			}
			if(rev==i)
			{
				System.out.println(rev+" is palindrome");
			}
		}
		
		
	}

	public static void palindromeString(String s)//checks if string is palindrome 
	{
		if(s.equals(revString(s)))
		{
			System.out.println(s+" is palindrome");
		}
		else
		{
			System.out.println(s+" is not palindrome");
		}
		
	}
	
	public static void permute(char [] c, int start)//prints out all possible permutation of char array
	{
		if(start==c.length-1)
		{
			System.out.println(c);
		}
		else
		{
			for(int i =start;i<c.length;i++)
			{
				char temp = c[i];
				c[i] = c[start];
				c[start] = temp;
				
				permute(c,start+1);

				 temp = c[i];
				c[i] = c[start];
				c[start] = temp;
			}
			
		}
	}
	
	public static int  fibRec(int n)//Recursively computing Fibonacci Series
	{
		if(n==0||n==1)
		{
			return n;
		}
		else
		{
			return fibRec(n-1)+fibRec(n-2);
		}
	}
	
	public static int fibIter(int n) //Iteratively computing Fibonacci Series 
	{
		if(n==0||n==1)
		{
			return n;
		}
		else
		{
			int f0 = 0;
			int f1 = 1;
			int f2 = 1;
			for(int x=2;x<n;x++)
			{
				f0 = f1;
				f1 = f2;
				f2 = f0 + f1;
				
			}
			
			return f2;
			
			
		}
	}
	public static void subset(String s)//gets subsets of string
	{
	  for(int x=0;x<s.length();x++)
		  
	  {
		  for(int y=1;y<s.length()-x;y++)
		  {
			  String sub = s.substring(x,x+y);
			  System.out.println(sub);
			  
		  }
	 }
	  
			
	}
		
	public static void numOfLetters(String s)//Counts how many times each letter from a-z appears in string
	{
		s = s.toLowerCase();
		s = s.replaceAll("\\s","");
		int count [] = new int[26];
		for(int i=0;i<s.length();i++)
		{
			++count[s.charAt(i)-'a'];
			
			
		}
		
		
		for(int i = 'a';i<='z';i++)
		{
			
			System.out.println((char)i+" is  "+count[i-'a']+" times");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] rev = {1,2,3,4,5,6,7,8};
		System.out.println("Orignal Array for Rev: "+Arrays.toString(rev));
		System.out.println("Rev: "+Arrays.toString(revArray(rev)));
		
		System.out.println("Reversing abcdefgh: " +revString("abcdefgh"));
		System.out.println("Anagram tea and eat: "+anagram("tea","eat"));
		System.out.println("Dupliclate letter in great: "+hasDuplicateChars("great"));
		System.out.println("Dupliclate letter in anaconda: "+hasDuplicateChars("anaconda"));
		
		System.out.println("********************** Towers of Hanoi ");
		towerOfHanoi(3,'A','B','C');
		System.out.println("********************** End Towers of Hanoi");
	    
		System.out.println("Decimal to Binary: "+decToBin(129,""));
		System.out.println("Binary to Decimal: "+binToDec("11000000000000000000001"));	
		
		palindromeNum(100);
		palindromeString("mom");
		
		String temp = "bat";
		System.out.println("Permutes "+temp.toString()+":");
		permute(temp.toCharArray(),0);
		
		
		System.out.println("Recursive Fibonacci of 2: "+fibRec(5));
		System.out.println("Iterative Fibonacci of 2: "+fibIter(5));
		
		System.out.println("Subsets of abcdef");
		subset("abcdef");
		
		System.out.println("Number of times each letter appears in Computer Science");
		numOfLetters("Computer Science");
		
	}

}
