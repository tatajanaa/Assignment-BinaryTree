import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	int root;
	BinaryTree btree = new BinaryTree(root);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
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
		assertEquals(1, btree.height());
		btree.addElement(10);
		btree.addElement(11);
		assertEquals(3, btree.height());

	}

	@Test
	public void testIsEmpty() {
		BinaryTree binarytree = new BinaryTree();
		assertTrue(binarytree.isEmpty());
	}

	@Test
	public void testPreOrder() {
		//how to test this
	}
	@Test
	public void testAddElement() {
	assertEquals(1, btree.size());	
	btree.addElement(74);
	btree.addElement(88);
	assertEquals(3,btree.size());
	
	}
}
