<<<<<<< HEAD


import java.util.*;
import java.util.Collections;

public class NextRound
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,k,count,max;
		count=0;
	
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		max=arr[k-1];
		
		for(i=0;i<n;i++) {
			if(arr[i]>=max && arr[i]>0)
				count++;
		}
		
		System.out.println(count);

		sc.close();
	}
}

=======


import java.util.*;
import java.util.Collections;

public class NextRound
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,k,count,max;
		count=0;
	
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		max=arr[k-1];
		
		for(i=0;i<n;i++) {
			if(arr[i]>=max && arr[i]>0)
				count++;
		}
		
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
