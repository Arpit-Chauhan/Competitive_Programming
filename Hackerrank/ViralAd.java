import java.util.Scanner;

public class ViralAd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,lcount,likes;
		lcount=0;
		int a=5;
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			likes=(int)a/2;
			a=likes*3;
			lcount+=likes;
			
		}
		System.out.println(lcount);
		sc.close();
	}

}
