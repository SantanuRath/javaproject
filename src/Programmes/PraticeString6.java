package Programmes;
//reverse the string
import java.util.Scanner;

public class PraticeString6 {
	public static String Reverse(String st) {
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			char ch=st.charAt(i);
			rev=rev+st.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String rv=Reverse(str);
		System.out.println(rv);
	}

}
