<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class Twins
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int s1,s2,n,i,j,ans;
		s1=s2=ans=0;

		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		for(j=n-1;j>=0;j--) {
			for(i=0;i<j;i++) {
				s1+=arr[i];
		}
			s2+=arr[j];
			if(s2>s1) {
				ans=n-j;
				break;
			}
			s1=0;
		}
		
		System.out.println(ans);

		sc.close();
	}
<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class Twins
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int s1,s2,n,i,j,ans;
		s1=s2=ans=0;

		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		for(j=n-1;j>=0;j--) {
			for(i=0;i<j;i++) {
				s1+=arr[i];
		}
			s2+=arr[j];
			if(s2>s1) {
				ans=n-j;
				break;
			}
			s1=0;
		}
		
		System.out.println(ans);

		sc.close();
	}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
}