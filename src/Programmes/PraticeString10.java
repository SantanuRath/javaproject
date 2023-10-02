package Programmes;
import java.util.Random;
//interview question
import java.util.Scanner;

public class PraticeString10 {
	static String st[]={"rama","dama","Hari","raja"};
	static int n=st.length;
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		//int p=r.nextInt(4);
		//System.out.println("enter 2nd the number");
		int s=r.nextInt(4);
    	//int s=sc.nextInt();
	    //method(p);
//		if(p==1) {
//		for(int i=0;i<ar.length;i++) {
//			System.out.println(ar[i]);
//		}
		//}
//	    if(p==1) {
//	    	method(p);
//	    }
	     if(s==2) 
	    	methodSecond(s);
	    
	    else {
	    	System.out.println("exit");
	    }
	    	
//	    System.out.println("enter the second number");
//		int s=sc.nextInt();
//		System.out.println("enter the second number");
//		int s=sc.nextInt();
		//methodSecond(s);
//		String h[]=methodSecond(s);
//		if(s==2) {
//			for(int i=0;i<h.length;i++)
//				if(h[i]==h[1])
//			System.out.println(h[1]);
//		
//		}
//		System.out.println("enter the third number");
//		int u=sc.nextInt();
//		System.out.println("exit");
	}
	public static void method(int t) {
		for(int i=0;i<st.length;i++) {
		System.out.println(st[i]);
	}
	}
	public static void methodSecond(int q) {
		for(int i=0;i<st.length-1;i++) {
		   if(st[i]==st[3])
			   System.out.println(st[1]);
		}
	}
}
