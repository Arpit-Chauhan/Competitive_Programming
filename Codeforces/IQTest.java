<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class IQTest
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,cev=0,codd=0,pos=0;
	

		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if((arr[i]&1)==1)
				codd++;
			else
				cev++;
		}
		
		if(cev>codd) {
			for(i=0;i<n;i++) {
				if(arr[i]%2!=0) {
					pos=i;break;
				}
			}
		}
		if(cev<codd) {
			for(i=0;i<n;i++) {
				if(arr[i]%2==0) {
					pos=i;break;
				}
			}
		}
		
		System.out.println(pos+1);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class IQTest
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,cev=0,codd=0,pos=0;
	

		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if((arr[i]&1)==1)
				codd++;
			else
				cev++;
		}
		
		if(cev>codd) {
			for(i=0;i<n;i++) {
				if(arr[i]%2!=0) {
					pos=i;break;
				}
			}
		}
		if(cev<codd) {
			for(i=0;i<n;i++) {
				if(arr[i]%2==0) {
					pos=i;break;
				}
			}
		}
		
		System.out.println(pos+1);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
