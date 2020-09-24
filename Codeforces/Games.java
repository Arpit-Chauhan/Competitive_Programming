<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class Games
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count;
		count=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		int b[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)
					continue;
				if(arr[i]==b[j])
					count++;
			}
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

public class Games
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count;
		count=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		int b[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)
					continue;
				if(arr[i]==b[j])
					count++;
			}
		}
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
