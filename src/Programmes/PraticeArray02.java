package Programmes;

public class PraticeArray02 {
	//array element is palindrome or not
	public static boolean isPalindromeArray(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[n-i-1])
				return false;
	}
		return true;
	}
	public static void main(String[] args) {
		int ar[]= {1,1,2,2,3,1};
		int b=5;	
		boolean rs=isPalindromeArray(ar,b);	
		if(rs==true) {
			System.out.println("Array is Palindrome");
		}
		else {
			System.out.println("Array is not Palindrome");
		}
	}
}
