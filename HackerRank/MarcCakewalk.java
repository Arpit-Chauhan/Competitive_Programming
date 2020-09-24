import java.util.*;
import java.util.Scanner;

public class MarcCakewalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,i,c,k,sum;
		c=sum=k=0;
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=n-1;i>=0;i--) {
			b[c]=a[i];
			c++;
		}
		for(i=0;i<n;i++) {
			sum+=Math.pow(2, k)*b[i];
			k++;
		}
		System.out.println(sum);
		sc.close();
	}

}
