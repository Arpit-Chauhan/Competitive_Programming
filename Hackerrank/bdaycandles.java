import java.util.Scanner;
public class bdaycandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n,i,max,c;
		c=0;
		n=s.nextInt();
		
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		max=a[0];
		for(i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		for(i=0;i<n;i++) {
			if(a[i]==max) {
				c++;
			}
		}
		System.out.println(c);
		s.close();
	}

}
