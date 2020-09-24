<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class Expression
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int a,b,c,max=0;

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a+b*c>max)
			max=a+b*c;
		if(a*(b+c)>max)
			max=a*(b+c);
		if(a*b*c>max)
			max=a*b*c;
		if((a+b)*c>max)
			max=(a+b)*c;
		if(a+b+c>max)
			max=a+b+c;
		if((a*b)+c>max)
			max=(a*b)+c;
		
		System.out.println(max);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class Expression
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int a,b,c,max=0;

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a+b*c>max)
			max=a+b*c;
		if(a*(b+c)>max)
			max=a*(b+c);
		if(a*b*c>max)
			max=a*b*c;
		if((a+b)*c>max)
			max=(a+b)*c;
		if(a+b+c>max)
			max=a+b+c;
		if((a*b)+c>max)
			max=(a*b)+c;
		
		System.out.println(max);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
