package prerequisites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniquePerm {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		
		ArrayList<ArrayList<Integer>> rList = new ArrayList<ArrayList<Integer>>();
		rList.add(new ArrayList<Integer>());
	 
		for (int i = 0; i < a.size(); i++) {
			Set<ArrayList<Integer>> permSet = new HashSet<ArrayList<Integer>>();
			for (ArrayList<Integer> perm : rList) {
				for (int j = 0; j < perm.size()+1; j++) {
					perm.add(j, a.get(i));
					ArrayList<Integer> nAList = new ArrayList<Integer>(perm);
					perm.remove(j);
					permSet.add(nAList);
				}
			}
			rList = new ArrayList<ArrayList<Integer>>(permSet);
		}
	 
		return rList;
	}
	
	public static void main(String args[]) {
		UniquePerm uP = new UniquePerm();
		ArrayList<Integer> lElements = new ArrayList<Integer>();
		int[] arrayValues ={1,2,3};
		for(int x: arrayValues){
			lElements.add(x);
		}
		ArrayList<ArrayList <Integer>> arryL = uP.permute(lElements);
		
		for(ArrayList <Integer> aL: arryL){
			System.out.print("\n");
			for(Integer aList: aL){
				System.out.print(aList + " ");
			}
		}
		}
}
