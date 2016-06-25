package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.SameTree;
import utils.TreeNode;

public class SameTreeTest {

	@Test
	public void test() {
		SameTree st = new SameTree();
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		p.left.left = new TreeNode(4);
		
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		q.left.left = new TreeNode(4);
		
		assertEquals(st.isSameTree(p, q),true);
		
	}

}
