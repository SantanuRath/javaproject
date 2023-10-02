package Programmes;

public class PraticeString17 {
//remover the duplicates of a string
	public static void main(String[] args) {
			  String str = "aabbcc";
			  System.out.println("The given string is: " + str);
			  System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str));
			 }
			 public static String removeDuplicateChars(String Str) {
			  char[] ch = Str.toCharArray();
			  String St = "";
			  for (char value:ch) {
			   if (St.indexOf(value)== -1) {
			    St =St+value+"";
			   }
			  }
			  return St;
			 }

}
