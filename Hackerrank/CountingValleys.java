import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,i,alt,count;
		alt=count=0;
		String s;
		n=sc.nextInt();
		sc.hasNext();
		s=sc.next();
		
		char a[]=s.toCharArray();
		for(i=0;i<n;i++) {
			if(a[i]=='U')
				alt++;
			else
				alt--;
			
			if(alt==0 && a[i]=='U')
				count++;
		}
		System.out.println(count);
sc.close();
	}

}
