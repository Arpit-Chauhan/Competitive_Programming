<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class SoftDrinkin
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,k,l,c,d,p,nl,np;
		
		n=sc.nextInt();
		k=sc.nextInt();
		l=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		p=sc.nextInt();
		nl=sc.nextInt();
		np=sc.nextInt();
		
		int temp,temp1,temp2,min;
		temp=(k*l)/nl;
		temp1=c*d;
		temp2=p/np;
		
		if(temp<temp1 && temp<temp2)
			min=temp;
		else if(temp1<temp2)
			min=temp1;
		else
			min=temp2;
		
		System.out.println(min/n);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class SoftDrinkin
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,k,l,c,d,p,nl,np;
		
		n=sc.nextInt();
		k=sc.nextInt();
		l=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		p=sc.nextInt();
		nl=sc.nextInt();
		np=sc.nextInt();
		
		int temp,temp1,temp2,min;
		temp=(k*l)/nl;
		temp1=c*d;
		temp2=p/np;
		
		if(temp<temp1 && temp<temp2)
			min=temp;
		else if(temp1<temp2)
			min=temp1;
		else
			min=temp2;
		
		System.out.println(min/n);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
