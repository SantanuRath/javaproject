package Programmes;

public class PraticeString11 {
//string palindrome or not
	public static void main(String[] args) {
		String s="mum";
		String rev="";
		int n=s.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		//System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
