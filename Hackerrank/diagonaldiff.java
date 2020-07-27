import java.util.Scanner;
public class diagonaldiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);	
		int n=s.nextInt();
		int ele,suml,sumr,tsum;
		suml=sumr=0;
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ele=s.nextInt();
				arr[i][j]=ele;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					suml+=arr[i][j];
				}
				if(i+j==n-1) {
					sumr+=arr[i][j];
				}
				
			}
		}
		tsum=Math.abs(sumr-suml);
		System.out.println(tsum);
		s.close();
		

	}

}
