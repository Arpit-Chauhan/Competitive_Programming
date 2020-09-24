<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class BeautifulMatrix
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int r,c,i,j,count;
		count=r=c=0;
		int arr[][]=new int[5][5];
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++)
				arr[i][j]=sc.nextInt();
		}
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(arr[i][j]==1) {
					r=i;
					c=j;
					break;
				}
			}	
		}
		
		while(r!=2 || c!=2) {
			if(r>2) {
				count++;
				r--;
			}
			if(r<2) {
				count++;
				r++;
			}
			if(c>2) {
				count++;
				c--;
			}
			if(c<2) {
				count++;
				c++;
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

public class BeautifulMatrix
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int r,c,i,j,count;
		count=r=c=0;
		int arr[][]=new int[5][5];
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++)
				arr[i][j]=sc.nextInt();
		}
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(arr[i][j]==1) {
					r=i;
					c=j;
					break;
				}
			}	
		}
		
		while(r!=2 || c!=2) {
			if(r>2) {
				count++;
				r--;
			}
			if(r<2) {
				count++;
				r++;
			}
			if(c>2) {
				count++;
				c--;
			}
			if(c<2) {
				count++;
				c++;
			}
		}
		
		System.out.println(count);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
