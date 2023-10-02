package Programmes;

public class Pratice01 {
//remove the number in a string
	public static void main(String[] args) {
		String s="ab12c";
		String str="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
				str=str+ch;
			}
		System.out.println(str);
	}
}
