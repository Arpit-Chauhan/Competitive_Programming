<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class WrongSubtraction
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,k;

		n=sc.nextInt();
		k=sc.nextInt();
		while(k-->0) {
			if(n%10==0)
				n/=10;
			else
				n--;
		}
		
		System.out.println(n);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class WrongSubtraction
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,k;

		n=sc.nextInt();
		k=sc.nextInt();
		while(k-->0) {
			if(n%10==0)
				n/=10;
			else
				n--;
		}
		
		System.out.println(n);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
