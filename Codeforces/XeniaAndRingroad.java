<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class XeniaAndRingroad
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int m,n,i;
		long count=0;

		n=sc.nextInt();
		m=sc.nextInt();
		int arr[]=new int[m];
		
		for(i=0;i<m;i++)
			arr[i]=sc.nextInt();
		
		count=arr[0]-1;
		for(i=1;i<m;i++) {
			if(arr[i]<arr[i-1])
				count+=n-arr[i-1]+arr[i];
			else
				count+=arr[i]-arr[i-1];
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

public class XeniaAndRingroad
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int m,n,i;
		long count=0;

		n=sc.nextInt();
		m=sc.nextInt();
		int arr[]=new int[m];
		
		for(i=0;i<m;i++)
			arr[i]=sc.nextInt();
		
		count=arr[0]-1;
		for(i=1;i<m;i++) {
			if(arr[i]<arr[i-1])
				count+=n-arr[i-1]+arr[i];
			else
				count+=arr[i]-arr[i-1];
		}
		System.out.println(count);

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
