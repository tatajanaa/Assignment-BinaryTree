
public class BinaryTreeNode {

	int element;
	BinaryTreeNode leftChild, rightChild;

	public BinaryTreeNode(int element) {

		this.element = element;
		leftChild = null;
		rightChild = null;
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
	public void setLeftChild(int left) {
		this.leftChild = new BinaryTreeNode(left);
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
	public void setRightChild(int right) {
		this.rightChild = new BinaryTreeNode(right);
	}


	public String toString() {
		return element + " ";
	}


	
	

}
