package unit1.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Incomplete
public class RepeatMissing {

	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> aLRepeat = new ArrayList<Integer>();
		Collections.sort(a);
		int sum=0;
		for(int i=0;i<=a.size();i++){
			if(a.get(i) == a.get(i+1)){
				aLRepeat.add(a.get(i));
			}
			if(a.get(i) != a.get(i)+1){
				aLRepeat.add(a.get(i));
				sum = sum +1;
			} else{
				sum = a.get(i);
			}
		}
		return aLRepeat;
	}
	public static void main(String[] args) {
		RepeatMissing cont = new RepeatMissing();
		int arr[] = {3,4,6,1,2,3}; 
		List<Integer> la = new ArrayList<Integer>();
		for (int x : arr) {
			la.add(x);
		}
		ArrayList<Integer> aList = cont.repeatedNumber(la);
		for (int x : aList) {
			System.out.println(x + " ");
		}

	}

}
