package Programmes;
//convert all the vowels in the string to capitals
public class PraticeString13 {

	public static void main(String[] args) {
		String s="Muna";
		String v="AEIOUaeiou";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z')
				if(v.indexOf(ch[i])!=-1)
					ch[i]=(char)(ch[i]-32);
		    else if(ch[i]>='A'&&ch[i]<='Z')
					if(v.indexOf(ch[i])!=-1)	
						ch[i]=(char)(ch[i]+32);
		}
		String rev=new String(ch);
		System.out.println(rev);
	}

}
