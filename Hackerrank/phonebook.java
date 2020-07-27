import java.io.*;
import java.util.Scanner;
public class phonebook {
	public static void main(String[] args)throws IOException
	{
		int n,i,j,len;
		String x,nm;
		char p;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String a[]=new String[n];
	 j=0;
		String b[]=new String[n];
		sc.nextLine();
		for(i=0;i<n;i++) {
			nm=sc.nextLine();
			len=nm.length();
			for(j=0;j<len;j++) {
				p=nm.charAt(j);
				if(p==' ') {
			a[i]=nm.substring(0,j);
			b[i]=nm.substring(j+1);
			}
		}
		}
		
		while(sc.hasNext()) {
			x=sc.next();
			for(i=0;i<n;i++)
			{
				if(x.equals(a[i])) {
					System.out.println(a[i]+"="+b[i]);
					break;
					}
			}if(i==n)
					System.out.println("Not found");
			
		}
		sc.close();
	
	
	}
}
