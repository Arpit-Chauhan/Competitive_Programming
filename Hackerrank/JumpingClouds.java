import java.util.Scanner;

public class JumpingClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int n,i,k,count,e,jump,c;
		c=0;e=100;
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]	=new int[n];
		for(i=0;i<n;i++) {
		a[i]=sc.nextInt();	
		}
		
		for(i=0;i<n-1;i+=k) {
			
		if(i+k>n)
			i=(i+k)%n;
				if(a[(i+k)%n]==1) {
					e-=2;
				}
				e--;
			}
		
			
		System.out.println(e);
		sc.close();
		
	}

}
