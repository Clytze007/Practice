package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.RemoveNodeLL;
import utils.ListNode;

public class RemoveNodeLLTest {

	@Test
	public void test() {
		RemoveNodeLL rn = new RemoveNodeLL();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		rn.deleteNode(node3);
		rn.display(node1);
	}

}
