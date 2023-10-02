package Programmes;

import java.util.Scanner;
//string to uppercase
public class PraticeString16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st = in.nextLine();
		int l = st.length();
		st=st.toUpperCase();
		for(int i =65;i<=90;i++)
		{
		for(int j=0;j<l;j++)
		{
		char ch = st.charAt(j);
		if(i==ch)
		System.out.print((char)i+" ");
		}
	}
	}
}
