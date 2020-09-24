<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class Dementia20_TOWIN
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();	
		
		long sumf=0,sums=0;
		int b[]=new int[n];
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			b[i]=sc.nextInt();
		Arrays.parallelSort(b);
		int j=0;
		for(i=n-1;i>=0;i--) {
			arr[j]=b[i];
			j++;
		}
		
		if(n>=3) {
		sumf+=arr[0];
		sums+=arr[1]+arr[2];
		for(i=3;i<n;i++) {
			if(i%2==0)
				sums+=arr[i];
			else
				sumf+=arr[i];
		}
		}
		else {
			if(n==1) {
			sumf+=arr[0];
			sums=0;
			}
			if(n==2) {
				sumf=arr[0];
				sums=arr[1];
			}
				
		}
		
		if(sumf>sums)
			System.out.println("first");
		else if(sums>sumf)
			System.out.println("second");
		else
			System.out.println("draw");
		
		}
		

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class Dementia20_TOWIN
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i;

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();	
		
		long sumf=0,sums=0;
		int b[]=new int[n];
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			b[i]=sc.nextInt();
		Arrays.parallelSort(b);
		int j=0;
		for(i=n-1;i>=0;i--) {
			arr[j]=b[i];
			j++;
		}
		
		if(n>=3) {
		sumf+=arr[0];
		sums+=arr[1]+arr[2];
		for(i=3;i<n;i++) {
			if(i%2==0)
				sums+=arr[i];
			else
				sumf+=arr[i];
		}
		}
		else {
			if(n==1) {
			sumf+=arr[0];
			sums=0;
			}
			if(n==2) {
				sumf=arr[0];
				sums=arr[1];
			}
				
		}
		
		if(sumf>sums)
			System.out.println("first");
		else if(sums>sumf)
			System.out.println("second");
		else
			System.out.println("draw");
		
		}
		

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
