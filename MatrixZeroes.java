package unit1.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MatrixZeroes {
	
	
	
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		
		
		boolean columnb = false;
		boolean rowb = false;

		for(int i=0 ;i< a.size(); i++){
			if(a.get(i).get(0)==0){
				columnb = true;
			}
		}

		for(int i=0 ;i< a.get(0).size(); i++){
			if(a.get(0).get(i)==0){
				rowb = true;
			}
		}
		
		for(int i=1 ;i< a.size(); i++){
			for(int j=1 ; j< a.get(0).size();j++){
				if(a.get(i).get(j) == 0){
					a.get(i).set(0,0);
					a.get(0).set(j, 0);
				}
			}
		}
		
		//Columns
		for(int i=1 ;i< a.get(0).size(); i++){
			if(a.get(0).get(i)==0){
				int row=0;
				while(row < a.size()){
					a.get(row).set(i,0);
					row++;
				}
			}
		}
		
		
		//Rows
		for(int i=1 ;i< a.size(); i++){
			if(a.get(i).get(0)==0){
				int column=0;
				while(column < a.get(0).size()){
					a.get(i).set(column,0);
					column++;
				}
			}
		}
		
		
		if(columnb){
			for(int i=0 ;i< a.size(); i++){
				a.get(i).set(0,0);
			}
		}

		if(rowb){
			for(int i=0 ;i< a.get(0).size(); i++){
				a.get(0).set(i,0);
			}
		}
	}
	
	//Brute Force Method: Find all the rows/columns corresponding to every ZERO.
	// Loop through and mark all these row/column entries to ZERO
	//Complexity = N(Square)+N(Square)
	//Involves Extra Memory, in this case two Hash Sets
	public void setZeroesOld(ArrayList<ArrayList<Integer>> a) {
		HashSet<Integer> columns = new HashSet<Integer>();
		HashSet<Integer> rows = new HashSet<Integer>();
		int m= a.size();
		int n = a.get(0).size();
		
		for(int i=0;i<m;i++){ //row
			for(int j=0; j< n; j++){ //column
				//System.out.println("Debug:" + i + " " + j );
				if(a.get(i).get(j) ==0){
					columns.add(j);
					rows.add(i);
				}
			}
		} //End For
		
		
		
		for(int row : rows){
			for(int i=0; i< n; i++){
				a.get(row).set(i,0);
			}
		}
		
		for(int column : columns){
			for(int j=0; j< m; j++){
				a.get(j).set(column,0);
			}
		}
		
		/*for(int i=0;i<m;i++){ //row
			for(int j=0; j< n; j++){ //column
				if(rows.contains(i)){
					a.get(i).set(j,0);
				}
				if(columns.contains(j)){
					a.get(i).set(j,0);
				}
			}
		}*/
	}

	public static void main(String[] args) {
		MatrixZeroes so = new MatrixZeroes();
		int matrixLengthR = 2;
		int matrixLengthC = 2;

		int x=0;
		ArrayList<ArrayList<Integer>> arryL = new ArrayList<ArrayList<Integer>>() ;

		for (int bl = 0; bl < matrixLengthR; bl++) {
			ArrayList<Integer> innerList = new ArrayList<Integer>();
			for (int al = 0; al < matrixLengthC; al++) {
				innerList.add(1);
			}
			arryL.add(innerList);
		}
		//arryL.get(27).set(37,0);
		//arryL.get(15).set(0,0);

		arryL.get(1).set(1,0);
		
		for (int i = 0; i < matrixLengthR ; i++) {
			System.out.print("\n");
			for (int j = 0; j < matrixLengthC; j++) {
				System.out.print(arryL.get(i).get(j));
				System.out.print("  ");
			}
		}
		System.out.print("\n \n");

		so.setZeroes(arryL);
		for (int i = 0; i < matrixLengthR ; i++) {
			System.out.print("\n");
			for (int j = 0; j < matrixLengthC; j++) {
				System.out.print(arryL.get(i).get(j));
				System.out.print("  ");
			}
		}
		
	

}

}
