
public class TreeMain {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(159);
		BinaryTreePrint print = new BinaryTreePrint();

		
		
		tree.addElement(898);
		tree.addElement(96);
		tree.addElement(87);
		tree.addElement(20);
		

       
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
		
		System.out.println("Height: "+ tree.heightT());

		
	
	

	}

}
