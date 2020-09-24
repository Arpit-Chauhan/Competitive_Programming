<<<<<<< HEAD

import java.util.*;
import java.util.Collections;

public class WordCapitalization
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

	
		String s,ans;

		s=sc.nextLine();
		char p=s.charAt(0);
		if(Character.isLowerCase(p))
		p=(char)((int)p-32);
		ans=String.valueOf(p)+s.substring(1);
		
		System.out.println(ans);

		sc.close();
	}
}

=======

import java.util.*;
import java.util.Collections;

public class WordCapitalization
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

	
		String s,ans;

		s=sc.nextLine();
		char p=s.charAt(0);
		if(Character.isLowerCase(p))
		p=(char)((int)p-32);
		ans=String.valueOf(p)+s.substring(1);
		
		System.out.println(ans);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
