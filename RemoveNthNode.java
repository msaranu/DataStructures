package unit2.linkedlists;

import prerequisites.ListNode;

public class RemoveNthNode {

	public ListNode removeNthFromEnd(ListNode a, int b) {
		if (a == null) {
			return null;
		}

		int size = getSize(a);
		int index = size - b;
		ListNode node = a;
		ListNode prev = null;

		if (b >= size) {
			if(a.next != null){
				a= a.next;
			}else{
				a= null;
			}
			return a;
		}

		for (int i = 0; i < size; i++) {
			
			if (i == index) {
				prev.next = node.next;
				break;
			}
			prev = node;
			node = node.next;
		}
		return a;

	}

	private void traverseLinkedList(ListNode first) {
		ListNode firstTemp = first;
		ListNode firstTempPrev = null;
		if (first != null) {
			do {
				System.out.println(firstTemp.val);
				firstTempPrev = firstTemp;
				firstTemp = firstTemp.next;
			} while (firstTempPrev != null && firstTempPrev.next != null);
		}
	}

	public int getSize(ListNode first) {
		int count = 0;
		ListNode firstTemp = first;
		ListNode prevFirstTemp = null;
		if (first != null) {
			do {
				prevFirstTemp = firstTemp;
				firstTemp = firstTemp.next;
				count++;
			} while (prevFirstTemp != null && prevFirstTemp.next != null);
		}
		return count;
	}

	public static void main(String args[]) {

		ListNode lNode = new ListNode(10);
		ListNode lNodeTemp = lNode;
		RemoveNthNode s = new RemoveNthNode();

		lNode.next = new ListNode(20);
		lNode.next.next = new ListNode(30);
		lNode.next.next.next = new ListNode(40);
		lNode.next.next.next.next = new ListNode(50);
		lNode.next.next.next.next.next = new ListNode(60);
		lNode.next.next.next.next.next.next = new ListNode(70);
		lNode.next.next.next.next.next.next.next = new ListNode(80);

		System.out.print("\nTraversed List Before: \n");
		s.traverseLinkedList(lNode);
		System.out.print("\nTraversed List After: \n ");
		// ListNode fit = s.subtract(lNode);
		s.traverseLinkedList(s.removeNthFromEnd(lNode, 8));

	}
}
