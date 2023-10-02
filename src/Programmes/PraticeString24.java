package Programmes;
//using hashmap anagram
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PraticeString24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		boolean rs=isAnagram(str,str2);
		if(rs==true) {
			System.out.println("anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
	}
	public static boolean isAnagram(String word, String anagram) {
	    if (word.length() != anagram.length())
	        return false;

	    int count = 0;
	    Map<Character, Integer> map = new HashMap<>();

	    for (int i = 0; i < word.length(); i++) {
	        if (!map.containsKey(word.charAt(i)))
	            map.put(word.charAt(i), 1);
	        else
	            map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
	    }

	    for (int i = 0; i < anagram.length(); i++) {
	        if (!map.containsKey(anagram.charAt(i)))
	            return false;
	        else if (map.get(anagram.charAt(i)) >= 1)
	            map.put(anagram.charAt(i), map.get(anagram.charAt(i)) - 1);
	        else
	            return false;
	    }

	    return true;
	}
}
