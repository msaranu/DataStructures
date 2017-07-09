package prerequisites;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrettyPrint {


		int[][] matrixArray;
		
		public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
			ArrayList<ArrayList<Integer>> twoDArrayList;

			int arrayLength = a*2-1;
			int rectangleDim=0;
			int j=0;
			matrixArray = new int[arrayLength][arrayLength];


			twoDArrayList = new ArrayList<ArrayList<Integer>>();
					
			for(int bl=0; bl< arrayLength; bl++){
			ArrayList<Integer> innerList = new ArrayList<Integer>();
			for(int al=0; al< arrayLength; al++){
				innerList.add(0);
			}
			
			twoDArrayList.add(innerList);
			}

			
			while(a >=0){
				for(int i=rectangleDim; i< arrayLength-rectangleDim; i++){
					twoDArrayList.get(i).set(j, a);
					twoDArrayList.get(j).set(i, a);
					twoDArrayList.get(i).set(arrayLength-1-j, a);
					twoDArrayList.get(arrayLength-1-j).set(i, a);
				
				}
				rectangleDim++;
				j++;
				a--;
			}
			
		
			 return twoDArrayList;
		}
		
		public static void main(String main[]){
			PrettyPrint pp = new PrettyPrint();
			int matrixLength=20;
			ArrayList<ArrayList <Integer>> arryL = pp.prettyPrint(matrixLength);
			for(int i=0;i<matrixLength*2-1;i++){
				System.out.print("\n");
				for(int j=0;j<matrixLength*2-1;j++){
					System.out.print(arryL.get(i).get(j));
				}
			}
		}
	}
	
