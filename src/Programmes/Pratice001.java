package Programmes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//for sorting the number in insertion order interview question

public class Pratice001 {
	
	public static void main(String[] args) {
		String s="001101";
		char[] st=s.toCharArray();
		List<Character> al=new ArrayList<Character>();
		for(char w:st) {
			al.add(w);
		}
		Collections.sort(al);
		for(Character a:al)
			System.out.print(a);
	}
  }