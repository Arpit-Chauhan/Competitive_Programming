<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Scanner;

public class CHFMOT18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		int n,s,t,count;
		count=0;
		t=sc.nextInt();
		
		while(t-->0) {
			s=sc.nextInt();
			n=sc.nextInt();
			if(s%2==1) {
				count++;
				s--;
			}
			
			while(true) {
				count+=s/n;
				s=s%n;
				n=s;
				if(n==0)
					break;
			}
			System.out.println(count);
			count=0;
		}
		sc.close();
	}

}
<<<<<<< HEAD
=======
=======
import java.util.Scanner;

public class CHFMOT18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		int n,s,t,count;
		count=0;
		t=sc.nextInt();
		
		while(t-->0) {
			s=sc.nextInt();
			n=sc.nextInt();
			if(s%2==1) {
				count++;
				s--;
			}
			
			while(true) {
				count+=s/n;
				s=s%n;
				n=s;
				if(n==0)
					break;
			}
			System.out.println(count);
			count=0;
		}
		sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
