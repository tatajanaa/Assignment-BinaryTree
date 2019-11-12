import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree implements BinarySearchTreeADT {

	BinaryTreeNode root;

	public BinaryTree(int root) {

		this.root = new BinaryTreeNode(root);
	}

	public BinaryTree() {
		root = null;

	}

	public BinaryTreeNode getRoot() {

		return root;
	}

	/**
	 * Method to check if binary tree is empty or not Time Complexity O(1) for best,
	 * average and worst case.
	 * 
	 * @return true if binary search tree is empty
	 */
	public boolean isEmpty() {
		return null == root;
	}

	/**
	 * Method that returns number of nodes. Time complexity O(n)
	 * 
	 * @return size of binary tree
	 */
	public int size() {
		BinaryTreeNode current = root;
		int size = 0;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while (!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.leftChild;
			} else {
				size++;
				current = stack.pop();
				current = current.rightChild;
			}
		}
		return size;

	}

	/**
	 * recursive method that traverses the tree. search for the value by comparing
	 * it to the value in the current node, then continue in the left or right
	 * child.
	 * 
	 * @param root
	 * @param value
	 * @return true if tree contains target element or false if doesn't
	 */
	private boolean Contains(BinaryTreeNode node, int value) {
		if (node == null)
			return false;
		if (node.element == value)
			return true;
		if (node.element > value)
			return Contains(node.leftChild, value);
		return Contains(node.rightChild, value);
	}

	public boolean contains(int targetElement) {
		return Contains(root, targetElement);
	}

	/**
	 * The in-order traversal consists of first visiting the left sub-tree, then the
	 * root node, and finally the right sub-tree
	 * 
	 * @param node
	 */
	String tElement = "";
	private String traversalInOrder(BinaryTreeNode node) {
		
		
		if (node != null) 
		{
			traversalInOrder(node.leftChild);
			
			tElement = tElement + node.element + " ";
			traversalInOrder(node.rightChild);
		}	
		return tElement;
	}

	
	public String inOrder() 
	{
		
		
	    return traversalInOrder(root);
	    
	}

	/**
	 * Pre-order traversal visits first the root node, then the left subtree, and
	 * finally the right subtree:
	 * 
	 * @param node
	 */
	String str = "";
	private String traversalPreorder(BinaryTreeNode node) {
	
		if (node != null) {
			str = str + node.element + " ";
			traversalPreorder(node.leftChild);
			traversalPreorder(node.rightChild);
		}
		
		return str;
	}

	public String preOrder() {
		return traversalPreorder(root);
	}

	/**
	 * Post-order traversal visits the left subtree, the right subtree, and the root
	 * node at the end:
	 * 
	 * @param node
	 */
	String string="";
	private String traversePostOrder(BinaryTreeNode node) {
		if (node != null) {
			traversePostOrder(node.leftChild);
			traversePostOrder(node.rightChild);
			string = string + node.element + " ";
		}
		return string;
	}

	public String postOrder() {
	 return	traversePostOrder(root);
	}

	/**
	 * levelOrder travesal visits all the levels of the tree starting from the root,
	 * and from left to right. Queue to holds the nodes from each level in order.
	 * This method extracts each node from the list, prints its values, then add its
	 * children to the queue
	 */
	String s = "";
	public String levelOrder() {
		if (root == null) {
			return "";
		}

		Queue<BinaryTreeNode> nodes = new LinkedList<BinaryTreeNode>();
		nodes.add(root);

		while (!nodes.isEmpty()) {

			BinaryTreeNode node = nodes.remove();

			s = s + node.element + " ";

			if (node.leftChild != null) {
				nodes.add(node.leftChild);
			}

			if (node.rightChild != null) {
				nodes.add(node.rightChild);
			}
		}
		return s;
	}

	private int heightOfTree(BinaryTreeNode root) {
		if (root == null) {
			return -1;
		}

		int left = 1 + heightOfTree(root.leftChild);
		int right = 1 + heightOfTree(root.rightChild);

		return Math.max(left, right);
	}

	public int height() {
		return heightOfTree(root);
	}

	private BinaryTreeNode addNode(BinaryTreeNode current, int value) {
		if (current == null) {
			return new BinaryTreeNode(value);
		}

		if (value < current.element) {
			current.leftChild = addNode(current.leftChild, value);
		} else if (value > current.element) {
			current.rightChild = addNode(current.rightChild, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void addElement(int value) {
		root = addNode(root, value);

	}

	public String toString() {
		return root + "\n";
	}

	public int removeElement(int targetElement) {
		// TODO Auto-generated method stub
		return 0;
	}

}
