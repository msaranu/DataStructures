package unit2.linkedlists;

import prerequisites.ListNode;

//IC
public class reversePoints {

	public ListNode reverseBetween(ListNode a, int m, int n) {
			
		    int i;
		    ListNode node = a;
		    ListNode prev = null;
		    m--;
		    n--;
		    
		    for (i = 0; i < m; i++) {
		       prev = node;
		       node = node.next;
		    }
		    
		    if (prev != null)
	    	    prev.next = getReversedList(node, n - m + 1);
	    	else
	    	    a = getReversedList(node, n - m + 1);
		    
		    return a;
		}




public ListNode getReversedList(ListNode first, int count){
	ListNode currNode = first;
	ListNode nextNode = null;
	ListNode tempNextNode = null;
	nextNode = currNode.next;
	do{
	if(nextNode !=null){
		tempNextNode = nextNode.next;
		nextNode.next = currNode;
	} else{ return first;}
	currNode = nextNode;
	nextNode = tempNextNode;
	count--;
	}while(tempNextNode!=null && count>=0);
	
	first.next = null;
	first = currNode;
	return first;
	
}
	
	
	private void traverseLinkedList(ListNode first){
		ListNode firstTemp = first;
		ListNode	firstTempPrev = null;
		if(first!=null){
			do{
				System.out.println(firstTemp.val);
				firstTempPrev = firstTemp;
				firstTemp = firstTemp.next;
			}while(firstTempPrev!=null && firstTempPrev.next!=null);
		}
	}	

	public static void main(String args[]){
		
		ListNode lNode= new ListNode(10);
		ListNode lNodeTemp= lNode;
		reversePoints s = new reversePoints();
		int start =1;
		int end =3;

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
		//ListNode fit = s.subtract(lNode);
		s.traverseLinkedList(s.reverseBetween(lNode,start,end));
			
		}
}
