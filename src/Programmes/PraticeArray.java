package Programmes;

public class PraticeArray {
//bubble sort
	public static void main(String[] args) {
		int ar[]= {2,8,5,10,12,16};
		int n=ar.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i]>ar[j]) {
				int	temp = ar[i];
				     ar[i]=ar[j];
				     ar[j]= temp;	
			}
		}
		}
		for(int k=0;k<ar.length;k++) {
			System.out.println(ar[k]);
		}
	}

}
