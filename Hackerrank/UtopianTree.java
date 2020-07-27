import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int t,n,i,h;
		h=0;
		t=sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();
			for(i=0;i<=n;i++) {
				if(i%2==0)
					h++;
				else
					h*=2;
			}
			System.out.println(h);
			h=0;
		}
		sc.close();

	}

}
