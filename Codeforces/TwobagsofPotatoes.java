import java.util.*;
import java.io.*;
public class TwobagsofPotatoes{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		int y,k,n;
		y = input.nextInt();
		k = input.nextInt();
		n = input.nextInt();
		int x = (y/k)+1;
	int flag = 1;
	 while(x*k <= n){

                    System.out.print((x*k - y)+" ");
                    flag = 0;
                    x++;
                }
                if(flag==1)
                    System.out.print(-1);
	}
}