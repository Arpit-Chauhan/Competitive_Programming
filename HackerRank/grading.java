import java.util.Scanner;
public class grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n,i,diff,mul;
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]= new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for( i=0;i<n;i++) {
		if(a[i]<38 || a[i]%5==0) {
			b[i]=a[i];
		}
		else {
			if(a[i]%5!=0) {
				mul=a[i]/5;
				diff=5*(mul+1)-a[i];
				if(diff<3) {
					b[i]=5*(mul+1);
				}else {
					b[i]=a[i];
				}
			}
		}
		
		}
		
		for(int item: b) {
			System.out.println(item);
		}
		sc.close();
	}

}
