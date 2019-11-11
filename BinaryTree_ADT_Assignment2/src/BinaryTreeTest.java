import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	int root = 8;
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

		assertTrue(btree.contains(8));
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
		assertFalse(btree.isEmpty());
	}

	@Test
	public void testPreOrder() {
		//how to test this
	}
}
