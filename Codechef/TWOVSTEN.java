<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Scanner;

public class TWOVSTEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n,x,counter;
		counter=0;
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			x=sc.nextInt();
		
			if(x%10 == 0) {
				counter=0;}
			else
			{
				do {
				x=x*2;
				counter++;
					}while(x%10!=0 && x<=(int)Math.pow(10, 9));
				if(x%10!=0) {
					counter=-1;}
			
			}
			System.out.println(counter);
			counter=0;
		}
		
		sc.close();

	}

}
<<<<<<< HEAD
=======
=======
import java.util.Scanner;

public class TWOVSTEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n,x,counter;
		counter=0;
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			x=sc.nextInt();
		
			if(x%10 == 0) {
				counter=0;}
			else
			{
				do {
				x=x*2;
				counter++;
					}while(x%10!=0 && x<=(int)Math.pow(10, 9));
				if(x%10!=0) {
					counter=-1;}
			
			}
			System.out.println(counter);
			counter=0;
		}
		
		sc.close();

	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
