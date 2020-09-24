
import java.util.*;
import java.util.Collections;

public class BallonColors_a2oj
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,x,y;
		

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		if(arr[0]==x && arr[n-1]==y)
			System.out.println("BOTH");
		if(arr[0]==x && arr[n-1]!=y)
			System.out.println("EASY");
		if(arr[0]!=x && arr[n-1]==y)
			System.out.println("HARD");
		if(arr[0]!=x && arr[n-1]!=y)
			System.out.println("OKAY");
			}
		sc.close();
	}
}
