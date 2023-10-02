package Programmes;

public class Pratice11 {
	//prime number
	public static void main(String []args) {
   int n=7;
	int i;	
		if(n==1) {
			System.out.println("prime starts from 2");
		}
		for( i=2;i<=n/2;i++) {
			if(n%i==0)
				System.out.println("number is not prime:"+n);
			break;
		}
		if(n==i) 
		System.out.println("number is  prime:"+n);	
	}
}
