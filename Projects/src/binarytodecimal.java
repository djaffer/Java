
public class binarytodecimal {

	public static String bintodec (int dec, String temp)
	{
		if(dec ==1)
		{
			temp += "1";
			StringBuffer temp1 = new StringBuffer (temp);
			temp1.reverse();
			
			return temp1.toString();
		}
		else
		{
			if(dec%2==1)
			{
				temp += "1";
			}
			else
			{
				temp+="0";
			}
			return bintodec(dec/2,temp);
		}
		
		
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(System.currentTimeMillis());
	System.out.println(bintodec(2048000000,""));
	System.out.println(System.currentTimeMillis());
	
	}

}
