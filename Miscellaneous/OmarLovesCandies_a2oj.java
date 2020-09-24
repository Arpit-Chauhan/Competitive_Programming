
import java.util.*;
import java.util.Collections;

public class OmarLovesCandies_a2oj
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,i,j;
		String s;

		t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
		s=sc.nextLine();
		int max=0,count=0;
		char ans='z';
		
		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
			for(j=0;j<s.length();j++) {
				char m=s.charAt(j);
				if(p==m)
					count++;
			}
			if(count>max) {
				max=count;
				ans=p;
			}
			if(count==max) {
				if((int)p<(int)ans) 
					ans=p;
			}
			count=0;
		}
		System.out.println(max+" "+ans);
		
		}
		sc.close();
	}

}
