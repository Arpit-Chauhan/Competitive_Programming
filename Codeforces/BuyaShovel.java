<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class BuyaShovel
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int k,r,count=1,temp;
		
		k=sc.nextInt();
		r=sc.nextInt();
		
		while(true) {
			temp=k*count;
			if(temp%10==0 || temp%10==r)
				break;
			else
				count++;
		}
		System.out.println(count);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class BuyaShovel
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int k,r,count=1,temp;
		
		k=sc.nextInt();
		r=sc.nextInt();
		
		while(true) {
			temp=k*count;
			if(temp%10==0 || temp%10==r)
				break;
			else
				count++;
		}
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
