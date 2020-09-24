<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;

public class PriyaandAND_CENS20D
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,j,count=0;
		String s;

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
			int arr[]=new int[n];
			
			for(i=0;i<n;i++)
				arr[i]=sc.nextInt();
			for(i=0;i<n-1;i++) {
				for(j=i+1;j<n;j++) {
					if((arr[i]&arr[j])==arr[i])
						count++;
				}
			}
			System.out.println(count);
			count=0;
		}
		
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;

public class PriyaandAND_CENS20D
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,j,count=0;
		String s;

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
			int arr[]=new int[n];
			
			for(i=0;i<n;i++)
				arr[i]=sc.nextInt();
			for(i=0;i<n-1;i++) {
				for(j=i+1;j<n;j++) {
					if((arr[i]&arr[j])==arr[i])
						count++;
				}
			}
			System.out.println(count);
			count=0;
		}
		
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
