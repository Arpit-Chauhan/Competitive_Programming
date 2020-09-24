import java.util.Scanner;

public class RoadNotTaken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		long temp=Long.MAX_VALUE;
		long min;
		min=0;
			n=sc.nextInt();
			
			long a[]=new long[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
	
			for(i=0;i<n;i++) {
				for(j=i+1;j<n;j++) {
					if(Math.abs(a[i]-a[j])<temp) {
						min=Math.abs(a[i]-a[j]);
						temp=min;
				}
				}
			}
			
			System.out.println(min);
			sc.close();
	}

}
