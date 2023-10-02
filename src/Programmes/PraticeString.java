package Programmes;

public class PraticeString {
//ocuurance of a string
	public static void main(String[] args) {
		String s="munnass";
		int n=s.length();
		char ch[]=s.toCharArray();
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(ch[i]==ch[j]) {
					count++;
				int k=j;
				while(k<n-1) {
					ch[k]=ch[k+1];
					k++;
				}
				n--;
				j--;
				}
			}
		System.out.println(ch[i]+" occured "+count+" times");
		}
	}

}
