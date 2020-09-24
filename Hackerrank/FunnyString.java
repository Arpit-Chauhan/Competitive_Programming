<<<<<<< HEAD
import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t,i,len,k,flag;
		flag=0;
		String s;
		t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			s=sc.nextLine();
			k=0;
			len=s.length();
			int a[]=new int[len];
			int b[]=new int[len];
			int c[]=new int[len-1];
			int d[]=new int[len-1];
			
			for(i=0;i<len;i++) {
				char p=s.charAt(i);
				a[i]=(int)p;
			}
			for(i=len-1;i>=0;i--) {
				b[k]=a[i];
				k++;
			}
			for(i=0;i<len-1;i++) {
				c[i]=Math.abs(a[i]-a[i+1]);
				d[i]=Math.abs(b[i]-b[i+1]);
			}
			for(i=0;i<len-1;i++) {
				if(c[i]!=d[i]) {
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
			
			flag=0;
			
			
		}
		sc.close();
	}

}
=======
import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t,i,len,k,flag;
		flag=0;
		String s;
		t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			s=sc.nextLine();
			k=0;
			len=s.length();
			int a[]=new int[len];
			int b[]=new int[len];
			int c[]=new int[len-1];
			int d[]=new int[len-1];
			
			for(i=0;i<len;i++) {
				char p=s.charAt(i);
				a[i]=(int)p;
			}
			for(i=len-1;i>=0;i--) {
				b[k]=a[i];
				k++;
			}
			for(i=0;i<len-1;i++) {
				c[i]=Math.abs(a[i]-a[i+1]);
				d[i]=Math.abs(b[i]-b[i+1]);
			}
			for(i=0;i<len-1;i++) {
				if(c[i]!=d[i]) {
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
			
			flag=0;
			
			
		}
		sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
