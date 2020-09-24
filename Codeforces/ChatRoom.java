<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class ChatRoom
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,i,j,pos=-1;
		String s,ans="",str="hello";

		s=sc.nextLine();
		
		for(i=0;i<5;i++) {
			char p=str.charAt(i);
		for(j=pos+1;j<s.length();j++) {
			char q=s.charAt(j);
			if(p==q) {
				ans=ans+q;
				pos=j;
				break;
			}
		}
		}
		if(ans.equals("hello"))
		System.out.println("YES");
		else
			System.out.println("NO");

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class ChatRoom
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,i,j,pos=-1;
		String s,ans="",str="hello";

		s=sc.nextLine();
		
		for(i=0;i<5;i++) {
			char p=str.charAt(i);
		for(j=pos+1;j<s.length();j++) {
			char q=s.charAt(j);
			if(p==q) {
				ans=ans+q;
				pos=j;
				break;
			}
		}
		}
		if(ans.equals("hello"))
		System.out.println("YES");
		else
			System.out.println("NO");

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
