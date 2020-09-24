

import java.util.*;
import java.util.Collections;

public class Euler1
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int ans,i;
		ans=0;
		for(i=1;i<1000;i++) {
			if(i%3==0 || i%5==0)
				ans+=i;
		}
		System.out.println(ans);

		sc.close();
	}
}

