import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n,m,i,t,flag=0;
		String s,p;
		int a[]=new int[255];
		int b[]=new int[255];
		
		t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			s=sc.nextLine();
			p=sc.nextLine();
			n=s.length();
			m=p.length();
			
			Arrays.fill(a, 0);
			Arrays.fill(b, 0);
			
		for(i=0;i<n;i++) {
			char k=s.charAt(i);
			a[(int)k]++;
		}
		for(i=0;i<m;i++) {
			char k=p.charAt(i);
			b[(int)k]++;
		}
			for(i=97;i<=122;i++) {
				if(a[i]!=0 && b[i]!=0) {
					flag=1;
					break;
				}	
			}
			if(flag==1)
				System.out.println("YES");
			if(flag==0) 
				System.out.println("NO");
			
			flag=0;
		}
		sc.close();
	}

}
