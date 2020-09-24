<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class Puzzles
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int m,n,i,min=Integer.MAX_VALUE;
		

		n=sc.nextInt();
		m=sc.nextInt();
		
		int arr[]=new int[m];
		
		for(i=0;i<m;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		for(i=0;i<=m-n;i++) {
			if(arr[i+n-1]-arr[i]<min)
				min=arr[i+n-1]-arr[i];
		}
		
		System.out.println(min);

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class Puzzles
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int m,n,i,min=Integer.MAX_VALUE;
		

		n=sc.nextInt();
		m=sc.nextInt();
		
		int arr[]=new int[m];
		
		for(i=0;i<m;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		for(i=0;i<=m-n;i++) {
			if(arr[i+n-1]-arr[i]<min)
				min=arr[i+n-1]-arr[i];
		}
		
		System.out.println(min);

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
