package Programmes;

//find the longest word in a string
public class Pratice1 {

	public static void main(String[] args) {
		 String sentence= "Today is the happiest day of my life";
	        String[] word = sentence.split(" ");
	        String longword = "";
	        for (int i = 0;i<word.length;i++) {
	            
	                if (word[i].length()>=longword.length()) {
	                    longword = word[i];
	                }
	        }
	        System.out.println(longword);
//	        System.out.println(longword.length());
	}
}
