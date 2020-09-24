<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class CaptainFlintCrewRecruitment_660
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n;
		t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			
			if(n<=30) {
				System.out.println("NO");
				continue;
			}
			else {

				System.out.println("YES");
				if(n==36)
					System.out.println("6 10 15 5");
				if(n==40)
					System.out.println("6 14 15 5");
				if(n==44)
					System.out.println("6 10 21 7");
				if(n!=36 && n!=40 && n!=44)
				System.out.println("6 10 14 "+(n-30));
				
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

public class CaptainFlintCrewRecruitment_660
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n;
		t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			
			if(n<=30) {
				System.out.println("NO");
				continue;
			}
			else {

				System.out.println("YES");
				if(n==36)
					System.out.println("6 10 15 5");
				if(n==40)
					System.out.println("6 14 15 5");
				if(n==44)
					System.out.println("6 10 21 7");
				if(n!=36 && n!=40 && n!=44)
				System.out.println("6 10 14 "+(n-30));
				
			}
		}
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
