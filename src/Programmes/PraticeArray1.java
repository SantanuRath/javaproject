package Programmes;

public class PraticeArray1 {
//find the maximum of an element
	public static void main(String[] args) {
		int ar[]= {52,96,87,45,63};
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
				if(max<ar[i]) {
					max=ar[i];
				}
			}
			System.out.println(max);	
	}
}
