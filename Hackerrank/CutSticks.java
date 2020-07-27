import java.util.Arrays;
import java.util.Scanner;

public class CutSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int min,n,cz,i,count;
		count=cz=0;
		n=sc.nextInt();
		
		
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(n);
		min=a[0];
		while(cz!=n) {
			cz=0; 
			
		for(i=0;i<n;i++) {
			if(a[i]<min && a[i]!=0)
				min=a[i];
		}
		
		for(i=0;i<n;i++) {
			if(a[i]>0)
			a[i]-=min;
		}
		for(i=0;i<n;i++) {
			if(a[i]>0) {
				count++;
			}
		}
		if(count>0)
		System.out.println(count);
		
		count=0;
		for(i=0;i<n;i++) {
			if(a[i]==0)
				cz++;
		}
		Arrays.sort(a);
		min=a[n-1];
		
		}
sc.close();
	}

}
