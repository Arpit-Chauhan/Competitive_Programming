<<<<<<< HEAD


import java.util.*;
import java.util.Collections;

public class Pizza
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		long n;
		n=sc.nextLong();
		if(n==0)
			System.out.println("0");
		else {
			if((n+1)%2==0)
				System.out.println((n+1)/2);
			else
				System.out.println(n+1);
		}
		
		sc.close();
	}
}

=======


import java.util.*;
import java.util.Collections;

public class Pizza
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		long n;
		n=sc.nextLong();
		if(n==0)
			System.out.println("0");
		else {
			if((n+1)%2==0)
				System.out.println((n+1)/2);
			else
				System.out.println(n+1);
		}
		
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
