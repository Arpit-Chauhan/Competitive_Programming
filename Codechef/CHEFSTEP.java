<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class CHEFSTEP
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,k;
		

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		String s="";
		int arr[]=new int[n];
			
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(arr[i]%k==0)
				s=s+"1";
			else
				s=s+"0";
		}
		System.out.println(s);
			
		}
		

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class CHEFSTEP
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,k;
		

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		String s="";
		int arr[]=new int[n];
			
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(arr[i]%k==0)
				s=s+"1";
			else
				s=s+"0";
		}
		System.out.println(s);
			
		}
		

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
