<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class GennadyandCardGame
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,flag=0;
		String s;
		s=sc.nextLine();
		
		String[] arr=new String[5];
		
		for(i=0;i<5;i++)
			arr[i]=sc.next();
		
		for(i=0;i<5;i++) {
		if(arr[i].charAt(0)==s.charAt(0) || arr[i].charAt(1)==s.charAt(1)) {
			flag=1;
			break;
		}
		}
		
		if(flag==1)
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

public class GennadyandCardGame
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,flag=0;
		String s;
		s=sc.nextLine();
		
		String[] arr=new String[5];
		
		for(i=0;i<5;i++)
			arr[i]=sc.next();
		
		for(i=0;i<5;i++) {
		if(arr[i].charAt(0)==s.charAt(0) || arr[i].charAt(1)==s.charAt(1)) {
			flag=1;
			break;
		}
		}
		
		if(flag==1)
		System.out.println("YES");
		else
			System.out.println("NO");

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
