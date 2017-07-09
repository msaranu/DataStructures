package prerequisites;

import java.util.Collections;
import java.util.List;

public class KthSmallest {

	public int kthsmallest(final List<Integer> a, int k) {
	    Collections.sort(a);
		return a.get(k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
