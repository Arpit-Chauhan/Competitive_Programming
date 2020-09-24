<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;

public class RemoveSmallest_661
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,diff;
		t=sc.nextInt();
		while(t-->0) {
			
			n=sc.nextInt();
			int arr[]=new int[n];
			int flag=0;
			for(i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			Arrays.sort(arr);
			for(i=0;i<n-1;i++) {
				diff=Math.abs(arr[i+1]-arr[i]);
				if(diff>1) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;

public class RemoveSmallest_661
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,diff;
		t=sc.nextInt();
		while(t-->0) {
			
			n=sc.nextInt();
			int arr[]=new int[n];
			int flag=0;
			for(i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			Arrays.sort(arr);
			for(i=0;i<n-1;i++) {
				diff=Math.abs(arr[i+1]-arr[i]);
				if(diff>1) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
