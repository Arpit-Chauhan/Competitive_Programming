<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class Translation
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i;
		String s,t,ans;
		ans="";
		s=sc.nextLine();
		t=sc.nextLine();
		for(i=s.length()-1;i>=0;i--) {
			char p=s.charAt(i);
			ans=ans+String.valueOf(p);
		}
		if(ans.equals(t))
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

public class Translation
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i;
		String s,t,ans;
		ans="";
		s=sc.nextLine();
		t=sc.nextLine();
		for(i=s.length()-1;i>=0;i--) {
			char p=s.charAt(i);
			ans=ans+String.valueOf(p);
		}
		if(ans.equals(t))
		System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
