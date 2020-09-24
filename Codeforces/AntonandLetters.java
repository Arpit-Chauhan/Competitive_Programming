<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class AntonandLetters
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count,c1;
		String s;
		count=c1=0;
		s=sc.nextLine();
		n=s.length();
		char arr[]=s.toCharArray();
		boolean visited[]=new boolean[n];
		
		for(i=1;i<n;i+=3)
			c1++;
		
		for(i=1;i<n;i+=3) {
			if(visited[i]==false) {
				for(j=1;j<n;j+=3) {
					if(i==j)
						continue;
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
				}
			}
		}
		if(n>2)
		System.out.println(c1-count);
		else
			System.out.println("0");
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class AntonandLetters
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count,c1;
		String s;
		count=c1=0;
		s=sc.nextLine();
		n=s.length();
		char arr[]=s.toCharArray();
		boolean visited[]=new boolean[n];
		
		for(i=1;i<n;i+=3)
			c1++;
		
		for(i=1;i<n;i+=3) {
			if(visited[i]==false) {
				for(j=1;j<n;j+=3) {
					if(i==j)
						continue;
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
				}
			}
		}
		if(n>2)
		System.out.println(c1-count);
		else
			System.out.println("0");
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
