import java.util.Scanner;

public class BeautifulDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		int n,m,i,count,j,k,dig,pal;
		pal=count=0;
		i=sc.nextInt();
		j=sc.nextInt();
		k=sc.nextInt();
		
		for(n=i;n<=j;n++) {
			m=n;
			while(m>0) {
				dig=m%10;
				m=m/10;
				pal=pal*10+dig;
			}
			if(Math.abs(n-pal)%k==0)
				count++;
			pal=0;
			
		}
		System.out.println(count);

	}

}
