package prerequisites;

import java.util.ArrayList;

public class NextGreaterArray {

	public ArrayList<Integer> nextGreater(ArrayList<Integer> aIn) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aIReturn = new ArrayList<Integer>();
		for(int i=0;i<aIn.size();i++){
			if(i==aIn.size()-1){
				aIReturn.add(-1);
				break;
			}
			for(int j=i+1;j<aIn.size();j++){
			
				if(aIn.get(j) > aIn.get(i)){
					aIReturn.add(aIn.get(j));
					break;
				}
				if(!(aIn.get(j) > aIn.get(i)) && j==aIn.size()-1){
					aIReturn.add(-1);
					break;
				}
			}
		}
			
		return aIReturn;
	}



public static void main(String args[]){
	//34, 35, 27, 42, 5, 28, 39, 20, 28 
	ArrayList<Integer> aIn = new ArrayList<Integer>();
	aIn.add(34);
	aIn.add(35);
	aIn.add(27);
	aIn.add(42);
	aIn.add(5);
	aIn.add(28);
	aIn.add(39);
	aIn.add(20);
	aIn.add(28);
	
	NextGreaterArray ng = new NextGreaterArray();
	for(int x: aIn){
		System.out.print(x + " ");
	}
	System.out.print("\n");

	aIn =ng.nextGreater(aIn);
	for(int x: aIn){
		System.out.print(x + " ");
	}

	
}

}


