package Algorithms;
import java.util.Arrays;
public class Sorting {
	static Sorting xyz;
	public static int [] bubbleSort(int [] num)//Bubble sort implementation
	{
		
	  for(int i=num.length-1;i>=1;i--)
		{
		  for(int x = 0;x<i;x++)
		  {
			  if(num[x]>num[x+1])
			  {
				  int temp = num[x];
				  num[x] = num[x+1];
				  num[x+1]=temp;
			  }
		  }
		
		}
		
		
	return num;	
		
	}
	
	public static int [] selectionSort(int [] num)//Selection sort implementation
	{
		int minIndex;
		for(int x =0;x<num.length-1;x++)
		{
			    minIndex = x;
			for(int y=x+1;y<num.length;y++)
			{
				if(num[minIndex]>num[y])
				{
					minIndex = y;
				}
			}
			if(minIndex!=x)
			{
				int temp = num[x];
				num [x] = num[minIndex];
				num[minIndex] = temp;
			}
			
		}
		return num;
	}
	
	public static int [] insertionSort (int num[])//Insertion sort implementation
	{
		int current, j;
		for(int i =0;i<num.length;i++)
		{
			 current = num[i];
			 j = i-1;
			while (j>=0&&num[j]>current)
			{
				num[j+1] = num[j];
				j--;
			}
				num[j+1] = current;
			
		}
		
		return num;
	}
	
	public static int[] merge(int [] a,int[]b)//Merging two arrays
	{
		int countA = 0;
		int countB = 0;
		int [] combine = new int [a.length+b.length];
		int countC = 0;
	while(countA<a.length&&countB<b.length)
	{
		if(a[countA]<b[countB])
		{
			combine[countC++] = a[countA++]; 
		}
		else
		{
			combine[countC++] = b[countB++];
		}
		
	}
		while(countA<a.length)
		{
			combine[countC++] = a[countA++];
			
		}
		
		while(countB<b.length)
		{
			combine[countC++] = b[countB++];
		}
	  return combine;
	}
	
	public static int[] mergeSort(int [] a)
	{
		
		if(a.length==1)
		{
			return a;
		}
		else
		{
		  int middle = a.length/2;	
			
		  int [] one = new int [middle];
		  int [] two = new int [a.length-middle];
		  
		  for(int x =0;x<middle;x++)
		  {
			 one[x] = a[x];
		  }
		  
		  for(int i=middle;i<a.length;i++)
		  {
			  two [i-middle] = a[i];
		  }
		  
		  return merge(mergeSort(one),mergeSort(two));
		  
		}
		
	}
	
	public static void quickSort (int []a,int start, int end)
	{
		if(start<end)
		{
			int pivot = partition(a,start,end);
			quickSort(a,start,pivot-1);
			quickSort(a,pivot+1,end);
			
			
			
		}
		
		
		
	}
	public static int partition (int[] a,int start,int end)
	{
		int pivot = a[end];
		int i = start,temp;
		
		for(int j =start;j<end;j++)
		{
			if(a[j]<=pivot)
			{
				temp = a[j];
				a[j] = a[i];
				a[i++] = temp;
				
			}
			
		}
		
		a[end] = a[i];
		a[i] = pivot;
     return i;		
		
	}
	

	public static void main(String[] args) {

		int [] ar = {523434,4,23,34343,434234,3453,5,6,7,0,123,43,5,-1};
		System.out.println("Original Array:"+Arrays.toString(ar));
		System.out.println("\nBubble Sort O(n^2): "+Arrays.toString(bubbleSort(ar)));
	
	    int [] ay = {523434,4,23,34343,434234,3453,5,6,7,0,123,43,5,-1};
	    System.out.println("Selection Sort O(n^2): "+Arrays.toString(selectionSort(ay)));
		
	    int [] az = {523434,4,23,34343,434234,3453,5,6,7,0,123,43,5,-1};
	    System.out.println("Insertion Sort O(n^2): "+Arrays.toString(insertionSort(az)));
	    
	    int [] one = {1,2,3,4,5,6,7};
	    int [] two = {1,2,4,5,6,9,100};
	    System.out.println("Array one for merge: "+Arrays.toString(one));
	    System.out.println("Array two for merge: "+Arrays.toString(two));
	    System.out.println("Merged:"+Arrays.toString(merge(one,two)));
	    
	    int [] aq = {523434,4,23,34343,434234,3453,5,6,7,0,123,43,5,-1};
	    System.out.println("Merge Sort (not in place) O(n*log(n)): "+Arrays.toString(mergeSort(aq)));
	    
	    int [] as = {523434,4,23,34343,434234,3453,5,6,7,0,123,43,5,-1};
	    quickSort(as,0,as.length-1);
	    System.out.println("Quick Sort (in place) O(n*log(n)): "+Arrays.toString(as));
	    
	    
	    
	}

}
