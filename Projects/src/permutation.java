public class permutation
{
public static void swap(int [] a,int k,int i)
{
	int temp = a[k];
	a[k]=a[i];
	a[i] = temp;
	
	
}
public static void permute(int[] a,int k)
{
	if(k==a.length-1)
	{
	 for(int x = 0; x<a.length;x++)
	 {
		 System.out.print(a[x]+" ");
	 }
	 System.out.println();
	}
	else
	{
		for(int i =k;i<a.length;i++)
		{
			swap(a,k,i);
			permute(a,k+1);
			swap(a,i,k);
			
		}
	}
	
}
  public static void main (String[] args)
  {
    int[] a = {1, 2, 3, 4};
    permute (a, 0);
  }
}
