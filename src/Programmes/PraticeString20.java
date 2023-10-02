package Programmes;

import java.util.Arrays;

//sort an numeric array and string array
public class PraticeString20 {
	
	public static void main(String[] args) {
		int arr[]= {5,9,3,1,2,7,4,6,8,};
		String[] st= {"java","API","Kotlin","Flutter"};
		System.out.println("Original array" +Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sprting" +Arrays.toString(arr));
		System.out.println("Original array" +Arrays.toString(st));
		Arrays.sort(st);
		System.out.println("After sprting" +Arrays.toString(st));
	}
	
}
