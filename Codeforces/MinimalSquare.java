<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class MinimalSquare
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,a,b,ans;
	
		t=sc.nextInt();
		while(t-->0) {
			a=sc.nextInt();
			b=sc.nextInt();
			
			ans=(int)Math.pow(Math.min(Math.max(2*b, a), Math.max(2*a, b)), 2);
			
			System.out.println(ans);
		}
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class MinimalSquare
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,a,b,ans;
	
		t=sc.nextInt();
		while(t-->0) {
			a=sc.nextInt();
			b=sc.nextInt();
			
			ans=(int)Math.pow(Math.min(Math.max(2*b, a), Math.max(2*a, b)), 2);
			
			System.out.println(ans);
		}
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
