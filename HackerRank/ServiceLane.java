<<<<<<< HEAD
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int l,r,n,i,t,min;
		min=3;
		n=sc.nextInt();
		t=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		while(t-->0) {
			l=sc.nextInt();
			r=sc.nextInt();
			
			for(i=l;i<=r;i++) {
				if(a[i]<min)
					min=a[i];
			}
			System.out.println(min);
			min=3;
		}
			sc.close();
		
	}

}
=======
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int l,r,n,i,t,min;
		min=3;
		n=sc.nextInt();
		t=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		while(t-->0) {
			l=sc.nextInt();
			r=sc.nextInt();
			
			for(i=l;i<=r;i++) {
				if(a[i]<min)
					min=a[i];
			}
			System.out.println(min);
			min=3;
		}
			sc.close();
		
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
