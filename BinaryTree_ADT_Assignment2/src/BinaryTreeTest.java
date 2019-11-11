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
	}

}
