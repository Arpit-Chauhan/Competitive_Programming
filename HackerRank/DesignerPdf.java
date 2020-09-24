<<<<<<< HEAD
import java.util.Scanner;

public class DesignerPdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n,i,maxh,c,ans;
		maxh=0;
		int a[]=new int[26];
		for(i=0;i<26;i++) {
			a[i]=sc.nextInt();
		}
		
		String s;
		s=sc.next();
		n=s.length();
		
		for(i=0;i<n;i++) {
			c=(int)s.charAt(i);
			if(a[c-97]>maxh)
				maxh=a[c-97];
			
		}
		ans=maxh*n;
		System.out.println(ans);
		sc.close();

	}

}
=======
import java.util.Scanner;

public class DesignerPdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n,i,maxh,c,ans;
		maxh=0;
		int a[]=new int[26];
		for(i=0;i<26;i++) {
			a[i]=sc.nextInt();
		}
		
		String s;
		s=sc.next();
		n=s.length();
		
		for(i=0;i<n;i++) {
			c=(int)s.charAt(i);
			if(a[c-97]>maxh)
				maxh=a[c-97];
			
		}
		ans=maxh*n;
		System.out.println(ans);
		sc.close();

	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
