<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class VanyaandCubes
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i=1,sum=1,lev=0,tot=1;
		n=sc.nextInt();
		while(tot<=n) {
			i++;
			sum+=i;
			tot+=sum;
			lev++;		
		}
		System.out.println(lev);
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class VanyaandCubes
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i=1,sum=1,lev=0,tot=1;
		n=sc.nextInt();
		while(tot<=n) {
			i++;
			sum+=i;
			tot+=sum;
			lev++;		
		}
		System.out.println(lev);
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
