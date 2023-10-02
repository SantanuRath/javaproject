package Programmes;
//average of an array element
public class Array2 {

	public static void main(String[] args) {
	int a[]= {4,8,9,7,6,};
	int sum=0;
	double avg=0;
	int n=a.length;
	for(int i=0;i<n;i++) {
		sum=sum+a[i];
		avg=sum/n;
	}
	System.out.println(avg);

	}

}
