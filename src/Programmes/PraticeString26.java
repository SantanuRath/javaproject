package Programmes;

//split the name with star programe
public class PraticeString26 {

	public static void main(String[] args) {
		String s="muna";
		String[] st=s.split("");
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(st[j]);
			}
			System.out.println("");
		}
	}
}
 