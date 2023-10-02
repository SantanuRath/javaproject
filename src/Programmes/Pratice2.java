package Programmes;

public class Pratice2 {

	public static void main(String[] args) {
       
           String s="santanu";
           char ch[]=s.toCharArray();
           int n=s.length();
           for(int i=0;i<n;i++) {
        	   int count=1;
        	   for(int j=i+1;j<n;j++) {
        		   if(ch[i]==ch[j]) {
        			   count++;
        		   int k=j;
        		   while(k<n-1){
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
