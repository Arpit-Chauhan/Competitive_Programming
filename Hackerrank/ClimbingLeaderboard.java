import java.util.Scanner;

public class ClimbingLeaderboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int m,n,i,j,rank;
		rank=1;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		m=sc.nextInt();
		int b[]=new int[m];
		for(i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		int r[]=new int[n];
		r[0]=rank;
		for(i=1;i<n;i++) {
			if(a[i]==a[i-1])
				r[i]=rank;
			else {
				r[i]=rank+1;
				rank++;
			}
		}
		
		for(i=0;i<m;i++) {
			for(j=n-1;j>=1;j--) {
				if(b[i]<a[n-1]) {
					rank+=1;
					System.out.println(r[n-1]+1);
					break;
					}
				else if(b[i]>a[0]) {
					System.out.println("1");
					break;
				}
				else if (b[i]>=a[j] && b[i]<a[j-1] ){
					System.out.println(r[j]);
					break;
				}
			
			}
		}
		sc.close();
		
	}

}
