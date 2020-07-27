import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,i,j,p,count;
		p=count=0;
		n=sc.nextInt();
		int a[]=new int[n];
		boolean visited[]=new boolean[n];
		Arrays.fill(visited, false);
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(a[i]==a[j] && visited[j]==false) {
					count++;
					visited[j]=true;
				}
			}
			p+=count/2;
			count=0;	
		}
		
		System.out.println(p);
		sc.close();
	}

}
