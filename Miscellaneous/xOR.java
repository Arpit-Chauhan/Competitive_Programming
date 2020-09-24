
import java.util.*;
import java.util.Collections;

public class xOR
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t,n,i,x1=0;
		String s;

		t=sc.nextInt();
		
		int arr[]=new int[t-1];
		
		for(i=0;i<t-1;i++)
		arr[i]=sc.nextInt();
		
		x1=arr[0]^t^(t-1);
		for(i=1;i<t-1;i++)
			x1^=i^arr[i];
	
		System.out.println(x1);

		sc.close();
	}
}

