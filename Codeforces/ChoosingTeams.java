<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class ChoosingTeams
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int k,n,i,count=0;
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		for ( i = 0; i < arr.length; i++) 
			arr[i]=sc.nextInt()+k;
		
		for ( i = 0; i < arr.length; i++) {
			if(arr[i]<=5)
				count++;
		}
			
		System.out.println(count/3);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class ChoosingTeams
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int k,n,i,count=0;
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		for ( i = 0; i < arr.length; i++) 
			arr[i]=sc.nextInt()+k;
		
		for ( i = 0; i < arr.length; i++) {
			if(arr[i]<=5)
				count++;
		}
			
		System.out.println(count/3);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
