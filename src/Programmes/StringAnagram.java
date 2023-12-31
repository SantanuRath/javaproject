package Programmes;
//anagram
import java.util.Scanner;

public class StringAnagram {

	public static String removeSpace(String str) {
		char ch[] = str.toCharArray();
		String nstr = " ";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				nstr = nstr + ch[i];
			}
		}
		return str;
	}
	static String toLowercase(String str) {
		char ch[] = str.toCharArray();
		String nstr = " ";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				nstr = nstr + ((char) ch[i] + 32);
			} else {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}
	static String sort(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
		String ts = new String(ch);
		return ts;
	}
	static boolean Compare(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			s1 = toLowercase(s1);
			s2 = toLowercase(s2);
			s1 = sort(s1);
			s2 = sort(s2);
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String");
		String s2 = sc.nextLine();
		// s1=removeSpace(s1);
		// s2=removeSpace(s2);
		boolean b = Compare(s1, s2);
		if (b)
			System.out.println("String is anagram");
		else
			System.out.println("String is not anagram");
	}
}
