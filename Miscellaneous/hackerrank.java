
import java.util.*;
import java.util.Collections;

public class hackerrank
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,j,flag=0,flag2=0;

		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		
		for(i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				flag=1;
				break;
			}
				
		}
		for(i=0;i<n-1;i++) {
			if(arr[i]<arr[i+1]) {
				flag2=1;
				break;
			}
				
		}
		if(flag!=1 || flag2!=1)
			System.out.println("No Profit");
			
		if(flag==1 && flag2==1) {
		for(i=0;i<n-1;i++) {
			int count=0;
			for(j=i+1;j<n;j++) {
				if(arr[j]<=arr[i])
					break;
				else 
					count++;
			}
				if(count>=1) {
				System.out.print("("+i+" "+(j-1)+") ");
				i=j-1;
				}
		}
		}
		

		sc.close();
	}
}
