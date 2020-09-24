import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int d1,d2,m1,m2,y1,y2,fine;
		fine=0;
		d1=sc.nextInt();
		m1=sc.nextInt();
		y1=sc.nextInt();
		d2=sc.nextInt();
		m2=sc.nextInt();
		y2=sc.nextInt();
		
		
		if(d1>d2 && m1==m2 && y1==y2) {
			fine=15*(d1-d2);}
		if(m1>m2 && y1==y2) {
			fine=500*(m1-m2);}
		if(y1>y2) {
			fine=10000;
		}		
		System.out.println(fine);
		sc.close();
	}

}
