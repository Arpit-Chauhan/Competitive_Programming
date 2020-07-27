import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int n,k,i,j,m,cn,csa,cla,cs,count;
		
		cs=cn=csa=cla=count=m=0;
		String s;
		n=sc.nextInt();
		sc.nextLine();
		s=sc.nextLine();
		
		char a[]= {'!','@','#','$','%','^','&','*','(',')','-','+'};
		for(i=0;i<n;i++) {
			char p=s.charAt(i);
			
			for(j=0;j<a.length;j++) {
				if(a[j]==p) {
					cs++;
				}
			}
			
			k=(int)p;
			if(k>=48 && k<=57)
				cn++;
			if(k>=65 && k<=90)
				csa++;
			if(k>=97 && k<=122)
				cla++;		
		}
		
		int b[]= {cs,cla,csa,cn};
		
		for(i=0;i<b.length;i++) {
			if(b[i]==0)
				count++;
		}
		
		if(n<6) {
			m=n+count;
			if(m>=6)
			System.out.println(count);
			else
				System.out.println(6-m+count);
			}
		if(n>=6)
			System.out.println(count);
		sc.close();
	}

}
