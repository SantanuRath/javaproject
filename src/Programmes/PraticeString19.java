package Programmes;
//first non repeated character
public class PraticeString19 {

	public static void main(String[] args) {
		String s="munm";
		for(char i:s.toCharArray()) {
			if(s.indexOf(i)==s.lastIndexOf(i))
				System.out.println("First non repeted charcter is :" +i);
			break;
		}
	}
}
