package Programmes;

public class PraticeArray2 {
//bubble sort
	public static void main(String[] args) {
		int ar[]= {98,63,56,99,89};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int k=0;k<ar.length;k++) {
			System.out.println(ar[k]);
		}
	}

}
