<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.Scanner;
public class Dwnld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int tc,amt,i,n,tn,d,freem;
		amt=0;
		tc=sc.nextInt();
		
		while(tc-->0) {
			n=sc.nextInt();
			freem=sc.nextInt();
			while(n-->0) {
				tn=sc.nextInt();
				d=sc.nextInt();
				for(i=1;i<=tn;i++) {
					if(freem!=0)
						freem--;
					else
						amt+=d;
				}
			}
				System.out.println(amt);
				amt=0;
			}	
		sc.close();
	}
}

<<<<<<< HEAD
=======
=======

import java.util.Scanner;
public class Dwnld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int tc,amt,i,n,tn,d,freem;
		amt=0;
		tc=sc.nextInt();
		
		while(tc-->0) {
			n=sc.nextInt();
			freem=sc.nextInt();
			while(n-->0) {
				tn=sc.nextInt();
				d=sc.nextInt();
				for(i=1;i<=tn;i++) {
					if(freem!=0)
						freem--;
					else
						amt+=d;
				}
			}
				System.out.println(amt);
				amt=0;
			}	
		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
