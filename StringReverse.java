package unit1.strings;
public class StringReverse {
	
  //Strings are immutable hence for every "i", a new string is created
  public void deriveStringReverse(String myName){
	  String reverseName="";
	  for(int i=myName.length()-1; i>=0; i--){
		reverseName  += myName.charAt(i);
	  }
	  System.out.println(reverseName);
  }
  
  //Use StringBuffer
  public void deriveStringBufferReverse(String myName){
	  StringBuffer reverseNameBuffer=new StringBuffer("");
	  for(int i=myName.length()-1; i>=0; i--){
		  reverseNameBuffer  = reverseNameBuffer.append(myName.charAt(i));
	  }
	  System.out.println(reverseNameBuffer);
  }
  
  
  //Convert String to CharArray instead of calling String's 
  //Char(i) each time
  public void deriveStringBufferReverseCharArray(String myName){
	  char[] sCharArray = myName.toCharArray();
	  StringBuffer reverseNameBuffer=new StringBuffer("");
	  for(int i=myName.length()-1; i>=0; i--){
		  reverseNameBuffer  = reverseNameBuffer.append(sCharArray[i]);
	  }
	  System.out.println(reverseNameBuffer);
  }
  
  //Convert String to CharArray instead of calling String's 
  //Char(i) each time
  public void deriveStringReverseNoBuffer(String myName){
	  char[] sCharArray = myName.toCharArray();
	  char[] sCharArrayReverse = new char[myName.length()];
	  for(int i=myName.length()-1; i>=0; i--){
		  sCharArrayReverse[i]=sCharArray[myName.length()-1-i];
	  }
	  String reverseString = new String(sCharArrayReverse);
	  System.out.println(reverseString);
  }
  
  public static void main(String args[]){
	  String myName = "Malleswari";
	  StringReverse sr = new StringReverse();
	  sr.deriveStringReverse(myName);
	  sr.deriveStringBufferReverse(myName);
	  sr.deriveStringBufferReverseCharArray(myName);
	  sr.deriveStringReverseNoBuffer(myName);
  }
}
