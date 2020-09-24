
import java.util.*;
import java.util.Collections;

public class threeindices
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int[] inp = new int[n];
			
			for(int i=0;i<n;++i)
			{
				inp[i] = sc.nextInt();
			}
			int ans = -1;
			int f = -1;
			int y = -1;
			for(int i=1;i<n-1;++i)
			{
				 f = -1;
				 y = -1;
				for(int j = 0;j<i;++j)
				{
					if(inp[i] > inp[j])
					{
						f = j;
						break;
					}
				}
				for(int j = i+1;j<n;++j)
				{
					if(inp[i] > inp[j])
					{
						y = j;
						break;
					}
				}
				
				if(f != -1 && y != -1)
				{
					ans = i;
					break;
				}
			}
			
			
			if(ans == -1)
				System.out.println("NO");
			else{
				System.out.println("YES");
				System.out.println((f+1) + " " + (ans+1) + " " + (y+1));
			}
		}

		sc.close();
	}
}

