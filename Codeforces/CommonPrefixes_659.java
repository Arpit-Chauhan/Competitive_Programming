<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;


public class CommonPrefixes_659
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;
		
		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();	
		
		String s="";
		String temp;
		
	
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
			
		for(i=1;i<=200;i++) 
			s=s+"a";
		
		temp=s;	
		System.out.println(s);
		
		for(i=0;i<n;i++) {
			char p=temp.charAt(arr[i]);
			if(p=='a') {
				temp=temp.substring(0,arr[i])+"b"+temp.substring(arr[i]+1);
				System.out.println(temp);
				continue;
			}
			if(p=='b') {
				temp=temp.substring(0,arr[i])+"a"+temp.substring(arr[i]+1);
				System.out.println(temp);
			}
		}

		}

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;


public class CommonPrefixes_659
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;
		
		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();	
		
		String s="";
		String temp;
		
	
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
			
		for(i=1;i<=200;i++) 
			s=s+"a";
		
		temp=s;	
		System.out.println(s);
		
		for(i=0;i<n;i++) {
			char p=temp.charAt(arr[i]);
			if(p=='a') {
				temp=temp.substring(0,arr[i])+"b"+temp.substring(arr[i]+1);
				System.out.println(temp);
				continue;
			}
			if(p=='b') {
				temp=temp.substring(0,arr[i])+"a"+temp.substring(arr[i]+1);
				System.out.println(temp);
			}
		}

		}

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
