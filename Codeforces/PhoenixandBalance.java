<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class PhoenixandBalance
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;
		long sum1,sum2;
		t=sc.nextInt();
		
		
		while(t-->0) {
		n=sc.nextInt();
		sum1=(long)Math.pow(2,n);
		sum2=0;
		for(i=1;i<n/2;i++)
			sum1+=(long)Math.pow(2,i);
		
		for(i=n/2;i<n;i++)
			sum2+=(long)Math.pow(2,i);
		System.out.println(sum1-sum2);
		
		}
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class PhoenixandBalance
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;
		long sum1,sum2;
		t=sc.nextInt();
		
		
		while(t-->0) {
		n=sc.nextInt();
		sum1=(long)Math.pow(2,n);
		sum2=0;
		for(i=1;i<n/2;i++)
			sum1+=(long)Math.pow(2,i);
		
		for(i=n/2;i<n;i++)
			sum2+=(long)Math.pow(2,i);
		System.out.println(sum1-sum2);
		
		}
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
