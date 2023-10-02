package Programmes;
//reverse only one word in a string
import java.util.ArrayList;

public class PraticeString8 {
	
	public static void main(String[] args) {
		String s="muna is a good boy";
		String st[]=s.split(" ");
		ArrayList<String> as=new ArrayList<String>();
		for(String w:st) {
			as.add(w);
		}
		String text = as.get(4);
		//System.out.println(text);
		String rev="";
		for(int i=text.length()-1;i>=0;i--) {
			char ch=text.charAt(i);
			rev=rev+text.charAt(i);
		}
		//System.out.println(rev);	
		String w = s.substring(0,15);
		//System.out.println(w);
		System.out.println(w+ rev );	
	}
}
