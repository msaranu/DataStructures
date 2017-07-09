package prerequisites;

import java.util.ArrayList;

public class NextGreater {
	
	ListNode first =null;
	ListNode last = null;
	
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {

	 ArrayList<Integer> alReturn = new ArrayList<Integer>();
	 push(new ListNode(a.get(0)));
 
	 for(int i=1;i<a.size();i++){
		 int current = a.get(i);
		 
		 int stackItem = pop().val;
		 while(current > stackItem ){
			 alReturn.add(current);
			 push(new ListNode(current));
			 if(isEmpty()){
				break;
			 }else{
				 stackItem = pop().val;
			 }
		 }
		 
		 if(current < stackItem){
			 push(new ListNode(current));
		 }
		 
		 push(new ListNode(stackItem));
		 
	 }
	return a;
	}
	
	
	public boolean isEmpty(){
		boolean isEmpty =false;
		if(first ==null)  isEmpty = true;
		return isEmpty;
	}
	public void push(ListNode pushI){
		if(first!=null){
			ListNode oldFirst = first;
			first = pushI;
			pushI.next = oldFirst;
		} else{
			first=pushI;
		}
	}
	
	public ListNode pop(){
		ListNode oldFirst = null;
		if(first!=null){
			oldFirst = first;
			first = first.next;;
		}
		return oldFirst;
	}

	
	public static void main(String args[]){
		ArrayList<Integer> aIn = new ArrayList<Integer>();
		aIn.add(10);
		aIn.add(11);
		aIn.add(12);
		aIn.add(13);
		aIn.add(14);
		NextGreater ng = new NextGreater();
		for(int x: aIn){
			System.out.print(x + " ");
		}
		aIn =ng.nextGreater(aIn);
		for(int x: aIn){
			System.out.print(x + " ");
		}

		
	}
	
}

