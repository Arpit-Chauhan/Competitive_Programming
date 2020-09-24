<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class HittheLottery
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,count=0;
		i=0;
		int arr[]= {100,20,10,5,1};

		n=sc.nextInt();
		
			while(n!=0) {
					if(n/arr[i]!=0) {
						count+=n/arr[i];
						n%=arr[i];
					}
					else {
						i++;
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

public class HittheLottery
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,count=0;
		i=0;
		int arr[]= {100,20,10,5,1};

		n=sc.nextInt();
		
			while(n!=0) {
					if(n/arr[i]!=0) {
						count+=n/arr[i];
						n%=arr[i];
					}
					else {
						i++;
					}
			}
			
		
		
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
