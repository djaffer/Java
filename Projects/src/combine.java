

public class combine
{
  public static void printArray (int[] b, int size)
  {
    for (int i = 0; i < size; i++)
    {
      System.out.print (b[i] + "  ");
    }
    System.out.println ();
  }


  public static void combine(int []a,int[]b,int ai, int bi,int size)
  {
	int range = a.length-size+1;
      if(bi==size)
      {
    	  printArray(b,size);
    	  
      }
      else
      {
    	  while(ai<range+bi)
    	  {
    		  b[bi++]=a[ai++];
    		  combine(a,b,ai,bi,size);
    		  bi--;
    		  
    		  
    	  }
    	  
      }
	  
  }
  public static void main (String[] args)
  {
    int [] a = {1, 2, 3, 4, 5};
    int [] b = new int [a.length];
    int size = 3;
    combine (a, b, 0, 0, size);
  }
}
