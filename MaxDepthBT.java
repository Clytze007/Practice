package easy;

import java.util.Stack;

public class MaxDepthBT {
	 //Definition for a binary tree node.
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	 
	 public void inOrder(TreeNode root) {
        Stack<TreeNode> unvisited = new Stack<TreeNode>();
        while (root != null  || unvisited.size() != 0){
        	if (root != null) {
        		unvisited.push(root);
        		root = root.left;
        	} else {
        		root = unvisited.pop();
        		System.out.print(root.val);
        		root = root.right;
        	}
        }
     }
	 
	 
}
