
public class Queue {
	/**
	 * This is an implementation of the Circular Queue
	 */
	private int head = 0;
	private int tail = -1;
	private int [] items;
	private int numberOfItems =0; // this field makes the implementation easy, but we can implement even without it.
	public Queue(int num)
	{
		items = new int [num];
		
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
		   System.out.println("Queue is full");	
		}
		else
		{
		items[++tail%items.length] = data;
		numberOfItems++;
		}
	}
	
	public boolean isFull()
	{
		return numberOfItems == items.length;
	}
	public int dequeue()
	{
		if(!isEmpty())
		{
			numberOfItems--;
			return items[head++%items.length];	
		}
		else
		{
			System.out.println("Queue is Empty");
		    return -1;
		}
	}
	
	/**
	 * Returns the topmost item without removing it
	 * Peek and Pop methods should ideally be invoked after checking that the stack is not empty
	 * either in a 'if' condition or a 'while' loop
	 * @return
	 */
	public int peek()
	{
		if(!isEmpty())
		{
			return items[head];
		}
		else
		{
			System.out.println("Queue is Empty");
		    return -1;
		}
	}
	public boolean isEmpty()
	{
		return numberOfItems==0;
	}
	
	

}
