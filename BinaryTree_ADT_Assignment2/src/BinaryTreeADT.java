
public interface BinaryTreeADT {
	BinaryTreeNode getRoot(); // Returns a reference to the 	root
	
	boolean isEmpty(); // Determines whether the tree is empty
	
	int size(); // Returns the number of elements in the tree
	
	boolean contains(int targetElement); //Determines if an element is present in the tree 
	
	String inOrder(); // Returns an inOrder representation of the tree
	
	String  preOrder(); // Returns an preOrder representation of the tree
	
	String postOrder(); // Returns an postOrder representation of the tree
	
	String levelOrder(); // Returns an level Order representation of the tree
	
	int heightT(); //Returns the height of the tree
	
}
