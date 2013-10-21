import java.util.Arrays;


public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 int [][] a = {{1,2,3,4,5},{6,7,8,9,10}};
		//row sum
	 for(int x =0;x<a.length;x++)
	 { int sum = 0;
		 for(int y=0;y<a[x].length;y++)
		 {
			 
			 sum += a[x][y];
			 
			 
		 }
		 System.out.println(sum);
		 
		 
	 }
	 //column sum
	 for(int x =0;x<a[0].length;x++)
	 { int sum = 0;
		 for(int y=0;y<a.length;y++)
		 {
			 
			 sum += a[y][x];
			 
			 
		 }
		 System.out.println(sum);
		 
		 
	 } 
	 //transpose 
	 
	 int [][] b = new int [a[0].length][a.length];
	 for(int x=0;x<a[0].length;x++)
	 {
		 for(int y=0;y<a.length;y++)
		 {
		 b[x][y] = a[y][x];
		 }
	 }
	 
	 System.out.println(Arrays.deepToString(a));
	 System.out.println(Arrays.deepToString(b));
	  int [][] one = {{1,2,3},{3,4,3}};
	  int [][] two = {{1,2},{4,5},{6,7}};
	  int [][] three = mult(one,two);
	  int [][] four = {{1,2,3},{4,5,6}};
	  int [][] five = {{7,8,9},{10,10,10}};
	  int [][] six = dotproduct(four,five);
	  System.out.println("A"+Arrays.deepToString(three));
	  System.out.println(Arrays.deepToString(six));
	  System.out.println(diagl(two));
	 int [] seven = {1,2,3,4};
	 rev(seven);
	 System.out.println(Arrays.toString((seven)));

	}
public static int [][] mult(int a[][],int [][]b)
{
	int c [][] = new int [a.length][b[0].length];
	
	for(int x =0;x<c.length;x++)
	{
		int sum =0;
		for(int y=0;y<c[x].length;y++)
		{
			for(int z =0;z<b.length;z++)
			{
				sum+=a[x][z]*b[z][y];
				
				
				
			}
			c[x][y]=sum;
			
			
		}
		
	}
	
	return c;
	
	
}
	
public static int [][] dotproduct(int [][]a,int[][]b)
{
	int [][] c = new int [a.length][b[0].length];
	for(int x =0;x<c.length;x++)
	{
		for(int y =0;y<c[x].length;y++)
		{
			c[x][y] = a[x][y]*b[x][y];
			
			
		}
		
		
		
		
	}
	
	return c;
}
public static int diagl(int [][]a )
{
	int sum = 0;
	int x = 0;
	int y = a [0].length-1;
while(x<a.length&&y>=0)
{
	sum += a[x++][y--];
	
	
	
}
	
	
	return sum;
}

public static void rev (int [] a )
{
	for(int x=0;x<a.length/2;x++)
	{
		int temp = a[a.length-x-1];
		a[a.length-x-1]=a[x];
		a[x] = temp;
		
		
		
	}
	
}
	
}
