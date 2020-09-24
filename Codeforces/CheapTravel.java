<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class CheapTravel
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,m,a,b,min;
		int temp1=0,temp2=0,temp=0;

		n=sc.nextInt();
		m=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		
		temp1=(n/m)*b+(n%m)*a;
		temp=(n/m)*b+b;
		temp2=a*n;
		
		if(temp<temp1 && temp<temp2) 
			min=temp;
		else if(temp1<temp2)
			min=temp1;
		else
			min=temp2;
		
		System.out.println(min);
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class CheapTravel
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,m,a,b,min;
		int temp1=0,temp2=0,temp=0;

		n=sc.nextInt();
		m=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		
		temp1=(n/m)*b+(n%m)*a;
		temp=(n/m)*b+b;
		temp2=a*n;
		
		if(temp<temp1 && temp<temp2) 
			min=temp;
		else if(temp1<temp2)
			min=temp1;
		else
			min=temp2;
		
		System.out.println(min);
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
