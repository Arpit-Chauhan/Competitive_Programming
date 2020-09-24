<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class ColorfulStones
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,j;
		String s,t;

		s=sc.nextLine();
		t=sc.nextLine();
		j=0;
		for(i=0;i<t.length();i++) {
			if(t.charAt(i)==s.charAt(j))
				j++;
		}
		
		System.out.println(j+1);

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class ColorfulStones
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,j;
		String s,t;

		s=sc.nextLine();
		t=sc.nextLine();
		j=0;
		for(i=0;i<t.length();i++) {
			if(t.charAt(i)==s.charAt(j))
				j++;
		}
		
		System.out.println(j+1);

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
