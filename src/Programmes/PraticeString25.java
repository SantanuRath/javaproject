package Programmes;

//interview questions
import java.util.Arrays;
public class PraticeString25 {

	public static void main(String[] args) {
		String numbers = "101001";
		char ch[]=numbers.toCharArray();
		Arrays.sort(ch);
		String result = new String(ch);
		System.out.println(result);
	
	}

}
