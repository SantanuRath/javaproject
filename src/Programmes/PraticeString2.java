package Programmes;
//sum the number in string
import java.util.Scanner;

public class PraticeString2 {
	public static int SumDigits(String st) {
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=sum+ch-48;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	int sm=SumDigits(str);
	System.out.println("Sum of digits:"+sm);
	}

}
