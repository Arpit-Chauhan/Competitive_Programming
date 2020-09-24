<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class LINCHESS
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,k,n,i,steps,ans=0;
	
		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		
		int flag=0,temp;
		
		steps=Integer.MAX_VALUE;
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(k%arr[i]==0) {
				int diff=k-arr[i];
				temp=diff/arr[i];
				if(temp<steps) {
					steps=temp;
					ans=arr[i];
				}
				flag=1;
			}
		}
		if(flag==0)
		System.out.println("-1");
		else
			System.out.println(ans);
		}
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class LINCHESS
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,k,n,i,steps,ans=0;
	
		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		
		int flag=0,temp;
		
		steps=Integer.MAX_VALUE;
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(k%arr[i]==0) {
				int diff=k-arr[i];
				temp=diff/arr[i];
				if(temp<steps) {
					steps=temp;
					ans=arr[i];
				}
				flag=1;
			}
		}
		if(flag==0)
		System.out.println("-1");
		else
			System.out.println(ans);
		}
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
