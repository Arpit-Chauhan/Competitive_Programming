<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,m,x,max,temp,j,i;
		max=0;
		
		n=sc.nextInt();
		m=sc.nextInt();
		int k=m;
		
		int a[]=new int[n];
		Arrays.fill(a, 0);
		while(m-->0) {
			x=sc.nextInt();
			a[x]=1;
		}
		
		if(n==k) {
			System.out.println("0");
			System.exit(0);
		}
		
		for(i=0;i<n;i++) {
			if(a[i]==1) {
				for(j=0;j<n;j++) {
					temp=j-i;
					if(temp>max)
						max=temp;
				}
				
			}
		}
		System.out.println(max);
		sc.close();
		
	}

}
=======
import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,m,x,max,temp,j,i;
		max=0;
		
		n=sc.nextInt();
		m=sc.nextInt();
		int k=m;
		
		int a[]=new int[n];
		Arrays.fill(a, 0);
		while(m-->0) {
			x=sc.nextInt();
			a[x]=1;
		}
		
		if(n==k) {
			System.out.println("0");
			System.exit(0);
		}
		
		for(i=0;i<n;i++) {
			if(a[i]==1) {
				for(j=0;j<n;j++) {
					temp=j-i;
					if(temp>max)
						max=temp;
				}
				
			}
		}
		System.out.println(max);
		sc.close();
		
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
