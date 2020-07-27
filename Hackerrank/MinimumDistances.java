import java.util.Scanner;

public class MinimumDistances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n,i,d,j,min,f=0;
		d=0;
		n=sc.nextInt();
		int a[]=new int[n];
		min=n-1;
		for(i=0;i<n;i++) {
		a[i]=sc.nextInt();	
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)
					continue;
				if(a[i]==a[j]) {
						f=1;
						d=Math.abs(j-i);
					}
				else
					continue;
				
				if(d<min)
					min=d;
			}
		}
		if(f==0)
			System.out.println("-1");
		else
			System.out.println(min);
		
		sc.close();
	}

}
