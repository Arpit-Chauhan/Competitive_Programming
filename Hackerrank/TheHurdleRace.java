import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,k,i,dose,m;
		dose=0;
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		m=a[n-1];
		if(k<m) {
			for(i=k+1;i<=m;i++)
				dose++;
		}
		System.out.println(dose);
		sc.close();

	}

}
