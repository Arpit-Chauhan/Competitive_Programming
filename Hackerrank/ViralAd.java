<<<<<<< HEAD
import java.util.Scanner;

public class ViralAd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,lcount,likes;
		lcount=0;
		int a=5;
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			likes=(int)a/2;
			a=likes*3;
			lcount+=likes;
			
		}
		System.out.println(lcount);
		sc.close();
	}

}
=======
import java.util.Scanner;

public class ViralAd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,lcount,likes;
		lcount=0;
		int a=5;
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			likes=(int)a/2;
			a=likes*3;
			lcount+=likes;
			
		}
		System.out.println(lcount);
		sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
