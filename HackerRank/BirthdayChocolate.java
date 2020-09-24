<<<<<<< HEAD
import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,m,d,i,j,count,sum;
		count=sum=0;
		
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();		
			}
		d=sc.nextInt();
		m=sc.nextInt();
		
			
				for(i=0;i<=n-m;i++) {
					
					for(j=i;j<m+i;j++) 
						sum+=a[j];	
					
					if(sum==d) {
						count++;}
						
						sum=0;
						}
					
					
				
			System.out.println(count);
	
sc.close();
	}

}
=======
import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,m,d,i,j,count,sum;
		count=sum=0;
		
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();		
			}
		d=sc.nextInt();
		m=sc.nextInt();
		
			
				for(i=0;i<=n-m;i++) {
					
					for(j=i;j<m+i;j++) 
						sum+=a[j];	
					
					if(sum==d) {
						count++;}
						
						sum=0;
						}
					
					
				
			System.out.println(count);
	
sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
