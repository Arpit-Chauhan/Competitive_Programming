<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class StonesontheTable
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,count;
		count=0;
		n=sc.nextInt();
		sc.nextLine();
		String s;
		s=sc.nextLine();
		
		char arr[]=s.toCharArray();
	
		
		for(i=0;i<n-1;i++) {
			if(arr[i+1]==arr[i])
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

public class StonesontheTable
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,count;
		count=0;
		n=sc.nextInt();
		sc.nextLine();
		String s;
		s=sc.nextLine();
		
		char arr[]=s.toCharArray();
	
		
		for(i=0;i<n-1;i++) {
			if(arr[i+1]==arr[i])
				count++;
		}
			
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
