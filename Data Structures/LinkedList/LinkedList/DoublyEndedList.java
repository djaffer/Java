package LinkedList;

public class DoublyEndedList {

	private Node head;
	private static Node tail;
	private int length;
	/**
	 * @param args
	 */
	
	public void insertAtHead(int data)
	{
		Node temp = new Node(data);
		temp.setNextNode(this.head);
	     head = temp;
		length++;
	}

	/**
	 * @param data
	 */
	public void insertAtTail (int data){
		Node temp = new Node(data);
		if(this.head == null)
		{
			this.head = temp;
		    this.tail = temp;
			
		}
		if(this.tail!=null)
		{
			
			this.tail.setNextNode(temp);
			this.tail = temp;
		}
		length++;
	}
	
	public int getLength() {
		return length;
	}

	

	public String toString(){
		String result = "{";
		Node current = this.head;
		
		while(current!=null)
		{
           	result += current.toString()+",";		
			current = current.getNextNode();
		}
		
		return result+"}";
		
	}
	
}

