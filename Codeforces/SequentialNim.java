<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class SequentialNim
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;
		

		t=sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(arr[i]!=1)
				break;
			count++;
		}
		if(count==n) {
		if(count%2!=0)
			System.out.println("First");
		else
			System.out.println("Second");
		}
		else {
			if(count%2==0)
				System.out.println("First");
			else
				System.out.println("Second");
		}
		
		}
		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class SequentialNim
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;
		

		t=sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(arr[i]!=1)
				break;
			count++;
		}
		if(count==n) {
		if(count%2!=0)
			System.out.println("First");
		else
			System.out.println("Second");
		}
		else {
			if(count%2==0)
				System.out.println("First");
			else
				System.out.println("Second");
		}
		
		}
		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
