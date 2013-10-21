import java.awt.List;
import java.util.Arrays;


public class binarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
  int []  a = {1,2,3,4,5,6,8,1,2};
  Arrays.sort(a);
  System.out.println(BinarySearch(a,5));
  int[] c = {5,6,7,8};
double [] b = {9,0.5,10,3,2,3,1,5,9,20000000,200};

b = selectionsort(b);
  String temp = Arrays.toString(b);
  int [] d = combine(a,c);
		System.out.println(temp);
		System.out.println(seqsearch(b,200));
		System.out.println(Arrays.toString(d));
	int [] f ={1,2,3,4,5};
	towers(3,'A','B','C');
	for (int i = 0; i < 10; i++)
    {
      System.out.println (fib_iter(i) + "  " + fib_rec (i));
    }

	}
	public static void towers(int n,char source, char spare,char dest)
	{
		if(n==1)
		{
			System.out.println("Move disk from "+source+" to "+dest);
			
		}
		else
		{
			towers(n-1,source,dest,spare);
			System.out.println("Move disk from "+source+" to "+dest);
			towers(n-1,spare,source,dest);
			
		}	
		
	}
	public static int fib_rec(int n)
	{
		if(n==1||n==0)
		return n;
		else
		 return fib_rec(n-1)+fib_rec(n-2); 
		
		
	}
	
	public static int fib_iter(int n)
	{
		if(n==0||n==1)
		{
			return n;
			
		}
		
		
		int f0 = 0;
		int f1 = 1;
		int f2 = f0+f1;
		
		for(int x = 2;x<n;x++)
		{
			f0 = f1;
			f1 = f2;
			f2 = f0 +f1;
			
		}
		
	return f2;	
		
	}
	
	
	
	public static int[] combine(int[] a,int[] b)
	{
	 int c [] = new int [a.length+b.length];
	  int k = 0;
	  int i = 0;
	  int j = 0;
	  
	  while(i<a.length&&j<b.length)
	  {
		  
		  if(a[i]<b[j])
		  {
			  
			  c[k]=a[i];
			  i++;
			  
			  
		  }
		  
		  else
		  {
			  c[k]=b[j];
			  j++;
		  }
		  k++;
		  
		  
	  }
	  
	  
	  while(i<a.length)
	  {
		  c[k]=a[i];
		  i++;
		  k++;
	  }
	 while(j<b.length)
	 {
		c[k]=b[j];
		k++;
		j++;
		 
	 }
	 
	return c;
	}
	public static int seqsearch (double[]a,int key)
	{
		for(int x=0;x<a.length;x++)
		{
		  	if(a[x]==key)
		  	{
		  		return x;
		  	}
			
			
		}
	
		return -1;
		
	}
	
	
	public static int BinarySearch (int [] a,int key )
	{
		
		int low=0;
		int high = a.length-1;
		while(high>=low)
		{
			int mid = (high+low)/2;
			if(key<a[mid])
			{
				high = mid-1;
			}
			else if(a[mid]==key)
			{
				return mid;
			}
			else
			{
				low = mid+1;
			}
			
			
		}
		return -1;
		
		
	}
	
	public static double [] selectionsort(double [] a)
	{
	 for(int x = 0;x<a.length;x++)
	 {
		 double currentmin = a[x];
		 int minindex = x;
		 for(int y=x+1;y<a.length;y++)
		 {
			 if(a[y]<a[x])
			 {
				 currentmin = a[y];
				 minindex = y;
				 
			 }
			 
			 
			 
		 }
		 if(minindex!=x)
		 {   a[minindex]=a[x];
			 a[x]=currentmin;
			 
			 
		 }
		 
		 
		 
	 }
		
	return a;	
		
		
	}
	
	
	
	
	
	
}
