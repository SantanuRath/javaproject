package Programmes;
//count special character of a string
import java.util.Scanner;

public class PriticeString4 {
	public static int CountSplchar(String st) {
		int count=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if((ch>='a'&& ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&& ch<='9')==false)
				count++;	
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int cnt=CountSplchar(str);
		System.out.println("No of specialcharacter is:"+cnt);
	}
}
