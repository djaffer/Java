public class StackDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack(5);

		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
	while (!st.isEmpty()) {
			System.out.println(st.pop());
			
		}
	
		
		System.out.println(st.pop());
		Stack stack = new Stack(100);
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.push(4);
		stack.push(6);
		stack.push(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
	}

}
