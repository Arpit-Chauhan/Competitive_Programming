<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Scanner;

public class AddOddSubEven
{
	public static void main(String[] args)
<<<<<<< HEAD
=======
=======
import java.util.*;
import java.util.Collections;

public class AddOddSubEven
{
	public static void main(String args[])
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
	{
		
		Scanner sc=new Scanner(System.in);

		int t,a,b;
		
		t=sc.nextInt();
		while(t-->0) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==b)
				System.out.println("0");
			if(a>b) {
				if((a-b)%2==0)
					System.out.println("1");
				else
					System.out.println("2");
			}
			if(b>a) {
				if((a-b)%2==0)
					System.out.println("2");
				else
					System.out.println("1");
			}
			}
		sc.close();
	}
}

