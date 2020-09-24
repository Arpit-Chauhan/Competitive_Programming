
import java.util.Scanner;

public class DivisiblePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc= new Scanner(System.in);
			int n,k,i,j,sum,count;
			sum=count=0;
			n=sc.nextInt();
			k=sc.nextInt();
			
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
		

			for(i=0;i<n-1;i++) {
				
				for(j=i+1;j<n;j++) {
					sum+=a[i]+a[j];	
				if(sum%k==0) {
					count++;
					sum=0;
				}
				sum=0;
				}
					sum=0;
				
					}
			System.out.println(count);
			sc.close();
	}

}
