import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;


public class testcases {

	/**
	 * @param args
	 */
	
	public static double power (double x,int n)
	{
		if(n==0)
			return 1;
		if(n==1)
			return x;
		else 
			return x*power(x,--n);
		
	}
	public static int fact(int n)
	{
		if(n==1)
			return n;
		else
			return n*fact(--n);
	}
	
	public static double auxsine (double x , int y, int count, double answer)
	{
		if (y==23)
		{
			return answer;
		}
		else
		{
			if(count%2==1)
			{
				answer-=power(x,y)/fact(y);
				
			}
			else
			{
				answer +=power(x,y)/fact(y);
				
			}
			return auxsine(x,y+2,++count,answer);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,0));
		System.out.println(fact(1));
		System.out.println(auxsine(0.5,1,0,0));
		double a = 3.4;
		double b = a-(long) a;
		double c = 0;
		double temp = 3.4*10;
		double delta = (temp%10)/10;
		temp = temp/10;
		int value = (int) temp%10;

		
		System.out.println(delta+" "+value+" "+temp);
		double x = 3;
		while(x>1)
		{
			
			x--;
			System.out.println(x);
		}

	String [] test = new String [6];
	Arrays.fill(test, "-1");
	Arrays.toString(test);
	System.out.println(test[0]);
    LinkedList<Object> lstg = new LinkedList<Object>();
    lstg.add(new Integer(39));
    lstg.add(new Integer(84));
    lstg.add(new Integer(5));
    lstg.add(new Integer(59));
    lstg.add(new Integer(86));
    lstg.add(new Integer(17));
    ListIterator itg = lstg.listIterator();
    int one = (int) itg.next();
    while((Object) one!=null)
    {
      
      System.out.println(one);
      one = (int) itg.next();
    }
    
	}

}
