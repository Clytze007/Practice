package easy;

import java.util.Stack;

import utils.TreeNode;

public class SameTree {
    public boolean isSameTree1(TreeNode p, TreeNode q) {
    	if (p == null || q == null) {
    		return p == q;
    	}
    	Stack<TreeNode> treeP = new Stack<TreeNode>();
    	Stack<TreeNode> treeQ = new Stack<TreeNode>();
    	treeP.add(p);
    	treeQ.add(q);
    	while (treeP.size() != 0 && treeQ.size() != 0){
    		p = treeP.pop();
    		q = treeQ.pop();

    		if (p == null || q == null) {
    			if (p != q) {
    				return false;
    			} else {
    				continue;
    			}
    		}
    		if (p.val != q.val) return false;
    		
    		treeP.add(p.right);
    		treeP.add(p.left);
    		
    		treeQ.add(q.right);
    		treeQ.add(q.left);
    	}
    	return treeP.size() == treeQ.size();
//    	while ((p != null || treeP.size() != 0) &&
//    			(q != null || treeQ.size() != 0)) 
//    	{
//    		if (p == null || q == null) {
//    			if (p != q) {
//    				return false;
//    			}
//    		} else if (p.val != q.val) {
//    			return false;
//    		}
//    		
//    		if(p != null) {
//    			treeP.add(p); treeQ.add(q);
//    			p = p.left; q = q.left;
//    		} else {
//    			p = treeP.pop().right; 
//    			q = treeQ.pop().right;
//    		}
//    	}
//        return q == p;
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p == null || q == null) {
    		return p == q;
    	}
    	return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
