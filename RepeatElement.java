package unit1.arrays;

import java.util.ArrayList;
import java.util.List;

//pigeon hole principle
class RepeatElement
{
	public int repeatedNumber(final List<Integer> a) {
	
    {
    	int size = a.size();
        int count[] = new int[size];
        int i;
 
        for (i = 0; i < size; i++) 
        {
            if (count[a.get(i)] == 1)
                return a.get(i);
            else
                count[a.get(i)]++;
        }
    }
	return 0;
	}
 
    public static void main(String[] args)
    {
        RepeatElement repeat = new RepeatElement();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        List<Integer> la = new ArrayList<Integer>();
        for(int x : arr){
        	la.add(x);
        }
        int repeated = repeat.repeatedNumber(la);
        System.out.println("Repeated elements are : " +  repeated );

    }
}