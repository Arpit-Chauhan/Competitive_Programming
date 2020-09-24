<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class Bitpp
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,x;
		x=0;
		String pi,poi,pd,pod,s;
		pi="++X";poi="X++";pd="--X";pod="X--";

		n=sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			s=sc.nextLine();
			if(s.equals(pi))
				++x;
			if(s.equals(poi))
				x++;
			if(s.equals(pd))
				--x;
			if(s.equals(pod))
				x--;
		}
		
		System.out.println(x);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class Bitpp
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,x;
		x=0;
		String pi,poi,pd,pod,s;
		pi="++X";poi="X++";pd="--X";pod="X--";

		n=sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			s=sc.nextLine();
			if(s.equals(pi))
				++x;
			if(s.equals(poi))
				x++;
			if(s.equals(pd))
				--x;
			if(s.equals(pod))
				x--;
		}
		
		System.out.println(x);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
