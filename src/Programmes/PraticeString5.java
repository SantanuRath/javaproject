package Programmes;
//string is palindrome or not
import java.util.Scanner;

public class PraticeString5 {
	public static boolean isPalindrome(String st) {
		int i=0,j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		boolean rs=isPalindrome(str);
		if(rs==true)
			System.out.println(str+"is palindrome");
		else
			System.out.println(str+"is not palindrome");
	}

}
