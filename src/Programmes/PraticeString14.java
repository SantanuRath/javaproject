package Programmes;
//occurance
public class PraticeString14 {

	public static void main(String[] args) {
		String s="munaratha";
		int n=s.length();
		char ch[]=s.toCharArray();
		//int count=0;
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
			System.out.println("Duplicates:"+ch[i]+ " " + count);
	   }	
	}
}
