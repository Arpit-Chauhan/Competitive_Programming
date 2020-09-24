<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class MinimumDifficulty
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,ans=Integer.MAX_VALUE,temp;

		n=sc.nextInt();
		
		int arr[]=new int[n];
		boolean visited[]=new boolean[n];
		
		List<Integer> list = new ArrayList<>();
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=1;i<n-1;i++) {
			visited[i]=true;
			temp=Integer.MIN_VALUE;
			for(j=0;j<n;j++) {
				if(visited[j]==false)
					list.add(arr[j]);
			}
			for(j=0;j<list.size()-1;j++) {
					int diff=list.get(j+1)-list.get(j);
					temp=Math.max(temp,diff);
			}
			ans=Math.min(ans, temp);
			list.clear();
			visited[i]=false;
		}
		
		System.out.println(ans);

		sc.close();
	}

}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class MinimumDifficulty
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,ans=Integer.MAX_VALUE,temp;

		n=sc.nextInt();
		
		int arr[]=new int[n];
		boolean visited[]=new boolean[n];
		
		List<Integer> list = new ArrayList<>();
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=1;i<n-1;i++) {
			visited[i]=true;
			temp=Integer.MIN_VALUE;
			for(j=0;j<n;j++) {
				if(visited[j]==false)
					list.add(arr[j]);
			}
			for(j=0;j<list.size()-1;j++) {
					int diff=list.get(j+1)-list.get(j);
					temp=Math.max(temp,diff);
			}
			ans=Math.min(ans, temp);
			list.clear();
			visited[i]=false;
		}
		
		System.out.println(ans);

		sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
