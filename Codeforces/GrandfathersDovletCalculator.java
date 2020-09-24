<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class GrandfathersDovletCalculator
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int a,b,i,dig,temp,count=0;
		
		a=sc.nextInt();
		b=sc.nextInt();
		int arr[]= {6,2,5,5,4,5,6,3,7,6};
		
		for(i=a;i<=b;i++) {
			temp=i;
			while(temp>0) {
				dig=temp%10;
				count+=arr[dig];
				temp/=10;
			}
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

public class GrandfathersDovletCalculator
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int a,b,i,dig,temp,count=0;
		
		a=sc.nextInt();
		b=sc.nextInt();
		int arr[]= {6,2,5,5,4,5,6,3,7,6};
		
		for(i=a;i<=b;i++) {
			temp=i;
			while(temp>0) {
				dig=temp%10;
				count+=arr[dig];
				temp/=10;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
