<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class VasyaandSocks
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,m,i,j,x,count;
		count=0;
		
		n=sc.nextInt();
		
		m=sc.nextInt();
		
		while(n>=m) {
			count+=m;
			n-=m;
			n++;
		}
		count+=n;
		
		System.out.println(count);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class VasyaandSocks
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,m,i,j,x,count;
		count=0;
		
		n=sc.nextInt();
		
		m=sc.nextInt();
		
		while(n>=m) {
			count+=m;
			n-=m;
			n++;
		}
		count+=n;
		
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
