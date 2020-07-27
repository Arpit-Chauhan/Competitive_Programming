import java.util.Scanner;

public class BreakingRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n,i,max,min,maxc,minc;
		n=sc.nextInt();
		maxc=minc=0;
		
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		min=arr[0];
		
		for(i=0;i<n;i++) {

				if(arr[i]>max) {
					max=arr[i];
					maxc++;
				}
				if(arr[i]<min) {
					min=arr[i];
					minc++;
				}	
			}
		
		System.out.print(maxc);
		System.out.println(minc);
		sc.close();
	}

}
