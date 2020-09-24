<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class Hulk
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j;
		String s,ht,lt,ans;
		ans="";
		ht="I hate ";
		lt="I love ";

		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2!=0)
				ans=ans+ht;
			if(i%2==0)
				ans=ans+lt;
			if(i!=n)
				ans=ans+"that ";
		}
		
		System.out.println(ans+"it");

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class Hulk
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j;
		String s,ht,lt,ans;
		ans="";
		ht="I hate ";
		lt="I love ";

		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2!=0)
				ans=ans+ht;
			if(i%2==0)
				ans=ans+lt;
			if(i!=n)
				ans=ans+"that ";
		}
		
		System.out.println(ans+"it");

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
