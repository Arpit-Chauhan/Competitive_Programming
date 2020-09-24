<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class SoldierandBananas
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,n,k,w;
		long sum=0;
		k=sc.nextInt();
		n=sc.nextInt();
		w=sc.nextInt();
		for(i=1;i<=w;i++)
			sum+=k*i;
		if(sum>=n)
		System.out.println(sum-n);
		else
			System.out.println("0");

		sc.close();
	}
<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class SoldierandBananas
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,n,k,w;
		long sum=0;
		k=sc.nextInt();
		n=sc.nextInt();
		w=sc.nextInt();
		for(i=1;i<=w;i++)
			sum+=k*i;
		if(sum>=n)
		System.out.println(sum-n);
		else
			System.out.println("0");

		sc.close();
	}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
}