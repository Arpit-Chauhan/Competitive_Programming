import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n,i,j,k,d,count;
		count=0;
		
		n=sc.nextInt();
		d=sc.nextInt();
		
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		Arrays.sort(a);
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(a[j]-a[i]==d && i<j) {
					for(k=0;k<n;k++) {
						if(a[k]-a[j]==d && j<k)
							count++;
					}
				}
			}
		}
		
		System.out.println(count);
		sc.close();

	}

}
