import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	int root;
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
		assertEquals(1, btree.size()); //size with only root
		btree.addElement(10);
		btree.addElement(11);
		assertEquals(3, btree.size());
	}

	@Test
	public void testContains() {

		assertTrue(btree.contains(0));
		btree.addElement(11);
		assertTrue(btree.contains(11));
	}

	@Test
	public void testHeight() {
		assertEquals(0, btree.height());
		btree.addElement(10);
		btree.addElement(11);
		assertEquals(2, btree.height());

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
	
	assertEquals(1, btree.size());	
	btree.addElement(74);
	btree.addElement(88);
	assertEquals(3,btree.size());
	
	}
	
	public void testInOrder()
	{
		BinaryTree tBT = new BinaryTree(7);
		tBT.addElement(27);
		tBT.addElement(2);
		tBT.addElement(29);
		assertEquals("2 7 7 29", tBT.inOrder());
		
	}
	@Test
	public void testPreOrder()
	{
		BinaryTree tBT = new BinaryTree(56);
		tBT.addElement(6);
		tBT.addElement(199);
		tBT.addElement(4);

		assertEquals("56 6 4 199 ", tBT.preOrder());
		
	}
	
	@Test
	public void testLevelOrder()
	{
		BinaryTree tBT = new BinaryTree(56);
		tBT.addElement(6);
		tBT.addElement(199);
		tBT.addElement(4);

		assertEquals("56 6 199 4 ", tBT.levelOrder());
		
	}
	
}
