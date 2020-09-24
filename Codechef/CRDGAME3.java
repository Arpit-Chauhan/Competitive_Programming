<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class CRDGAME3
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,chef,rick,chefdig,rickdig;
		

		t=sc.nextInt();
		while(t-->0) {
			chef=sc.nextInt();
			rick=sc.nextInt();
			
			chefdig=(int)Math.ceil(chef/9.0);
			rickdig=(int)Math.ceil(rick/9.0);
			
			if(chefdig<rickdig)
				System.out.println("0 "+chefdig);
			if(chefdig==rickdig)
				System.out.println("1 "+chefdig);
			if(chefdig>rickdig)
				System.out.println("1 "+rickdig);
		}

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class CRDGAME3
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,chef,rick,chefdig,rickdig;
		

		t=sc.nextInt();
		while(t-->0) {
			chef=sc.nextInt();
			rick=sc.nextInt();
			
			chefdig=(int)Math.ceil(chef/9.0);
			rickdig=(int)Math.ceil(rick/9.0);
			
			if(chefdig<rickdig)
				System.out.println("0 "+chefdig);
			if(chefdig==rickdig)
				System.out.println("1 "+chefdig);
			if(chefdig>rickdig)
				System.out.println("1 "+rickdig);
		}

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
