package Programmes;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("black");
		al.add("white");
		al.add("green");
		al.add("yellow");
		al.add("white");
		for(String col:al) {
			System.out.println(col);
		}
	}
}
