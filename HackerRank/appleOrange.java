import java.util.Scanner;
public class appleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int s,t,m,n,i,a,b,capp,cor;
		capp=cor=0;
		s=sc.nextInt();
		t=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		m=sc.nextInt();
		n=sc.nextInt();
		
		int app[]=new int[m];
		int or[]=new int[n];
		for(i=0;i<m;i++) {
			app[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			or[i]=sc.nextInt();
		}
		
		for(i=0;i<m;i++) {
			app[i]+=a;
			if(app[i]>=s && app[i]<=t) {
				capp++;
			}
		}
		for(i=0;i<n;i++) {
			or[i]+=b;
			if(or[i]>=s && or[i]<=t) {
				cor++;
			}
		}
		
		System.out.println(capp);
		System.out.println(cor);
		
		sc.close();
	}

}
