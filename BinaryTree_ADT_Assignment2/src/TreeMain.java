
public class TreeMain {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(56);
		BinaryTreePrint print = new BinaryTreePrint();

		
		tree.addElement(6);
		tree.addElement(4);
		tree.addElement(9);
		tree.addElement(11);
		tree.addElement(14);
		tree.addElement(8);
		tree.addElement(199);
		


		print.printTree(tree.getRoot());
		System.out.println();

		tree.preOrder();

		System.out.println();

		tree.postOrder();
		System.out.println();
		System.out.println("In order:");
		System.out.println(tree.inOrder());

		System.out.println("\n" + "level order");

		tree.levelOrder();

		System.out.println("\n" + "Number of elements in the tree = " + tree.size());

		System.out.println(tree.contains(2));

		System.out.println(tree.height());

	

	}

}
