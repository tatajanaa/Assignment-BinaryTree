
public class TreeMain {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(56);
		BinaryTreePrint print = new BinaryTreePrint();

		
		tree.addElement(6);
		tree.addElement(199);
		tree.addElement(4);

		


		print.printTree(tree.getRoot());
		System.out.println();
		System.out.println("Pre order:" + tree.preOrder());


		System.out.println();

		System.out.println("Post order:" + tree.postOrder());

		tree.postOrder();
		System.out.println();
		System.out.println("In order:"+ tree.inOrder());
		

		System.out.println("\n" + "level order "+ tree.levelOrder());

		tree.levelOrder();

		System.out.println("\n" + "Number of elements in the tree = " + tree.size());

		System.out.println(tree.contains(2));
		
		System.out.println("Height: "+ tree.height());



	

	}

}
