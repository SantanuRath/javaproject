package Programmes;

public class Array3 {

	public static void main(String[] args) {
		int ar[]= {55,89,99,66,77};
		int specific=ar[2];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==specific)
				System.out.print(specific);
		}
	}
}
