package LinkedList;

public class Node {

	private int data;
	private Node nextNode;
	/**
	 * @param args
	 */
	
	public Node(int data)
	{
		this.data = data;

	}
	
	
	
	@Override
	public String toString() {
		return "data= " + data;
	}




	public int getData() {
		return data;
	}




	public void setData(int data) {
		this.data = data;
	}




	public Node getNextNode() {
		return nextNode;
	}




	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
