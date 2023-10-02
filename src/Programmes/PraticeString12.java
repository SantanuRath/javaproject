package Programmes;

public class PraticeString12 {
//lenth of a  String without using length method 
	public static void main(String[] args) {
		String s="muna";
		int count=0;
		for(char c:s.toCharArray()) {
			count++;
		}
		System.out.println("Length is:"+count);
	}
}
