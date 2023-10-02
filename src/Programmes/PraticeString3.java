package Programmes;

import java.util.Scanner;
//count the vowels of a string
public class PraticeString3 {
	public static int CountVowels(String st) {
		int count=0;
		String v="AEIOUaeiou";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(v.indexOf(ch)!=-1) {
				count++;
			}	
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int cnt=CountVowels(str);
		System.out.println("No of vowels is:"+cnt);
	}

}
