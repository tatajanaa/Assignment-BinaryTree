import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	int root = 87;
	BinaryTree btree = new BinaryTree(root);
	BinaryTree binarytree = new BinaryTree();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
		assertEquals(1, btree.size()); // size with only root
		btree.addElement(10);
		btree.addElement(11);
		assertEquals(3, btree.size());
	}

	@Test
	public void testContains() {

		assertTrue(btree.contains(87));
		btree.addElement(11);
		assertTrue(btree.contains(11));
	}

	@Test
	public void testHeight() {
		assertEquals(0, btree.heightT());
		btree.addElement(65);
		assertEquals(1, btree.heightT());
		btree.addElement(165);
		btree.addElement(265);
		btree.addElement(365);
		assertEquals(2, btree.heightT());
	}

	@Test
	public void testIsEmpty() {

		assertTrue(binarytree.isEmpty());
	}

	@Test
	public void testAddElement() {

		assertEquals(0, binarytree.size());
		binarytree.addElement(159);
		assertEquals(1, binarytree.size());
		binarytree.addElement(898);
		assertEquals(2, binarytree.size());
		binarytree.addElement(96);
		assertEquals(3, binarytree.size());
		binarytree.addElement(87);
		assertEquals(4, binarytree.size());

	}

	@Test
	public void testInOrder() {
		BinaryTree tBT = new BinaryTree(159);
		tBT.addElement(87);
		tBT.addElement(20);
		tBT.addElement(96);
		assertEquals("20 87 96 159 ", tBT.inOrder());

	}

	@Test
	public void testPreOrder() {
		BinaryTree tBT = new BinaryTree(56);
		tBT.addElement(6);
		tBT.addElement(199);
		tBT.addElement(4);

		assertEquals("56 6 4 199 ", tBT.preOrder());

	}

	@Test
	public void testPostOrder() {
		BinaryTree tBT = new BinaryTree(56);
		tBT.addElement(6);
		tBT.addElement(199);
		tBT.addElement(4);

		assertEquals("4 6 199 56 ", tBT.postOrder());

	}

	@Test
	public void testLevelOrder() {
		BinaryTree tBT = new BinaryTree(56);
		tBT.addElement(6);
		tBT.addElement(199);
		tBT.addElement(4);

		assertEquals("56 6 199 4 ", tBT.levelOrder());

	}

	@Test
	public void testGetBalance() {
		BinaryTreeNode node = new BinaryTreeNode(159);
		BinaryTreeNode right = new BinaryTreeNode(586);

		node.setRightChild(right);
		
		int balance = btree.getBalance(node);

		assertEquals(-1, balance);

	}
}
