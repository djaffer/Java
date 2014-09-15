package LinkedList;

public class LinkedList {

	private Node head;
	private int length;
	
	public void insertAtHead(int num)
	{    
	
	
		
			Node temp = new Node(num);
			temp.setNextNode(this.head);
			this.head = temp;
		    length++;
		
	}
	
	
	public int getLength() {
		return length;
	}

	public void deleteFromHead()
	{
		head = head.getNextNode();
		length--;
	}

	public Node search(int data)
	{
		Node current = this.head;
		
		while(current!=null)
		{
			if(current.getData()==data)
			{
				return current;
			}	
			
			current = current.getNextNode();
		}
		
		return current;
		
	}
	
	public void insertInSorted(int data)
	{
		Node temp = new Node(data);
		Node current = this.head;
		Node previous = this.head;
		while(current.getData()<=data&&current!=null)
		{
			previous = current;
			current = current.getNextNode();
		}
		
		Node after = previous.getNextNode();
		previous.setNextNode(temp);
		temp.setNextNode(after);
		
	}
	
	public LinkedList reverse()
	{
		LinkedList rev = new LinkedList();
		Node current = this.head;
		
		while(current!=null)
		{
			rev.insertAtHead(current.getData());
			current= current.getNextNode();
		}
		return rev;
		
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
