package Programmes;

import java.util.Scanner;

public class PraticeString1 {
//find the capital,small,vowels,consonant,number and special character
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String st=sc.nextLine();
	int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
		if(ch>='A'&&ch<='Z') {
			uc++;
		if(ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U')
			uc++;
		else 
			cc++;
		}
		else if(ch>='a'&&ch<='z') {
			lc++;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				vc++;
			else 
				cc++;
		}
			else if(ch>='0'&&ch<='9') {
				dc++;
			}
			else
				spc++;
		}
	    System.out.println("No of capital letters:"+uc);
		System.out.println("No of small letters:"+lc);
		System.out.println("No of vowels:"+vc);
		System.out.println("No of consonants:"+cc);
		System.out.println("No of digits:"+dc);
		System.out.println("No of special character:"+spc);
	}
}
