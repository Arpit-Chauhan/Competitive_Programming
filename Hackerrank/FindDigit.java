import java.util.Scanner;

public class FindDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int  i,n,m,slen,count;
		count=0;
		String s;
		int t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		
		s=Integer.toString(n);
		slen=s.length();
		
		for(i=0;i<slen;i++) {
			char p=s.charAt(i);
			m=Integer.parseInt(String.valueOf(p));
			if(m==0)
				continue;
				
			if(n%m==0)
				count++;
		}
		System.out.println(count);
		count=0;
		}
		sc.close();

	}

}
