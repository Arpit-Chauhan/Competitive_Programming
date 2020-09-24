import java.util.Scanner;

public class HalloweenSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int p,d,m,s,t,count;
		t=count=0;
		
		p=sc.nextInt();
		d=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
		
		while(t<=s) {
			if(p<=m) {
				t+=m;
				count++;
			}
			else {
				t+=p;
				p-=d;
				count++;
			}
		}
		
		System.out.println(count-1);
		sc.close();
	}

}
