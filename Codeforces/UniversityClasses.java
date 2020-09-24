<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class UniversityClasses
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i;
		String s;
		n=sc.nextInt();
		int arr[]=new int[7];
		Arrays.fill(arr, 0);
		sc.nextLine();
		while(n-->0) {
			s=sc.nextLine();
			for(i=0;i<7;i++) {
				char p=s.charAt(i);
				if(p=='1')
					arr[i]++;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[6]);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class UniversityClasses
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i;
		String s;
		n=sc.nextInt();
		int arr[]=new int[7];
		Arrays.fill(arr, 0);
		sc.nextLine();
		while(n-->0) {
			s=sc.nextLine();
			for(i=0;i<7;i++) {
				char p=s.charAt(i);
				if(p=='1')
					arr[i]++;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[6]);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
