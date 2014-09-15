public class Stack {

	private int[] items;
	private int top = -1;//index to keep track of the topmost element

	
	public Stack(int num) {
		this.items = new int[num];

	}

	public void push(int data) {
		items[++top] = data;

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Returns the topmost item and removes it
	 * @return
	 */
	public int pop() {
		if (!isEmpty()) {
			return items[top--];
		} else {
			System.out.println("Stack is empty!");
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
		if (!isEmpty()) {
			return items[top];
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
   }
	

}
