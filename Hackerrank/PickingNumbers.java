import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,i,j,count,ans;
		count=ans=0;
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n-1;i++) {
			for(j=i;j<n;j++) {
				if(Math.abs(a[i]-a[j])<=1) {
					count++;
				}

			}
			if(count>ans) {
				ans=count;
			count=0;	
			}
			count=0;
		}
		System.out.println(ans);
		sc.close();
	}

}
