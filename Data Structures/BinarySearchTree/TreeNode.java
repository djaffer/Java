
public class TreeNode {

	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(Integer data)
	{
		this.data = data;
	}
	
	public TreeNode find(Integer data)
	{
		if(this.getData()==data)
		{
			return this;
		}
		else if(data<this.getData()&&leftChild!=null)
		{
			return this.leftChild.find(data);
			
		}
		else if(data>this.getData()&&this.rightChild!=null)
		{
			return this.rightChild.find(data);
			
		}
		else
		{
		return null;
		}
	}
	
	public void insert(Integer data)
	{
		if(data>=this.data)
		{
			if(this.rightChild==null)
			{
				TreeNode temp = new TreeNode(data);
				this.setRightChild(temp);
			}
			else
			{
				this.rightChild.insert(data);
			}
		}
		else
		{
			if(this.leftChild==null)
			{
				TreeNode temp = new TreeNode(data);
				this.setLeftChild(temp);
			}
			else
			{
				this.leftChild.insert(data);
			}
			
		}
	}
	public Integer getData() {
		return data;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public Integer smallest()
	{
		if(this.leftChild==null)
		{
			return this.data;
		}
		else
		{
			return this.leftChild.smallest();
		}
	}
	public Integer largest()
	{
		if(this.rightChild==null)
		{
			return this.data;
		}
		else
		{
			return this.rightChild.largest();
		}
	}
	public void traverseInOrder()
	{
		if(this!=null)
		{
			if(this.leftChild!=null)
			this.leftChild.traverseInOrder();
			System.out.println(this.data.toString());
			if(this.rightChild!=null)
			this.rightChild.traverseInOrder();
		}
		
	}
	public void traversePreOrder()
	{
		if(this!=null)
		{
			
			System.out.println(this.data.toString());
			if(this.leftChild!=null)
			this.leftChild.traversePreOrder();
			if(this.rightChild!=null)
			this.rightChild.traversePreOrder();
		}
		
	}
	public void traversePostOrder()
	{
		if(this!=null)
		{
			if(this.leftChild!=null)
			this.leftChild.traversePostOrder();
			if(this.rightChild!=null)
			this.rightChild.traversePostOrder();
			System.out.println(this.data.toString());
		}
		
	}

	public int height() {
		if (isLeaf()) return 1;
		int left = 0;
		int right = 0;
		if (this.leftChild != null)
			left = this.leftChild.height();
		if (this.rightChild != null)
			right = this.rightChild.height();
		return (left > right) ? (left + 1) : (right + 1);
	}
	public boolean isLeaf() {
		return this.leftChild == null && this.rightChild == null;
	}
	
	public int numOfLeafNodes()
	{
		if(this.isLeaf())
		{
			return 1;
		}
		else
		{
			int leftLeaves = 0;
			int rightLeaves = 0;
			if(this.leftChild!=null)
			leftLeaves  = this.leftChild.numOfLeafNodes();
			if(this.rightChild!=null)
			rightLeaves  = this.rightChild.numOfLeafNodes();
				
			return leftLeaves+rightLeaves;
			
		}
		
		
	}
	
	public int sumNodes()
	{
		
		if(this!=null)
		{
			return this.data+(this.leftChild != null ?this.leftChild.sumNodes():0)+(this.rightChild != null ? this.rightChild.sumNodes():0);

		}
		else 
		{
			return 0;
		}
	}
	public String toString()
	{
		return Integer.toString(data);
	}
}
