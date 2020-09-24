<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class EvenOdds
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		long k;
		long n;

		n=sc.nextLong();
		k=sc.nextLong();
		long temp;
		if(n%2==0)
			temp=n/2;
		else
			temp=(n+1)/2;
		
		
		if(k<=temp)
			System.out.println(k*2-1);
		if(k>temp)
			System.out.println((k-temp)*2);
		
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class EvenOdds
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		long k;
		long n;

		n=sc.nextLong();
		k=sc.nextLong();
		long temp;
		if(n%2==0)
			temp=n/2;
		else
			temp=(n+1)/2;
		
		
		if(k<=temp)
			System.out.println(k*2-1);
		if(k>temp)
			System.out.println((k-temp)*2);
		
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
