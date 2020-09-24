import java.util.Scanner;

public class BonApetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n,k,i,b,b2;
		b2=0;
		n=sc.nextInt();
		k=sc.nextInt();
		
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		b=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(i==k)
				continue;
			b2+=a[i];
		}
		b2/=2;
		if(b2==b) {
			System.out.println("Bon Appetit");
			}else {
				System.out.println(b-b2);
			}
		sc.close();
	}

}
