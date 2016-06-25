package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.MaxDepthBT;
import utils.TreeNode;

public class MaxDepthBTTest {

	@Test
	public void test() {
		MaxDepthBT mdBt = new MaxDepthBT();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(6);
		root.left.right.left.left = new TreeNode(7);
		
		System.out.println(mdBt.maxDepth2(root));
		
		System.out.println("\ndepth: " + mdBt.maxDepth5(root));
	}

}
