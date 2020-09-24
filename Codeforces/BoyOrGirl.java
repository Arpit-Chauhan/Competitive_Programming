<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class BoyOrGirl
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count;
		count=0;
		String s;

		s=sc.nextLine();
		n=s.length();
		
		char arr[]=s.toCharArray();
		boolean visited[]=new boolean[n];
		Arrays.fill(visited, false);
		for(i=0;i<n;i++) {
			if(visited[i]==false) {
			for(j=i+1;j<n;j++) {
				if(arr[j]==arr[i]) {
					count++;
					visited[j]=true;
				}
			}
		}
		}
		if((n-count)%2!=0)
		System.out.println("IGNORE HIM!");
		else
			System.out.println("CHAT WITH HER!");

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class BoyOrGirl
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count;
		count=0;
		String s;

		s=sc.nextLine();
		n=s.length();
		
		char arr[]=s.toCharArray();
		boolean visited[]=new boolean[n];
		Arrays.fill(visited, false);
		for(i=0;i<n;i++) {
			if(visited[i]==false) {
			for(j=i+1;j<n;j++) {
				if(arr[j]==arr[i]) {
					count++;
					visited[j]=true;
				}
			}
		}
		}
		if((n-count)%2!=0)
		System.out.println("IGNORE HIM!");
		else
			System.out.println("CHAT WITH HER!");

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
