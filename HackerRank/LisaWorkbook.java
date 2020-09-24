import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int i,j,n,k,t,m,page,count;
		page=1;count=0;
		
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int [n];
		for(i=0;i<n;i++) 
			a[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			m=k;
			t=a[i];
			for(j=1;j<=t;j++) {
				if(m==0) {
					page++;
					m=k;
					}
				m--;
				if(j==page)
					count++;
			}
			page++;
		}
		System.out.println(count);
		sc.close();
		
	}

}
