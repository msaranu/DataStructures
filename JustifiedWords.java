package unit1.strings;

import java.util.ArrayList;

public class JustifiedWords {

	public ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		ArrayList<String> justifiedString = new ArrayList<String>();
		int i = 0;
		int wLength = 0;
		String jString = "";
		while (i < a.size()) {
			wLength = 0;
			jString = "";
			String finalString = "";

			while (wLength < b) {
				if ( i < a.size() && a.get(i).length() + 1 + wLength <= b ) {
					wLength += a.get(i).length() + 1;
					jString += a.get(i) + " ";
					if(wLength == b){
						justifiedString.add(jString);
					}
					i++;
				} else {
					int jStringLength = jString.length();
					String[] jStringArray = jString.split(" ");
					if(jStringArray.length ==1){
						justifiedString.add(jString);
						break;
					}
					for (int d = 0; d < jStringArray.length; d++) {
						String j = jStringArray[d];
						finalString += j;
						int strLength = jStringArray.length - 1;
						int spaces = (int) Math.ceil(((b - (double) (jStringLength - strLength)) / strLength));
						if (d != jStringArray.length - 1) {
							for (int x = 0; x < spaces; x++) 
								finalString += " ";
						}

					}
					wLength = finalString.length();
					justifiedString.add(finalString);

				}
			}

		}
		return justifiedString;

	}

	public static void main(String args[]) {
		JustifiedWords jw = new JustifiedWords();
		ArrayList<String> al = new ArrayList<String>();
		int length = 16;
		String[] sArray = { "This", "is", "an", "example", "of", "text", "justification." };
		for (String s : sArray) {
			al.add(s);
		}
		ArrayList<String> alRespone = jw.fullJustify(al, length);
		for( String s : alRespone){
			System.out.print(s+"\n");
		}
	}
}
