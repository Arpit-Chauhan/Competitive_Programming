import java.util.Scanner;

public class MigratoryBIrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int i,j,n,count,ans,mains;
		count=ans=mains=0;
		n=sc.nextInt();
		int a[]= new int[n];
		
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(i=1;i<=5;i++) {
			for(j=0;j<n;j++) {
				if(a[j]==i) {
					count++;
				}
				if(count>ans) {
					ans=count;
				mains=i;	
				}
				
			}
			count=0;
		}
		
		System.out.println(mains);
		sc.close();
	}

}
