
public interface BinaryTreeADT {
	BinaryTreeNode getRoot(); // Returns a reference to the 	root
	
	boolean isEmpty(); // Determines whether the tree is empty
	
	int size(); // Returns the number of elements in the tree
	
	boolean contains(int targetElement); //Determines if an element is present in the tree 
	
	void inOrder(); // Returns an inOrder representation of the tree
	
	void preOrder(); // Returns an preOrder representation of the tree
	
	void postOrder(); // Returns an postOrder representation of the tree
	
	void levelOrder(); // Returns an level Order representation of the tree
	
	int height(); //Returns the height of the tree
	
}
