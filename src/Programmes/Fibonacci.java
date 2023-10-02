package Programmes;

import java.util.Scanner;

public class Fibonacci {
	public static int Fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return Fib(n-1)+Fib(n-2);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the number");
	int m=sc.nextInt();
	int f=Fib(m);
	System.out.println(f);
	}

}
