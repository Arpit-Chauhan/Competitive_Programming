import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int t,m,div,len,count,i;
		long n;
		count=0;
		String s,b;
		b="";
		s=sc.next();
		n=sc.nextLong();
		
		
		m=s.length();
		if(m==1 && s.equals("a")) {
			System.out.println(n);
		System.exit(0);	
		}
		for(i=0;i<m;i++) {
			char p=s.charAt(i);
			if(p=='a')
				count++;
			}
		
		if(n%m==0) {
			div=(int)n/m;
		
			System.out.println(count*div);
		}
		
		
		if(n%m!=0) {
			div=(int)n/m;
			t=(int)n%m;
			count=count*div;
			b=b+s.substring(0,t);
			len=b.length();
			for(i=0;i<len;i++) {
				char p=b.charAt(i);
				if(p=='a')
					count++;
				}
			System.out.println(count);
		}	
		sc.close();
	}

}
