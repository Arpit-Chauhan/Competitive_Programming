<<<<<<< HEAD

import java.util.*;
import java.util.Collections;

public class PerfectPermutation
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i;

		n=sc.nextInt();
		if(n==1 || n%2!=0)
			System.out.println("-1");
		else
		{
			for(i=n;i>=1;i--)
				System.out.print(i+" ");
		}
		sc.close();
	}
}

=======

import java.util.*;
import java.util.Collections;

public class PerfectPermutation
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i;

		n=sc.nextInt();
		if(n==1 || n%2!=0)
			System.out.println("-1");
		else
		{
			for(i=n;i>=1;i--)
				System.out.print(i+" ");
		}
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
