<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class ValeraandX
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,flag=0;
		char p,q;

		n=sc.nextInt();
		char arr[][]=new char[n][n];
		
		for(i=0;i<n;i++) 
			arr[i]=sc.next().toCharArray();
		
		p=arr[0][0];q=arr[0][1];
		
		for(i=0;i<n;i++) {
			if(p==q) {
				flag=1;break;
			}
			for(j=0;j<n;j++) {
				if((i==j) || (i+j)==(n-1)) {
					if(arr[i][j]!=p) {
						flag=1;break;
					}
				}
				else {
					if(arr[i][j]!=q) {
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
				break;
		}
		
		if(flag==1)
		System.out.println("NO");
		else
			System.out.println("YES");

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class ValeraandX
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,flag=0;
		char p,q;

		n=sc.nextInt();
		char arr[][]=new char[n][n];
		
		for(i=0;i<n;i++) 
			arr[i]=sc.next().toCharArray();
		
		p=arr[0][0];q=arr[0][1];
		
		for(i=0;i<n;i++) {
			if(p==q) {
				flag=1;break;
			}
			for(j=0;j<n;j++) {
				if((i==j) || (i+j)==(n-1)) {
					if(arr[i][j]!=p) {
						flag=1;break;
					}
				}
				else {
					if(arr[i][j]!=q) {
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
				break;
		}
		
		if(flag==1)
		System.out.println("NO");
		else
			System.out.println("YES");

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
