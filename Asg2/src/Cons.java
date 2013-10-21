/**
 * this class Cons implements a Lisp-like Cons cell
 * 
 * @author  Gordon S. Novak Jr.
 * @version 29 Nov 01; 25 Aug 08; 05 Sep 08; 08 Sep 08; 02 Sep 09; 27 Jan 10
 *          05 Feb 10; 16 Jul 10; 02 Sep 10; 13 Jul 11
 */

public class Cons
{
    private static final String Object = null;
	// instance variables
    private Object car;
    private Cons cdr;
    private Cons(Object first, Cons rest)
       { car = first;
         cdr = rest; }

    // make a new Cons and put the arguments into it
    // add one new thing to the front of an existing list
    // cons("a", list("b", "c"))  =  (a b c)
    public static Cons cons(Object first, Cons rest)
      { return new Cons(first, rest); }

    // test whether argument is a Cons
    public static boolean consp (Object x)
       { return ( (x != null) && (x instanceof Cons) ); }

    // first thing in a list:    first(list("a", "b", "c")) = "a"
    // safe, returns null if lst is null
    public static Object first(Cons lst) {
        return ( (lst == null) ? null : lst.car  ); }

    // rest of a list after the first thing:
    //    rest(list("a", "b", "c")) = (b c)
    // safe, returns null if lst is null
    public static Cons rest(Cons lst) {
      return ( (lst == null) ? null : lst.cdr  ); }

    // second thing in a list:    second(list("a", "b", "c")) = "b"
    public static Object second (Cons x) { return first(rest(x)); }

    // third thing in a list:    third(list("a", "b", "c")) = "c"
    public static Object third (Cons x) { return first(rest(rest(x))); }

    // destructively replace the first
    public static void setfirst (Cons x, Object i) { x.car = i; }

    // destructively replace the rest
    public static void setrest  (Cons x, Cons y) { x.cdr = y; }

    // make a list of things:   list("a", "b", "c") = (a b c)
    public static Cons list(Object ... elements) {
       Cons list = null;
       for (int i = elements.length-1; i >= 0; i--) {
           list = cons(elements[i], list);
       }
       return list;
   }

    // convert a list to a string for printing
    public String toString() {
       return ( "(" + toStringb(this) ); }
    public static String toString(Cons lst) {
       return ( "(" + toStringb(lst) ); }
    private static String toStringb(Cons lst) {
       return ( (lst == null) ?  ")"
                : ( first(lst) == null ? "()" : first(lst).toString() )
                  + ((rest(lst) == null) ? ")" 
                     : " " + toStringb(rest(lst)) ) ); }

    public static int square(int x) { return x*x; }

    // ****** your code starts here ******

    // Sum of squares of integers from 1..n
    public static int sumsq (int n) {
    	 if(n>0)
 	    {
 	    	return (square(n)+sumsq(--n));
 	    	
 	    }
 	    else
 	    {
 	    	return n;
 	    }
		
    	
    	
    }

    // Addition using Peano arithmetic
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

    // Multiplication using Peano arithmetic
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
    public static double auxchoose(int n, int k, double trackn, double trackk)
    {
    	if(k>0)
    	{
    	trackn *=n;
		trackk *=k;
		return auxchoose(--n,--k,trackn,trackk);
    	}
    	else
    	{
    		return trackn/trackk;
    	}
    }
    public static int choose(int n, int k)
    {
    	return (int) auxchoose(n,k,1,1);
    }

    // Add up a list of Integer
    // iterative version, using while
public static int sumlist (Cons lst) {
  int sum = 0;
   while ( lst != null ) {
      sum += (Integer) first(lst);   // cast since first() can be Object
    lst = rest(lst); }
  return sum; }

    // second iterative version, using for
public static int sumlistb (Cons arg) {
  int sum = 0;
  for (Cons lst = arg ; lst != null; lst = rest(lst) )
    sum += (Integer) first(lst);   // cast since first() can be Object
  return sum; }

    // recursive version
public static int sumlistr (Cons lst) {
	if(lst==null)
	{
		return 0;
	}
	else
	{
		return ((int) ((Integer)first(lst)))+sumlistr(rest(lst));
	}
}

    // tail recursive version
public static int auxsumlisttr (Cons lst, int answer) {
	
	if(lst==null)
	{
		return answer;
	}
	else
	{
		answer += (Integer)first(lst);
		return (auxsumlisttr(rest(lst), answer));
	}
}
public static int sumlisttr (Cons lst) {
	

	return auxsumlisttr(lst,0);
}

    // Sum of squared differences of elements of two lists
    // iterative version
public static int sumsqdiff (Cons lst, Cons lstb) {
	int sum = 0;
	while(lst!=null)
	{
		sum += (((Integer) first(lst)-(Integer) first(lstb))*((Integer) first(lst)-(Integer) first(lstb)));
		lst = rest(lst);
		lstb = rest(lstb);
	}
	return sum;
}

    // recursive version
public static int sumsqdiffr (Cons lst, Cons lstb) {
	
	if(lst!=null)
	{
		return (((Integer) first(lst)-(Integer) first(lstb))*((Integer) first(lst)-(Integer) first(lstb))) + sumsqdiffr(rest(lst),rest(lstb)); 
	}
	else
	{
		return 0;
	}
}

    // tail recursive version
public static int auxsumsqdifftr (Cons lst, Cons lstb, int answer) {
	
	if(lst==null)
	{
	   return answer;
	}
	else
	{
		answer += (((Integer) first(lst)-(Integer) first(lstb))*((Integer) first(lst)-(Integer) first(lstb)));
		return (auxsumsqdifftr(rest(lst),rest(lstb),answer));
	}
}
public static int sumsqdifftr (Cons lst, Cons lstb) {

	return auxsumsqdifftr(lst,lstb,0);
}

    // Find the maximum value in a list of Integer
    // iterative version
public static int maxlist (Cons lst) {
	int max = Integer.MIN_VALUE;
	while(lst!=null)
	{
	  	if((Integer)first(lst)>max)
	  	{
	  		max = (Integer) first(lst);
	  		lst = rest(lst);
	  	}
	  	else
	  	{
	  		lst = rest(lst);
	  	}
		
	}
	
	return max;
}

    // recursive version
public static int maxlistr (Cons lst) {
	
	if(second(lst)==null)
	{
		return (Integer) first(lst);
	}
	
	else
	{
		 if((Integer)first(lst)<(Integer)second(lst))
	  	{
	  		return(maxlistr(rest(lst)));
	  		
	  	}
	  	else
 	  	{
	  	 setfirst(rest(lst), first(lst));
	  	 return(maxlistr(rest(lst)));	
	  	}
	}
}

public static int auxmaxlisttr (Cons lst, int answer) {
	
	if(lst==null)
	{
		return answer;
	}
	else
	{
	if((Integer) first(lst)>answer)
	{   
		answer = (Integer) first(lst);
	}
	
		return (auxmaxlisttr(rest(lst),answer));
	}
}

public static int length (Cons lst)
{
	int count =0;
	while(lst!=null)
	{
		count++;
		lst= rest(lst);
	}
	return count;
}
public static int maxlisttr (Cons lst) {
	int min = Integer.MIN_VALUE;
	return auxmaxlisttr(lst,min);
	
	
}


    // Make a list of Binomial coefficients
    // binomial(2) = (1 2 1)

public static int auxbinomial(int row, int col)
{
	if(col==0||col==row)
	{
		return 1; 
	}
	else
	{
		
		return auxbinomial(row-1,col-1)+auxbinomial(row-1,col);
	}	
		
	
}

public static Cons savebinomial (int row, int count, Cons answer)
{
	if(count<=row)
	{
		answer=answer.cons(auxbinomial(row,count++),answer);
		return savebinomial(row,count,answer);
	}
	else
	{
		return answer;
	}
}
 public static Cons binomial(int n) {
    	 
    	 
    Cons answer = null;
    return savebinomial(n,0,answer);	
    	
    	
   
    }
 public static int sum (Cons lst) {
		int sum =0;
		for(;lst!=null;lst=rest(lst))
		{
			sum += (int) first(lst);
		}
		return sum;
	}
 public static int sumcons1 (Cons lst, int answer)
 {
	 if(lst==null)
	 {
		 return answer;
	 }
	
	 if(consp(first(lst)))
	 {
		 
		return sumcons((Cons) first(lst),answer); 
	 }	 
	 
	 else
	 {
		 answer += (int) first(lst);
		 lst=rest(lst);
		 return sumcons(lst,answer);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
 }
 

 public static int sumcons (Cons lst, int answer)
 {
	 if(lst==null)
	 {
		 return answer;
	 }
	
	 if(consp(first(lst)))
	 {
		return sumcons((Cons) first(lst),answer); 
	 }	 
	 
	 else
	 {
		 answer += (int) first(lst);
		 lst=rest(lst);
		 return sumcons(lst,answer);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
 }
 

 public static int auxsumtr (Cons lst, int answer) {
	 if(lst==null)
	 {
		return answer;
	 }
	
	
	 else if(consp(first(lst)))
			 {
		        answer += auxsumtr((Cons)first(lst),0);
		        return auxsumtr(rest(lst),answer);
			 }
	 
		 else
		 {
			 answer += (int) first(lst);
			 return auxsumtr(rest(lst),answer);
		 }
		 
		
	 }

  
 

 
 
    // ****** your code ends here ******


    public static void main( String[] args )
      { 
        System.out.println("sumsq(5) = " + sumsq(5));

        System.out.println("peanoplus(3, 5) = " + peanoplus(3, 5));
        System.out.println("peanotimes(3, 5) = " + peanotimes(3, 5));
        System.out.println("peanotimes(30, 30) = " + peanotimes(30, 30));

        System.out.println("choose 5 3 = " + choose(5, 3));
        System.out.println("choose 100 3 = " + choose(100, 3));
        System.out.println("choose 20 10 = " + choose(20, 10));
        System.out.println("choose 100 5 = " + choose(100, 5));
        for (int i = 0; i <= 4; i++)
          System.out.println("choose 4 " + i + " = " + choose(4, i));

        Cons mylist = list(Integer.valueOf(3), Integer.valueOf(4),
                           Integer.valueOf(8), Integer.valueOf(2));
        Cons mylistb = list(Integer.valueOf(2), Integer.valueOf(1),
                           Integer.valueOf(6), Integer.valueOf(5));
 
        System.out.println("mylist = " + mylist);
        System.out.println("mylist length = " + length(mylist));
        

        System.out.println("sumlist = " + sumlist(mylist));
        System.out.println("sumlistb = " + sumlistb(mylist));
        System.out.println("sumlistr = " + sumlistr(mylist));
        System.out.println("sumlisttr = " + sumlisttr(mylist));

        System.out.println("mylistb = " + mylistb);

        System.out.println("sumsqdiff = " + sumsqdiff(mylist, mylistb));
        System.out.println("sumsqdiffr = " + sumsqdiffr(mylist, mylistb));

        System.out.println("sumsqdifftr = " + sumsqdifftr(mylist, mylistb));

        System.out.println("maxlist " + mylist + " = " + maxlist(mylist));
        System.out.println("maxlistr = " + maxlistr(mylist));
        System.out.println("maxlisttr = " + maxlisttr(mylist));
         
         
        System.out.println("binomial(4) = " + binomial(4));
        System.out.println("binomial(20) = " + binomial(20));
       
       
      
       
  
      }

}
