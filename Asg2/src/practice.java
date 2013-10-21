


public class practice {

	/**
	 * @param args
	 */
	 public static int square(int x) { return x*x; }

	    // ****** your code starts here ******

	    // Sum of squares of integers from 1..n
	    public static int sumsq (int n) {
	    	return (n>0 ? square(n)+sumsq(--n) : n);
	   
	    	
	    	
	    }
	    public static int peanoplus(int x, int y) {
	    
	    if(y==0)
	    {
	    	return x;
	    }
	    else
	    {
	    	return peanoplus(++x,--y);
	    }
	    
	    
	    }
	    public static int peanotimes(int x, int y) {
	    
	     if(y==1)
	     {
	    	 return x;
	     }
	    	
	     else
	     {
	    	 return peanoplus(x,0)+peanotimes(x,--y); 
	     }
	    
	    }
	    // n choose k: distinct subsets of k items chosen from n items
	    public static int choose(int n, int k, int trackn, int trackk)
	    {
	    	if(k>0)
	    	{
	    	trackn *=n;
    		trackk *=k;
    		return choose(--n,--k,trackn,trackk);
	    	}
	    	else
	    	{
	    		return trackn/trackk;
	    	}
	    }
	    
	    public static int pascal(int row, int col)
	    {
	    	if(col==0||col==row)
	    	{
	    		return 1; 
	    	}
	    	else
	    	{
	    		
	    		return pascal(row-1,col-1)+pascal(row-1,col);
	    	}	
	    		
	    	
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int [] a = {1,2,3};
		int b = 2;
		int f = 75287520;
	System.out.println(sumsq(2));
	System.out.println(peanotimes(2,2));
	System.out.println(choose(4,4,1,1));
	System.out.println(f);
	}

}
