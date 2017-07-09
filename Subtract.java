package prerequisites;

public class Subtract {

	
	public int getSize(ListNode first){
		int count=0;
		ListNode firstTemp = first;
		ListNode prevFirstTemp=null;
		if(first != null){
			do {
				prevFirstTemp = firstTemp;
				firstTemp = firstTemp.next;
				count++;
			}while(prevFirstTemp!=null && prevFirstTemp.next != null);
		}
		return count;
	}
	
	
	public ListNode getNthNode(ListNode first, int n){
		int count =1;
		ListNode firstTemp = first;
		ListNode prevFirstTemp = null;
		
		if(first != null){
			if(n==0){
				return firstTemp;
			}
			do{
				count++;
				prevFirstTemp = firstTemp;
				firstTemp = firstTemp.next;
				if(count==n){
					return firstTemp;
				}
			}while(prevFirstTemp!=null && prevFirstTemp.next !=null);
		}
		return firstTemp;
	}
	
	
	public ListNode getReversedList(ListNode first){
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
		}while(tempNextNode!=null);
		
		first.next = null;
		first = currNode;
		return first;
		
	}
	
	public ListNode subtract(ListNode first) {

		ListNode firstTemp = copyLinkedList(first);
		ListNode preservedFirstNode = firstTemp;
		ListNode reversedList = getReversedList(first);
		if(firstTemp !=null){
			int sizeLL = getSize(firstTemp);
			for(int i=0;i<sizeLL/2 ;i++){
				
				if(sizeLL == 1){
					return firstTemp;
				}
				
				//Get the corresponding n-1th node. High Complexity
				//ListNode NthNode = getNthNode(first,sizeLL-i);
				//firstTemp.val = NthNode.val-firstTemp.val;
				
				//Get reversed list 
				firstTemp.val = reversedList.val-firstTemp.val;
				firstTemp = firstTemp.next;
				reversedList = reversedList.next;
			}
		}
		
	return preservedFirstNode;
	}
	
	
	private ListNode copyLinkedList(ListNode first) {
		ListNode firstTemp = first;
		// TODO Auto-generated method stub
		ListNode LNNew = null;
		ListNode LNOld = null;
		ListNode LNFirst = null;
		ListNode firstTempPrev =null;
		
		do{
			LNNew= new ListNode(firstTemp.val);
			if(LNOld !=null){
				LNOld.next = LNNew;
			}else{
				LNFirst = LNNew;
			}
			
			LNOld= LNNew;
			firstTempPrev = firstTemp;
			firstTemp = firstTemp.next;
		}while(firstTempPrev!=null && firstTempPrev.next!=null);
		
		return LNFirst;
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
	Subtract s = new Subtract();
	/*for(int i=2;i<=11;i++){
		lNodeTemp.next = new ListNode(i,null);
		lNodeTemp = lNodeTemp.next;
	}*/
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
	s.traverseLinkedList(s.subtract(lNode));
		
	}
}
	
	
	
	