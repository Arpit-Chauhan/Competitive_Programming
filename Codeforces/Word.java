<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class Word
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,lcount,ucount;
		String s;
		lcount=ucount=0;

		s=sc.nextLine();
		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(Character.isLowerCase(p))
				lcount++;
			else
				ucount++;
		}
		if(lcount>=ucount)
		System.out.println(s.toLowerCase());
		else
			System.out.println(s.toUpperCase());

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class Word
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,lcount,ucount;
		String s;
		lcount=ucount=0;

		s=sc.nextLine();
		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(Character.isLowerCase(p))
				lcount++;
			else
				ucount++;
		}
		if(lcount>=ucount)
		System.out.println(s.toLowerCase());
		else
			System.out.println(s.toUpperCase());

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
