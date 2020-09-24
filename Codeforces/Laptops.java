<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class Laptops
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,flag=0;
		t=sc.nextInt();
		int a,b;
		while(t-->0) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a!=b) {
				flag=1;break;
			}
		}
		
		if(flag==1)
		System.out.println("Happy Alex");
		else
			System.out.println("Poor Alex");

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class Laptops
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,flag=0;
		t=sc.nextInt();
		int a,b;
		while(t-->0) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a!=b) {
				flag=1;break;
			}
		}
		
		if(flag==1)
		System.out.println("Happy Alex");
		else
			System.out.println("Poor Alex");

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
