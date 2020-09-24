<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class RestoringThreeNumbers
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,a,b,c,p,q,r;
	
		int arr[]=new int[4];
		for(i=0;i<4;i++)
			arr[i]=sc.nextInt();
		
		Arrays.parallelSort(arr);
		a=arr[0];b=arr[1];c=arr[2];n=arr[3];
		
		p=(a+b-c)/2;
		q=a-p;
		r=b-p;
		
		System.out.println(p+" "+q+" "+r);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class RestoringThreeNumbers
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,a,b,c,p,q,r;
	
		int arr[]=new int[4];
		for(i=0;i<4;i++)
			arr[i]=sc.nextInt();
		
		Arrays.parallelSort(arr);
		a=arr[0];b=arr[1];c=arr[2];n=arr[3];
		
		p=(a+b-c)/2;
		q=a-p;
		r=b-p;
		
		System.out.println(p+" "+q+" "+r);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
