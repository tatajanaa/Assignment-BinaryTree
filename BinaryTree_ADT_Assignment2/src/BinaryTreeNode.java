
public class BinaryTreeNode {

	int element;
	BinaryTreeNode leftChild, rightChild;
	private int height;

	public BinaryTreeNode(int element) {

		this.element = element;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int height){
		this.height=height;
	}
	
	
	
	/*
	 * Returns the element from the Node
	 */
	public int getElement() {
		return element;
	}

	/*
	 * Store the element in the Node
	 */
	public void setElement(int element) {
		this.element = element;
	}

	/*
	 * Returns a reference to the left child
	 */
	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}

	/*
	 * Add a left child to the Node
	 */
	public void setLeftChild(BinaryTreeNode left) {
		this.leftChild=left;
	}

	/*
	 * Returns a reference to the right child
	 */
	public BinaryTreeNode getRightChild() {
		return rightChild;
	}

	/*
	 * Add a right child to the Node
	 */
	public void setRightChild(BinaryTreeNode right) {
		this.rightChild = right;
	}


	public String toString() {
		return element + " ";
	}


	
	

}
