import java.util.Scanner;

public class kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		int x1,x2,v1,v2,jump1,jump2;
		jump1=jump2=0;
		x1=sc.nextInt();
		v1=sc.nextInt();
		x2=sc.nextInt();
		v2=sc.nextInt();
		if(x2>x1 && v2>=v1 || x1>x2 && v1>=v2) {
			System.out.println("NO");
			System.exit(0);
		}
		while(true) {
			
				if(x1<=x2 || jump1!=jump2)
				{
					x1+=v1;
					jump1++;
				}
				if(x2<=x1 || jump1!=jump2 )
				{
					x2+=v2;
					jump2++;
				}
				if(x1==x2 && jump1==jump2) {
					System.out.println("YES");
					break;
				}
				if(x2>x1 && v2>=v1 && jump1==jump2 || x1>x2 && v1>=v2 && jump1==jump2) {
					System.out.println("NO");
					System.exit(0);
				}
			}
		
		sc.close();
		}

}
