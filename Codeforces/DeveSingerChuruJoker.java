<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class DeveSingerChuruJoker
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,tempt1=0;

		n=sc.nextInt();
		t=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++)
			tempt1+=arr[i];
		
		
		if(tempt1+(n-1)*10>t)
			System.out.println("-1");
		else
			System.out.println((t-tempt1)/5);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class DeveSingerChuruJoker
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,tempt1=0;

		n=sc.nextInt();
		t=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++)
			tempt1+=arr[i];
		
		
		if(tempt1+(n-1)*10>t)
			System.out.println("-1");
		else
			System.out.println((t-tempt1)/5);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
