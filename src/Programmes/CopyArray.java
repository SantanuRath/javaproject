package Programmes;

public class CopyArray {
	
	public static void main(String[] args) {
		String s="muunarrath";
		//int ar[]= {2,4,4,18,9,9,5};
		char ch[]=s.toCharArray();
		int n=ch.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(ch[i]==ch[j]) {
					
				}		
				else {
				System.out.println("Duplicates elements are:"+ch[j]);
				}
			}
		}
		
}
}
