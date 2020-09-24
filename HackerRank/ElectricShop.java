import java.util.Scanner;

public class ElectricShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int b,n,m,i,f,j,ans,sum;
		ans=sum=f=0;
		b=sc.nextInt();
		n=sc.nextInt();
		m=sc.nextInt();
		int k[]=new int[n];
		int mo[]=new int[m];
		for(i=0;i<n;i++) {
			k[i]=sc.nextInt();
		}
		for(i=0;i<m;i++) {
			mo[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				sum=k[i]+mo[j];
				if(sum>ans && sum<=b) {
					ans=sum;
					f=1;
					}
			}
		}
		if(f==0) {
			System.out.println("-1");
		}else
			System.out.println(ans);
		sc.close();
	}

}
