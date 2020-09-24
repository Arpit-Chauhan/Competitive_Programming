
import java.util.*;
import java.util.Collections;

public class Nsmallestvalue_a2oj
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,i;

		t=sc.nextInt();
		while(t-->0) {
		
		int arr[]=new int[10];
		
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		
		Arrays.parallelSort(arr);
		System.out.println(arr[1]);
		}
		
		sc.close();
	}

}
