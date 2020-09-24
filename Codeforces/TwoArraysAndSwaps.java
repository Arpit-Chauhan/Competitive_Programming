<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class TwoArraysAndSwaps
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,k,i,temp;
		

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		int sum=0,j=0;
		int arr[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<n;i++)
			b[i]=sc.nextInt();
		
		Arrays.sort(arr);
		Arrays.parallelSort(b);
		for(i=n-1;i>=0;i--) {
			c[j]=b[i];
			j++;
		}		
		while(k!=0 && i!=n-1) {
			for(i=0;i<n;i++) {
				if(arr[i]<c[i]) {
					temp=arr[i];
					arr[i]=c[i];
					c[i]=temp;
					k--;
				}
				if(i==n-1 || k==0)
					break;
			}
		}
		
		for(i=0;i<n;i++)
			sum+=arr[i];
		System.out.println(sum);
		}
		
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class TwoArraysAndSwaps
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,k,i,temp;
		

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		int sum=0,j=0;
		int arr[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<n;i++)
			b[i]=sc.nextInt();
		
		Arrays.sort(arr);
		Arrays.parallelSort(b);
		for(i=n-1;i>=0;i--) {
			c[j]=b[i];
			j++;
		}		
		while(k!=0 && i!=n-1) {
			for(i=0;i<n;i++) {
				if(arr[i]<c[i]) {
					temp=arr[i];
					arr[i]=c[i];
					c[i]=temp;
					k--;
				}
				if(i==n-1 || k==0)
					break;
			}
		}
		
		for(i=0;i<n;i++)
			sum+=arr[i];
		System.out.println(sum);
		}
		
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
