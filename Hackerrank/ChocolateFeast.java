import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int t,n,c,m,total,wrapper;
		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		c=sc.nextInt();
		m=sc.nextInt();
		
		total=n/c;
		wrapper=total;
		while(wrapper>=m) {
			total+=wrapper/m;
			wrapper=wrapper%m+(wrapper/m);
		}
		System.out.println(total);
		}
		
		sc.close();
	}

}
