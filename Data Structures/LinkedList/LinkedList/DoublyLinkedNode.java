package LinkedList;

public class DoublyLinkedNode {

	private int data;
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode PreviousNode;

	public DoublyLinkedNode(int data)
	{
		this.data = data;
	}
	
	
	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}


	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}


	public DoublyLinkedNode getPreviousNode() {
		return PreviousNode;
	}


	public void setPreviousNode(DoublyLinkedNode previousNode) {
		PreviousNode = previousNode;
	}
 
	public String toString()
	{
		return "data= "+this.data;
	}

	/**
	 * @param args
	 */
	
}
