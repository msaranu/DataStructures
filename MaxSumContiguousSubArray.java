package unit1.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumContiguousSubArray {
	public int maxSubArray(final List<Integer> a) {
		int sum=0;
 		int max=Integer.MIN_VALUE;
 		int maxSum =Integer.MIN_VALUE;
 		if(a.size()==1){
 			return a.get(0);
		}
 		for(int i=0; i< a.size() -1; i++){
 			sum =a.get(i);
 			maxSum=sum;
			for(int j=i+1;j<a.size();j++){
					if(sum + a.get(j) > maxSum){
 						maxSum = sum + a.get(j);
 					}
					sum = sum + a.get(j);			
			}
			if(maxSum > max){
				max = maxSum;
			}
		}
 		
 		if(max < a.get(a.size()-1)){
			return a.get(a.size()-1);
		}
 		return max;
	}
    	

	public static void main(String[] args) {
		MaxSumContiguousSubArray cont = new MaxSumContiguousSubArray();
		int arr[] = {56, -451, -222, 80, -57, -85, -304, -108, 95, -377, -282, -260, -497, -471, -97, -350, -147, 62,
				-447, -229, 78, -165, -333, -427, -59, -338, 60, -207, -247, -431, -54, -240, -426, -123, -209, 57, -74, -287,
				-70, -292, 45, -278, -408, -129, -35, 65,
				-77, -230, -426, 20, -402, -375, -449, -280, -125, -15, -21, -327, -366, 64, -211, -414, -307 
				  };
		List<Integer> la = new ArrayList<Integer>();
		for (int x : arr) {
			la.add(x);
		}
		int sum = cont.maxSubArray(la);
		System.out.println("Max sum is : " + sum);

	}

}
