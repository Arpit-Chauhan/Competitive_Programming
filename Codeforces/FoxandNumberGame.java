<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class FoxandNumberGame
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int sum=0,n,i,j,flag=0;
		
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		while(true) {
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)
					continue;
				if(arr[j]<arr[i]) 
					arr[i]-=arr[j];
			}
			
		}
		flag=0;
		for(i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				flag=1;break;
			}
		}
		if(flag==0)
			break;
		
		}
		for(i=0;i<n;i++)
			sum+=arr[i];
		System.out.println(sum);

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class FoxandNumberGame
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int sum=0,n,i,j,flag=0;
		
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		while(true) {
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)
					continue;
				if(arr[j]<arr[i]) 
					arr[i]-=arr[j];
			}
			
		}
		flag=0;
		for(i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				flag=1;break;
			}
		}
		if(flag==0)
			break;
		
		}
		for(i=0;i<n;i++)
			sum+=arr[i];
		System.out.println(sum);

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
