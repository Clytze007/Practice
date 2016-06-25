package easy;

import utils.ListNode;

public class RemoveNodeLL {
    public void deleteNode(ListNode node) {
    	if (node.next != null) {
    		ListNode next = node.next;
    		node.val = next.val;
    		node.next = next.next;
    	}
    }
    
	public void display(ListNode node) {
		while (node != null) {
			System.out.print(node.val);
			node = node.next;
		}
	}
}
