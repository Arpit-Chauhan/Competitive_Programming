<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Scanner;

public class CHPINTU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,m,i,j,t,ans,count;
		count=ans=0;
		t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			m=sc.nextInt();
			
			int a[]=new int[n];
			int p[]=new int[n];
			
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(i=0;i<n;i++)
				p[i]=sc.nextInt();
			
			for(i=0;i<n;i++)
				ans+=p[i];
			
			for(i=0;i<n;i++) {
			
				for(j=0;j<n;j++) {
					if(a[i]==a[j])
						count+=p[j];
				}
				
				if(count<=ans)
					ans=count;
			count=0;
			}
			System.out.println(ans);	
		}
		sc.close();

	}

}
<<<<<<< HEAD
=======
=======
import java.util.Scanner;

public class CHPINTU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,m,i,j,t,ans,count;
		count=ans=0;
		t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			m=sc.nextInt();
			
			int a[]=new int[n];
			int p[]=new int[n];
			
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(i=0;i<n;i++)
				p[i]=sc.nextInt();
			
			for(i=0;i<n;i++)
				ans+=p[i];
			
			for(i=0;i<n;i++) {
			
				for(j=0;j<n;j++) {
					if(a[i]==a[j])
						count+=p[j];
				}
				
				if(count<=ans)
					ans=count;
			count=0;
			}
			System.out.println(ans);	
		}
		sc.close();

	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
