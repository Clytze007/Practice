package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import utils.TreeNode;

public class MaxDepthBT {
	 //Definition for a binary tree node.
	 
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
	 
	 
	//add more space for no reason
	HashMap<TreeNode, Integer> treeDepth = new HashMap<TreeNode, Integer>();
	
    public int maxDepth1(TreeNode root) {
    	if (root == null) return 0;
    	if (treeDepth.containsKey(root)) return treeDepth.get(root);
    	
    	int mDepth = 0;
		mDepth = Math.max(maxDepth1(root.left), maxDepth1(root.right)) + 1;
		treeDepth.put(root, mDepth);
        return mDepth;
    }
    
    //this is the same as not passing the variable
    public int maxDepth2(TreeNode root) {
    	if (root == null) return 0;
    	return maxDepthDP(root, 0);
    }
    
    private int maxDepthDP(TreeNode root, int curDepth) {
    	if (root == null) return curDepth;
    	else {
    		return Math.max(maxDepthDP(root.left, curDepth + 1), maxDepthDP(root.right, curDepth + 1));
    	}
    }
    
    
    //right solution - recursion
    public int maxDepth3(TreeNode root){
    	if (root == null) return 0;
    	return Math.max(maxDepth3(root.left), maxDepth3(root.right)) + 1;
    }
    
    //iteration
    //DFS - LRN
    public int maxDepth4(TreeNode root) {
    	int depth = 0, maxDepth = 0;
    	Stack<TreeNode> unvisited = new Stack<TreeNode>();
    	TreeNode pre = null;
    	while (root != null || unvisited.size() != 0){
    		if (root != null) {
    			unvisited.push(root);
    			root = root.left;
    			maxDepth = Math.max(maxDepth, depth++);
    		} else if (unvisited.peek().right == pre) {
    			pre = unvisited.pop();
    			System.out.print(pre.val);
    			depth--;
    		} else {
    			root = unvisited.peek().right;
    			pre = null;
    		}
    	}
    	return maxDepth;
    }
    
    //BFS
    public int maxDepth5(TreeNode root) {
    	if (root == null) return 0;
    	Queue<TreeNode> unvisited = new LinkedList<TreeNode>();
    	unvisited.add(root);
    	int depth = 0;
    	while (unvisited.size() != 0) {
    		depth++;
    		for (int i = unvisited.size(); i > 0; i--) {
    			System.out.print(root.val);
    			if(root.left != null) unvisited.add(root.left);
    			if(root.right != null) unvisited.add(root.right);
    			root = unvisited.poll();
    		}
    	}
    	return depth;
    }
    
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length < 2) return;
        int pos = 0;
        for (int num : nums) {
        	if (num != 0) nums[pos++] = num;
        }
        while(pos < nums.length) {
        	nums[pos++] = 0;
        }
    }
    
	 
	 
}
