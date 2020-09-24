<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Scanner;

public class KTTABLE {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();
		
		int moments,i,j,k, treq,counter,diff;
		counter=0;
		
		
		
			
		for( i=1;i<=n;i++) {
			int N=sc.nextInt();
			int A[]= new int[N];
			int B[]= new int[N];
			
			for(j=0;j<N;j++) {
				moments=sc.nextInt();
				 A[j]=moments;
				}
				
			for( k=0;k<N;k++) {
				treq=sc.nextInt();
				B[k]=treq;
			}
			
			for(j=0;j<N;j++) {
				if(j==0) {
					diff=A[0];}
				else {
					diff=A[j]-A[j-1];}
				
				if(B[j]<=diff) {
					counter++;
					diff=0;
				}
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

public class KTTABLE {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();
		
		int moments,i,j,k, treq,counter,diff;
		counter=0;
		
		
		
			
		for( i=1;i<=n;i++) {
			int N=sc.nextInt();
			int A[]= new int[N];
			int B[]= new int[N];
			
			for(j=0;j<N;j++) {
				moments=sc.nextInt();
				 A[j]=moments;
				}
				
			for( k=0;k<N;k++) {
				treq=sc.nextInt();
				B[k]=treq;
			}
			
			for(j=0;j<N;j++) {
				if(j==0) {
					diff=A[0];}
				else {
					diff=A[j]-A[j-1];}
				
				if(B[j]<=diff) {
					counter++;
					diff=0;
				}
				}
			System.out.println(counter);
			counter=0;
			
		}
		
		sc.close();
		
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
