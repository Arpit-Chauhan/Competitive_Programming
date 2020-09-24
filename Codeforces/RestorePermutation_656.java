<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class RestorePermutation_656
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,j;
	
		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		int arr[]=new int[2*n];
		int b[]=new int[n];
		int k=0,flag=0;
		for(i=0;i<2*n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<2*n;i++) {
			for(j=0;j<n;j++) {
				if(arr[i]==b[j]) {
					flag=1;
					break;
				}
			}		
			if(flag!=1) {
					b[k]=arr[i];
					k++;
			}
			flag=0;
		}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		}
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class RestorePermutation_656
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,j;
	
		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		int arr[]=new int[2*n];
		int b[]=new int[n];
		int k=0,flag=0;
		for(i=0;i<2*n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<2*n;i++) {
			for(j=0;j<n;j++) {
				if(arr[i]==b[j]) {
					flag=1;
					break;
				}
			}		
			if(flag!=1) {
					b[k]=arr[i];
					k++;
			}
			flag=0;
		}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		}
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
