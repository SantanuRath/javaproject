package Programmes;
//remove the space
public class PriticeString9 {
	public static void main(String[] args) {
		String st=" muna is good boy ";
		String vc="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='a'&& ch<='z') {
				vc=vc+st.charAt(i)+"";
			}
			else {
				st.trim();
			}
		}
		System.out.println(vc);	
	}

}
