import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree implements BinarySearchTreeADT {

	BinaryTreeNode root;
	private int balance;

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

	public int heightT() {
	return heightOfTree(root);
	}
	



	
	public BinaryTreeNode  add(BinaryTreeNode node, int value) {
		if (node == null) {
			return  new BinaryTreeNode(value);
			
		}
			
			if(value< node.getElement()) {
			
					node.setLeftChild(add(node.getLeftChild(),value));
				} else {
					
					node.setRightChild(add(node.getRightChild(),value));
				}
			
		 node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild())) + 1);
		  return rebalance(node,value);
	}
	
	
	public void addElement(int value) {
		

		root= add(this.root,value);

	

	
	
		

	}

	public String toString() {
		return root + "\n";
	}

	public void removeElement(int targetElement) {
	    
		root=remove(this.root, targetElement);
	
	}
	
	
 
	private BinaryTreeNode rebalance(BinaryTreeNode node,int value) {
	
		 
		  int balance = getBalance(node); 
		  
		  // left-left
		  if (balance > 1 && value < node.getLeftChild().getElement()) {
		    return rightRotation(node);
		  }
		 
		  // right-right
		  if (balance < -1 && value> node.getRightChild().getElement()) {
		    return leftRotation(node);
		  }
		 
		  // left-right
		  if (balance > 1 && value > node.getLeftChild().getElement()) {
		    node.setLeftChild(leftRotation(node.getLeftChild()));
		    return rightRotation(node);
		  }
		 
		  // right-left
		  if (balance < -1 && value < node.getRightChild().getElement()) {
		    node.setRightChild(rightRotation(node.getRightChild()));
		    return leftRotation(node);
		  }
		  return node;
		}
	
	private int height(BinaryTreeNode node) {
		 
	    if (node == null) {
	      return -1;
	    }
	 
	    return node.getHeight();
	  }
	
	public int getBalance(BinaryTreeNode node)
	{    if(node==null) {
		   return 0;}
	
	
	 return height(node.getLeftChild()) - height(node.getRightChild());}
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	
	private BinaryTreeNode rightRotation(BinaryTreeNode node) {
	    System.out.println("right Rotation on node [" + node + "]");
	    
	    BinaryTreeNode newParentNode = node.getLeftChild();
	    BinaryTreeNode mid = newParentNode.getRightChild();
	 
	    newParentNode.setRightChild(node);
	    node.setLeftChild(mid);
	 
	    node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild())) + 1);
	    newParentNode
	        .setHeight(Math.max(height(newParentNode.getLeftChild()), height(newParentNode.getRightChild())) + 1);
	 
	    return newParentNode;
	  }
	 
	  private  BinaryTreeNode leftRotation( BinaryTreeNode node) {
	    System.out.println("left Rotation on node [" + node + "]");
	    
	    BinaryTreeNode newParentNode = node.getRightChild();
	    BinaryTreeNode mid = newParentNode.getLeftChild();
	 
	    newParentNode.setLeftChild(node);
	    node.setRightChild(mid);
	 
	    node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild())) + 1);
	    newParentNode
	        .setHeight(Math.max(height(newParentNode.getLeftChild()), height(newParentNode.getRightChild())) + 1);
	 
	    return newParentNode;
	  }
	  
	  
	  private BinaryTreeNode remove(BinaryTreeNode node, int value) {
		    if (node == null)
		      return node;
		 
		    if (value < node.getElement()) { 
		      node.setLeftChild(remove(node.getLeftChild(), value));
		    } else if (value > node.getElement()) { 
		      node.setRightChild(remove(node.getRightChild(), value));
		    } else {
		 
		      if (node.getLeftChild() == null && node.getRightChild() == null) {
		        System.out.println("remove leaf node [" + node.getElement() + "]");
		        return null;
		      }
		 
		      if (node.getLeftChild() == null) {
		        System.out.println("remove the right child [" + node.getElement() + "]");
		        BinaryTreeNode tempNode = node.getRightChild();
		        node = null;
		        return tempNode;
		      } else if (node.getRightChild() == null) {
		        System.out.println("remove the left child [" + node.getElement() + "]");
		        BinaryTreeNode tempNode = node.getLeftChild();
		        node = null;
		        return tempNode;
		      }
		 
		      System.out.println("remove node with two children");
		      BinaryTreeNode tempNode = getPredecessor(node.getLeftChild());
		 
		      System.out.println("replace with Predecessor [" + tempNode.getElement() + "]");
		      node.setElement(tempNode.getElement());
		      node.setLeftChild(remove(node.getLeftChild(), tempNode.getElement()));
		    }
		 
		    node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild())) + 1);
		 
	
		    return checkBalance(node);
		  }
	  
	  private BinaryTreeNode checkBalance(BinaryTreeNode node) {
		    int balance = getBalance(node);
		 

		    if (balance > 1) {
	
		      if (getBalance(node.getLeftChild()) < 0) {
		        node.setLeftChild(leftRotation(node.getLeftChild()));
		      }
		 
		      return rightRotation(node);
		    }
		    if (balance < -1) {
		   
		      if (getBalance(node.getRightChild()) > 0) {
		        node.setRightChild(rightRotation(node.getRightChild()));
		      }
		 
		     
		      return leftRotation(node);
		    }
		 
		    return node;
		  }
	  
	  private BinaryTreeNode getPredecessor(BinaryTreeNode node) {
		  
		  BinaryTreeNode predecessor = node;
		 
		    while (predecessor.getRightChild() != null)
		      predecessor = predecessor.getRightChild();
		 
		    return predecessor;
		  }
}
