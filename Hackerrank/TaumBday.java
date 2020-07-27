import java.util.Scanner;

public class TaumBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int n;
		long ans,bc,wc,b,w,z;
		n=sc.nextInt();
		
		while(n-->0) {
			b=sc.nextInt();
			w=sc.nextInt();
			bc=sc.nextInt();
			wc=sc.nextInt();
			z=sc.nextInt();
			
			if(bc==wc) {
				ans=b*bc+wc*w;
				System.out.println(ans);
			}
				
			if(bc<wc && (bc+z)>=wc) {	
				ans=b*bc+wc*w;
			System.out.println(ans);
			break;
			}
			if(wc<bc && (wc+z)>=bc) {	
				ans=b*bc+wc*w;
			System.out.println(ans);
			break;
			}
				
			if(bc<wc && (bc+z)<=wc)
			{
				ans=b*bc+w*(bc+z);
				System.out.println(ans);
			}
			if(wc<bc && (wc+z)<=bc)
			{
				ans=w*wc+b*(wc+z);
				System.out.println(ans);
			}
					
		}
sc.close();
	}

}
