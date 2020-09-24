<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		
		int i,n,temp=0,count=0;
		n=sc.nextInt();
		
		int a[]=new int[3];
		
		while(n-->0) {
			for(i=0;i<3;i++)
				a[i]=sc.nextInt();
			for(i=0;i<3;i++) {
				if(a[i]==1)
					temp++;
			}
			if(temp>=2)
				count++;
			temp=0;
		}
		System.out.println(count);
		sc.close();
	}

}
<<<<<<< HEAD
=======
=======
import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		
		int i,n,temp=0,count=0;
		n=sc.nextInt();
		
		int a[]=new int[3];
		
		while(n-->0) {
			for(i=0;i<3;i++)
				a[i]=sc.nextInt();
			for(i=0;i<3;i++) {
				if(a[i]==1)
					temp++;
			}
			if(temp>=2)
				count++;
			temp=0;
		}
		System.out.println(count);
		
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
