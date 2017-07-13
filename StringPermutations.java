package unit1.strings;

public class StringPermutations {
	
	public static void permutate(String str) {
		  permutation("", str);
		}
		  
		private static void permutation(String ans, String remain) {
		   System.out.println("permutation(" + ans +","+ remain + ")\n");

		  int n = remain.length();
		  // ans serves as an accumulator variable
		  // base case: we print out ans since there are no more letters to be added
		  if (n == 0) {
		    System.out.println(ans +"\n");
		  }
		  // recursive case
		  else {
		    for (int i = 0; i < n; i++) {
		      // we call permutation, each time combining prefix with the individual letters in str
		      // we also remove these letters from str
				  System.out.println("i is: " + i + " and ans is " + ans +" and remain is: " + remain +"\n");
		      permutation(ans + remain.charAt(i), remain.substring(0,i) + remain.substring(i+1, n));
			  //System.out.println("i is " + i +"\n");

		    }
		  }
		}
		
		public static void main(String args[]){
			StringPermutations pt = new StringPermutations();
			permutate("abc");
		}

}
