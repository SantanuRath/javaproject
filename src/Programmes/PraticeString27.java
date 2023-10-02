package Programmes;
//angram without map
import java.util.Scanner;

public class PraticeString27 {
	public static void main(String[] args) {
		
	}
	public static boolean isAnagram(String s1 , String s2)
	{
	    String delStr="";
	    String newStr="";

	    for(int i=0;i<s1.length();i++)
	    {
	        for(int j=0 ; j < s2.length() ; j++)
	        {
	            if(s1.charAt(i)==s2.charAt(j))
	            {
	                delStr=s1.substring(i,i+1);
	                newStr=s2.replace(delStr,"");
	            }
	        }           
	    }
	    if(newStr.equals(""))
	        return true;
	    else
	        return false;
	}
//	public static boolean isAnagram(String s1, String s2){
//
//        // Early termination check, if strings are of unequal lengths,
//        // then they cannot be anagrams
//        if ( s1.length() != s2.length() ) {
//            return false;
//        }
//        s1=s1.toLowerCase();
//        s2=s2.toLowerCase();
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        String sc1 = new String(c1);
//        String sc2 = new String(c2);
//        return sc1.equals(sc2);
//}
//	public static boolean isAnagram(String s1 , String s2){
//
//	    if (s1.length() != s2.length()) {
//	        return false;
//	    }
//
//	    for(int i = 0; i < s2.length(); i++) {
//
//	            if( !s1.contains("" + s2.charAt(i))) {
//	                return false;
//	            }
//
//	            s1 = s1.replaceFirst("" + s2.charAt(i), "");
//	            s2 = s2.replaceFirst("" + s2.charAt(i), "");
//	    }
//	    return true;
//	}
//	public static boolean isAnagram(String s1, String s2){
//		  if (s1.length() != s2.length()) return false;
//
//		  char[] c1 = s1.toCharArray();
//		  char[] c2 = s2.toCharArray();
//
//		  Arrays.sort(c1);
//		  Arrays.sort(c2);
//
//		  for(int i = 0; i < c1.length; i++) {
//		    if(c1[i] != c2[i]) return false;
//		  }
//
//		  return true;
//		}
//	char [] charArray = str.toCharArray();
//	if(str.length() == str1.length()){
//	    for(char ch : charArray){
//	        if(str1.indexOf(ch) == -1){
//	            System.out.println("Not Anagram");
//	        } 
//	    }    
//	    System.out.println("Anagram");
//	} else {
//	    System.out.println("Not Anagram");
//	}
//	String string1 = "fdafdas";
//	String string2 = "fdwqkjl";
//	char[] chars = string1.toCharArray();
//	char[] chars2 = string2.toCharArray();
//	Arrays.sort(chars);
//	Arrays.sort(chars2);
//	string1 = new String(chars);
//	string2 = new String(chars2);
//	if (string1.equals(string2)) {
//	    //They are an anagram
//	}
}
