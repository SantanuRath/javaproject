package Programmes;
//happy number
public class PraticeNumber1 {

	public static void main(String[] args) {
		int n=10;
		
		while(n>9) {
			int sum=0;
			do {
			 int d = n%10;
			 sum=sum+d*d;
			 n=n/10;
		}while(n!=0);
			n=sum;
		}
		if(n==1||n==7) {
			System.out.println("happy number");
		}
		else {
			System.out.println("Not ahappy number");
		}
	
	}
}
