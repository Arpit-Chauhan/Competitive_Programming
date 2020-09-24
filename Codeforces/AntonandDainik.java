<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class AntonandDainik
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,ca,cd;
		ca=cd=0;
		String s;

		n=sc.nextInt();
		sc.nextLine();
		s=sc.nextLine();
		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
					if(p=='A')
						ca++;
					else
						cd++;
		}
		if(ca>cd)
		System.out.println("Anton" );
		if(cd>ca)
			System.out.println("Danik");
		if(ca==cd)
			System.out.println("Friendship" );

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class AntonandDainik
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,ca,cd;
		ca=cd=0;
		String s;

		n=sc.nextInt();
		sc.nextLine();
		s=sc.nextLine();
		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
					if(p=='A')
						ca++;
					else
						cd++;
		}
		if(ca>cd)
		System.out.println("Anton" );
		if(cd>ca)
			System.out.println("Danik");
		if(ca==cd)
			System.out.println("Friendship" );

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
