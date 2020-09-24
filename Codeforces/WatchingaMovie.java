<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class WatchingaMovie
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,time=1,count=0;
		
		n=sc.nextInt();
		t=sc.nextInt();
		int arr[]=new int[2*n];
		
		for(i=0;i<2*n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<2*n;i+=2) {
			int diff=arr[i]-time;
			int div=diff/t;
			time+=div*t;
			count+=(arr[i+1]-time)+1;
			time=arr[i+1]+1;
		}
		System.out.println(count);
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class WatchingaMovie
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,time=1,count=0;
		
		n=sc.nextInt();
		t=sc.nextInt();
		int arr[]=new int[2*n];
		
		for(i=0;i<2*n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<2*n;i+=2) {
			int diff=arr[i]-time;
			int div=diff/t;
			time+=div*t;
			count+=(arr[i+1]-time)+1;
			time=arr[i+1]+1;
		}
		System.out.println(count);
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
