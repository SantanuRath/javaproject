package Programmes;
//interview question
public class PraticeString18 {

	public static void main(String[] args) {
		
		String str="today is 17 saturday 2022";
		String st="";
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='0'&&ch<='9') {	
		}
		else
			st=st+str.charAt(i);
		}
		System.out.println(st);
		String[] str1=st.split(" ");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
		}
		}
}
