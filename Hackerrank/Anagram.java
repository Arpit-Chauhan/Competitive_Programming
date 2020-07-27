import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i,t,len,len1,count;
		count=0;
		String str,first,sec;
		t=sc.nextInt();
		sc.nextLine();
		
		int a[]=new int[255];
		int b[]=new int[255];
		boolean visited[]=new boolean[255];
		while(t-->0) {
			Arrays.fill(a, 0);
			Arrays.fill(b, 0);
			Arrays.fill(visited, false);
			
			 str=sc.nextLine();
			len=str.length();
			
			if(len%2==0) {
				first=str.substring(0,len/2);
				sec=str.substring(len/2, len);
				
				len1=first.length();
				
				for(i=0;i<len1;i++) {
					char p=first.charAt(i);
					a[(int)p]++;
				}
				for(i=0;i<len1;i++) {
					char p=sec.charAt(i);
					a[(int)p]--;
				}
				for(i=97;i<=122;i++) {
					if(a[i]>=0)
					count+=a[i];
					
				}
				System.out.println(count);
				count=0;
				
			}
			else
				System.out.println("-1");	
		}
		sc.close();

	}

}
