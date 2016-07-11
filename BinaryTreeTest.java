package tests;

import org.junit.Test;

import easy.BinaryTree;
import utils.TreeNode;

public class BinaryTreeTest {

	@Test
	public void test() {
		BinaryTree bt = new BinaryTree();
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		System.out.println(bt.preorderTraversal(root).toString());
		System.out.println(bt.preorderTraversal1(root).toString());
		System.out.println(bt.preorderTraversal2(root).toString());
		System.out.println(bt.postorderTraversal(root).toString());
	}

}
