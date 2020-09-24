<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class SuperCentralPoint
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count=0;

		n=sc.nextInt();
		int arr[]=new int[2*n];
		
		for(i=0;i<2*n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<2*n;i+=2) {
			int right=0,left=0,up=0,down=0;
			for(j=0;j<2*n;j+=2) {
				if(i==j)
					continue;
				if(arr[i]==arr[j]) {
					if(arr[j+1]>arr[i+1])
						up++;
					else
						down++;
				}
				if(arr[i+1]==arr[j+1]) {
					if(arr[j]>arr[i])
						right++;
					else
						left++;
				}
				
			}
		
			if(right>0 && up>0 && left>0 && down>0)
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

public class SuperCentralPoint
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,count=0;

		n=sc.nextInt();
		int arr[]=new int[2*n];
		
		for(i=0;i<2*n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<2*n;i+=2) {
			int right=0,left=0,up=0,down=0;
			for(j=0;j<2*n;j+=2) {
				if(i==j)
					continue;
				if(arr[i]==arr[j]) {
					if(arr[j+1]>arr[i+1])
						up++;
					else
						down++;
				}
				if(arr[i+1]==arr[j+1]) {
					if(arr[j]>arr[i])
						right++;
					else
						left++;
				}
				
			}
		
			if(right>0 && up>0 && left>0 && down>0)
				count++;
		}
		
		System.out.println(count);

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
