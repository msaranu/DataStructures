package prerequisites;

import java.util.ArrayList;

public class NumRange {
	public int numRange(ArrayList<Integer> lElements, int startRange, int endRange) {

		int sum = 0;
		int count = 0;

		/*
		 * while (!lElements.isEmpty()) { for (int i = 0; i < lElements.size();
		 * i++) { sum = sum + lElements.get(i);
		 * 
		 * if (sum >= startRange && sum <= endRange) { count++; } if(sum >
		 * endRange || (sum <=endRange && sum >= startRange && i ==
		 * lElements.size() - 1) || (sum < startRange && i == lElements.size() -
		 * 1)) { lElements.remove(0); sum = 0; break; } } }
		 */
		if (lElements.isEmpty()) {
			return 0;
		}

		for (int j = 0; j < lElements.size(); j++) {
			sum = 0;
			for (int i = j; i < lElements.size(); i++) {
				sum = sum + lElements.get(i);

				if (sum >= startRange && sum <= endRange) {
					count++;
				}
				if (sum > endRange) {
					// lElements.remove(0);
					// sum = 0;
					break;
				}
			}
		}
		return count;

	}

	public static void main(String args[]) {
		NumRange nR = new NumRange();
		int startRange =10;
		int endRange =18;
		ArrayList<Integer> lElements = new ArrayList<Integer>();
		int[] arrayValues ={8,16,1,5,6,9,10, 80,55,32,8,38,40,38,23,74,81,42,28,16,66,35};
		for(int x: arrayValues){
			lElements.add(x);
		}
		int count = nR.numRange(lElements, startRange, endRange);
		System.out.print("Count is: " + count);
			
		}
		
		
	}

