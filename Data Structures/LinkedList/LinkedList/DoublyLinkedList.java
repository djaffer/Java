package LinkedList;

public class DoublyLinkedList {

	private DoublyLinkedNode head;
	private int length;
	/**
	 * @param args
	 */
	
	public void insetAtHead(int data)
	{
		DoublyLinkedNode temp = new DoublyLinkedNode(data);
	  
	  temp.setNextNode(this.head);
	  if(head!=null)
	  {
	  this.head.setPreviousNode(temp);
	  }
	  this.head = temp;
	length++;
		
	}
	
	public int getLength()
	{
		return this.length;
	}
	public String toString(){
		String result = "{";
		DoublyLinkedNode current = this.head;
		
		while(current!=null)
		{
           	result += current.toString()+",";		
			current = current.getNextNode();
		}
		
		return result+"}";
		
	}
	
}
