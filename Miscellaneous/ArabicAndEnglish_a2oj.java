
import java.util.*;
import java.util.Collections;

public class ArabicAndEnglish_a2oj
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,j;
		String s,ans;

		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		sc.nextLine();
		s=sc.nextLine();
		int p=0,k=0,flag=0;
		for(i=0;i<s.length();i++) {
			char q=s.charAt(i);
			if(flag!=1) {
			if((int)q>=97 && (int)q<=122) {
				p=i;
				flag=1;
			}
			}
			if(flag==1 && (q==' ' || i==s.length()-1)) {
				k=i;
				break;
			}
		}
		if(flag==1)
		ans=s.substring(k+1)+" "+s.substring(p,k)+" "+s.substring(0,p);
		else
			ans=s;
		
		ans=ans.trim();
		System.out.println(ans);

		}
		sc.close();
	}
}

