<<<<<<< HEAD

import java.util.*;
import java.util.Collections;

public class FafaandCompany
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,count=0;
		String s;

		n=sc.nextInt();
		for(i=1;i<=n/2;i++) {
			if((n-i)%i==0)
				count++;
		}
		
		System.out.println(count);

		sc.close();
	}
}

=======

import java.util.*;
import java.util.Collections;

public class FafaandCompany
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,count=0;
		String s;

		n=sc.nextInt();
		for(i=1;i<=n/2;i++) {
			if((n-i)%i==0)
				count++;
		}
		
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
