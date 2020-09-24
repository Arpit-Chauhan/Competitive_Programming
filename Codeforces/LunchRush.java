<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class LunchRush
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,f,temp,k,max=Integer.MIN_VALUE;
		int joy=0;
		
		t=sc.nextInt();
		k=sc.nextInt();
		
		while(t-->0) {
			f=sc.nextInt();
			temp=sc.nextInt();
			
			if(temp>k)
				joy=f-(temp-k);
			else
				joy=f;
			
			if(joy>max)
				max=joy;
		}
		
		System.out.println(max);

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class LunchRush
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,f,temp,k,max=Integer.MIN_VALUE;
		int joy=0;
		
		t=sc.nextInt();
		k=sc.nextInt();
		
		while(t-->0) {
			f=sc.nextInt();
			temp=sc.nextInt();
			
			if(temp>k)
				joy=f-(temp-k);
			else
				joy=f;
			
			if(joy>max)
				max=joy;
		}
		
		System.out.println(max);

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
