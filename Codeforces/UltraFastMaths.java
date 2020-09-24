<<<<<<< HEAD


import java.util.*;
import java.util.Collections;

public class UltraFastMaths
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int i,l,m;
		String s,t,ans,tmp1,tmp2;
		ans="";
		s=sc.nextLine();
		t=sc.nextLine();
		int len=s.length();
		
		char arr[]=s.toCharArray();
		char b[]=t.toCharArray();
		
		for(i=0;i<len;i++) {
			tmp1=String.valueOf(arr[i]);
			l=Integer.parseInt(tmp1);
			tmp2=String.valueOf(b[i]);
			m=Integer.parseInt(tmp2);
			
			ans=ans+Integer.toString(l^m);
		}
		System.out.println(ans);

		sc.close();
	}
}

=======


import java.util.*;
import java.util.Collections;

public class UltraFastMaths
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int i,l,m;
		String s,t,ans,tmp1,tmp2;
		ans="";
		s=sc.nextLine();
		t=sc.nextLine();
		int len=s.length();
		
		char arr[]=s.toCharArray();
		char b[]=t.toCharArray();
		
		for(i=0;i<len;i++) {
			tmp1=String.valueOf(arr[i]);
			l=Integer.parseInt(tmp1);
			tmp2=String.valueOf(b[i]);
			m=Integer.parseInt(tmp2);
			
			ans=ans+Integer.toString(l^m);
		}
		System.out.println(ans);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
