<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class Inbox
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int pos,n,i,j,count,flag;
		count=flag=0;

		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;
				flag=1;
				pos=i;
				for(j=pos+1;j<n;j++) {
					if(arr[j]==1) {
						if(j-pos==1)
							count++;
						if(j-pos>=2)
							count+=2;
						pos=j;
					}
				}
			}
			if(flag==1)
				break;
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

public class Inbox
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int pos,n,i,j,count,flag;
		count=flag=0;

		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;
				flag=1;
				pos=i;
				for(j=pos+1;j<n;j++) {
					if(arr[j]==1) {
						if(j-pos==1)
							count++;
						if(j-pos>=2)
							count+=2;
						pos=j;
					}
				}
			}
			if(flag==1)
				break;
		}
		
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
