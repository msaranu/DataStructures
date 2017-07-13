package unit1.strings;

public class StringWordReverse {
	
	public String reverseWords(String a) {
		if(a== null || a.isEmpty()){
			return "";
		}
		String[] splitString = a.split("\\s+"); 
		StringBuffer sb = new StringBuffer("");
		for(int i=splitString.length-1;i>=0;i--){
			sb.append(splitString[i]);	
			sb.append(" ");
		}
		return sb.substring(0, sb.length()-1);
	}

public static void main(String args[]){
	  String myName = " . reverse      now is String The ";
	  StringWordReverse rw = new StringWordReverse();
	  String reverseString = rw.reverseWords(myName);
	  System.out.println(reverseString);
}
}

