<<<<<<< HEAD
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,t,i,count,ans,k;
		count=0;
		t=sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();
			k=sc.nextInt();
			
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			for(i=0;i<n;i++) {
				if(a[i]>0)
					count++;
			}
			ans=n-count;
			if(ans<k)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			count=ans=0;
		}
sc.close();
	}

}
=======
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,t,i,count,ans,k;
		count=0;
		t=sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();
			k=sc.nextInt();
			
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			for(i=0;i<n;i++) {
				if(a[i]>0)
					count++;
			}
			ans=n-count;
			if(ans<k)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			count=ans=0;
		}
sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
