package Programmes;

// reverse the sentence
public class PraticeString22 {

	public static void main(String[] args) {
		String s="muna is a good boy";
		String[] ch=s.split(" ");
		String sen="";
		for(String w:ch) {
			String revword=" ";
			for(int i=w.length()-1;i>=0;i--) {
				revword=revword+w.charAt(i);
			}
			sen=sen+revword;
		}
		System.out.println(sen);
			
	}

}
