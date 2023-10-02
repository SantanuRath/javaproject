package Programmes;
// palindrome of string
public class PraticeString28 {

	public static void main(String[] args) {
		String s="343";
		String st="";
		for(int i=s.length()-1;i>=0;i--) {
			st=st+s.charAt(i);	
		}
		if(st.equals(s)) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}