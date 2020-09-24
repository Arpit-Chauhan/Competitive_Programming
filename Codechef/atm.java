<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int wt= sc.nextInt();
		float bal=sc.nextFloat();
		float tot;
		
		if(wt%5!=0 || wt+0.50>=bal)
		System.out.println(bal);
		else {
			tot=bal-wt-(float)0.5;
		System.out.println(String.format("%.2f",tot));	
		}
		sc.close();
		
		
		
		
	}

}
<<<<<<< HEAD
=======
=======
import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int wt= sc.nextInt();
		float bal=sc.nextFloat();
		float tot;
		
		if(wt%5!=0 || wt+0.50>=bal)
		System.out.println(bal);
		else {
			tot=bal-wt-(float)0.5;
		System.out.println(String.format("%.2f",tot));	
		}
		sc.close();
		
		
		
		
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
