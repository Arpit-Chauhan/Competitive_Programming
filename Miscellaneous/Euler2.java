
import java.util.*;
import java.util.Collections;

public class Euler2
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		long a,b,c,i,sum;
		a=0;b=1;
		sum=0;
		for(i=3;i<=4000000;i++) {
			c=a+b;a=b;b=c;
			if(c%2==0)
				sum+=c;
		}
		
		System.out.println(sum);

		sc.close();
	}
}

