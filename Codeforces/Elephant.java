<<<<<<< HEAD

import java.util.*;
import java.util.Collections;

public class Elephant
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int count,n,k;
		count=0;
		n=sc.nextInt();
		k=5;
		while(n!=0) {
			if(n>=k) {
				n-=k;
				count++;
			}
			else
				k--;
		}
		
		System.out.println(count);

		sc.close();
	}
}

=======

import java.util.*;
import java.util.Collections;

public class Elephant
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int count,n,k;
		count=0;
		n=sc.nextInt();
		k=5;
		while(n!=0) {
			if(n>=k) {
				n-=k;
				count++;
			}
			else
				k--;
		}
		
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
