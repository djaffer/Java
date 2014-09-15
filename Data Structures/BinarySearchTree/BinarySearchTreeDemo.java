
public class BinarySearchTreeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] sample = { 212, 580, 6, 7, 28, 84, 112, 434};
		BinarySearchTree bst = new BinarySearchTree();
		for (int x : sample) {
			bst.insert(x);
		}
		System.out.println("Found: "+bst.find(6));
		System.out.println("Smallest: "+bst.smallest());
		System.out.println("Largest: "+bst.largest());
		bst.delete(84);
		
		System.out.println("InOrder: ");
		bst.traverseInOrder();
		
		System.out.println("PreOrder: ");
		bst.traversePreOrder();
		
		System.out.println("PostOrder: ");
		bst.traversePostOrder();
		
		System.out.println("Height: "+bst.height());
		
		System.out.println("Number of Leaf Node: "+bst.numOfLeafNodes());
		System.out.println("Sum of tree: "+bst.sumNodes());
		
	}

}
