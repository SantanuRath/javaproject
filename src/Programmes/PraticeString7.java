package Programmes;

import java.util.Scanner;
//convert the string to lowercase
public class PraticeString7 {
	public static String ConvertLC(String st) {
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		String rev=new String(ch);
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String lc=ConvertLC(str);
		System.out.println("After coverting into LowerCase: "  +lc);
	}

}
