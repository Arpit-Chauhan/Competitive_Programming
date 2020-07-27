import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int n,x;
	n=sc.nextInt();
	x=sc.nextInt();
		    int count=0;
		    if(n%2!=0)
		    {
		        n--;
		    }
		    if(x%2!=0)
		    {
		        x--;
		    }
		    if(n-x>x-1)
		    for(int i=0;i<=x;i+=2)
		    {
		        count++;
		    }
		    else
		    {
		        for(int i=n;i>=x;i-=2)
		        {
		            count++;
		        }
		    }
		    count--;
		    System.out.println(count);
		    
		sc.close();

	}

}
