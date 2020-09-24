<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class IsYourHorseshoe
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count;
		count=0;
		int arr[]=new int[4];
		boolean visited[]=new boolean[4];
		Arrays.fill(visited, false);
		for(i=0;i<4;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<4;i++) {
			if(visited[i]==false) {
			for(j=0;j<4;j++) {
				if(i==j)
					continue;
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
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

public class IsYourHorseshoe
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count;
		count=0;
		int arr[]=new int[4];
		boolean visited[]=new boolean[4];
		Arrays.fill(visited, false);
		for(i=0;i<4;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<4;i++) {
			if(visited[i]==false) {
			for(j=0;j<4;j++) {
				if(i==j)
					continue;
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			}
		}
		
		System.out.println(count);

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
