<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class BeautifilYear
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,k,flag=0;
		String s;
		n=sc.nextInt();
		for(i=n+1;i<=9012;i++) {
			s=Integer.toString(i);
			char arr[]=s.toCharArray();
			for(j=0;j<4;j++) {
				for(k=0;k<4;k++) {
					if(j==k)
						continue;
					else {
						if(arr[j]==arr[k]) {
							flag=1;
							break;
						}
							
					}
						
				}
				if(flag==1)
					break;
			}
			if(flag!=1) {
				System.out.println(i);
				break;
			}
			flag=0;
		}
		
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class BeautifilYear
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,k,flag=0;
		String s;
		n=sc.nextInt();
		for(i=n+1;i<=9012;i++) {
			s=Integer.toString(i);
			char arr[]=s.toCharArray();
			for(j=0;j<4;j++) {
				for(k=0;k<4;k++) {
					if(j==k)
						continue;
					else {
						if(arr[j]==arr[k]) {
							flag=1;
							break;
						}
							
					}
						
				}
				if(flag==1)
					break;
			}
			if(flag!=1) {
				System.out.println(i);
				break;
			}
			flag=0;
		}
		
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
