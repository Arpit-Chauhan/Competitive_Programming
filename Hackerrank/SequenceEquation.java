import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		int n,i,j,k,m;
		n=sc.nextInt();
		int p[]=new int[n+1];
		
		for(i=1;i<=n;i++) {
			p[i]=sc.nextInt();
		}
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(p[j]==i) {
					m=j;
					for(k=1;k<=n;k++) {
						if(p[k]==m) {
							System.out.println(k);
							break;
						}
							
					}
				}
			}
		}
		sc.close();
	}

}
