package Programmes;

// remove the duplicates 
public class PraticeString23 {

	public static void main(String[] args) {
		String s="santanu";
		System.out.println("Given string is :" +s);
		System.out.println("After removing duplicate :"+removeDuplicate(s));
	}
	public static String removeDuplicate(String str) {
		char ch[]=str.toCharArray();
		String st="";
		for(char w:ch) {
			if(st.indexOf(w)==-1)
				st=st+w+"";
		}
		return st;	
	}

}
