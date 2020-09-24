<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class DivisibilityProblem
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,a,b,n,ans,temp;

		t=sc.nextInt();
		while(t-->0) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a%b==0)
				System.out.println("0");
			else {
				n=a/b;
				temp=b*(n+1);
				ans=temp-a;
				System.out.println(ans);
			}
		}
		
		System.out.println();

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class DivisibilityProblem
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,a,b,n,ans,temp;

		t=sc.nextInt();
		while(t-->0) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a%b==0)
				System.out.println("0");
			else {
				n=a/b;
				temp=b*(n+1);
				ans=temp-a;
				System.out.println(ans);
			}
		}
		
		System.out.println();

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
