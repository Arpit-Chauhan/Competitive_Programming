<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class FoxandSnake
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int m,n,i,j;
		

		n=sc.nextInt();
		m=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
			for(j=1;j<=m;j++) 
				System.out.print("#");
			System.out.println();
			}
			else {
				if(i%2==0 && i%4!=0) {
					for(j=1;j<m;j++)
						System.out.print(".");
					System.out.print("#");
					System.out.println();
				}
				if(i%4==0) {
					System.out.print("#");
					for(j=1;j<m;j++)
						System.out.print(".");
					System.out.println();
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
import java.util.Collections;

public class FoxandSnake
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int m,n,i,j;
		

		n=sc.nextInt();
		m=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
			for(j=1;j<=m;j++) 
				System.out.print("#");
			System.out.println();
			}
			else {
				if(i%2==0 && i%4!=0) {
					for(j=1;j<m;j++)
						System.out.print(".");
					System.out.print("#");
					System.out.println();
				}
				if(i%4==0) {
					System.out.print("#");
					for(j=1;j<m;j++)
						System.out.print(".");
					System.out.println();
				}
			}
		}


		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
