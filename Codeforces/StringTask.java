<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class StringTask
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i;
		String s,ans="";
		
		s=sc.nextLine();
		s=s.toLowerCase();
		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(p!='a' && p!='e' && p!='i' && p!='o' && p!='u' && p!='y') {
				ans=ans+"."+String.valueOf(p);
			}
		}
		System.out.println(ans);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class StringTask
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i;
		String s,ans="";
		
		s=sc.nextLine();
		s=s.toLowerCase();
		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(p!='a' && p!='e' && p!='i' && p!='o' && p!='u' && p!='y') {
				ans=ans+"."+String.valueOf(p);
			}
		}
		System.out.println(ans);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
