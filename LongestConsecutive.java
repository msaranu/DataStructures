package prerequisites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutive {

	public int longestConsecutive(final List<Integer> a) {
		int max = 0;
		//ArrayList<Integer> aListDuplicate = new ArrayList<Integer>();
		Set<Integer> aListDuplicate = new HashSet<Integer>();

		for (int i = 0; i < a.size(); i++) {
			aListDuplicate.add(a.get(i));
		}
		for (int j = 0; j < a.size(); j++) {
			if (aListDuplicate.contains(a.get(j))) {
				int value = a.get(j);
				int addValue = value + 1;
				int subValue = value - 1;
				int count = 1;
				while (aListDuplicate.contains(addValue)) {
					aListDuplicate.remove(addValue);
					count++;
					addValue++;

				}

				while (aListDuplicate.contains(subValue)) {
					aListDuplicate.remove(subValue);
					count++;
					subValue--;
				}

				if (count > max) {
					max = count;
				}
			}
		}

		return max;
	}

	public static void main(String args[]) {
		LongestConsecutive lC = new LongestConsecutive();
		List<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(4);
		a.add(200);
		a.add(1);
		a.add(3);
		a.add(2);

		int max = lC.longestConsecutive(a);
		System.out.println("Max number is: " + max);
	}

}
