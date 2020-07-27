import java.util.Arrays;
import java.util.Scanner;

public class HackerRankInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int i,pos,len,count,j;
		pos=count=0;
		String s;
		int t;
		t=sc.nextInt();
		sc.hasNext();
		String a="hackerrank";
		char b[]=a.toCharArray();
		
		boolean visited[]= new boolean[10];
		
		while(t-->0) {
			
		s=sc.next();
		len=s.length();
		
		
		Arrays.fill(visited, false);
		
		for(i=0;i<10;i++) {
			char q=b[i];
			for(j=pos;j<len;j++) {
			char p=s.charAt(j);
			if(q==p && visited[i]==false) {
				visited[i]=true;
				pos=j+1;
				break;
			}		
		}
		}
			for(i=0;i<10;i++) {
				if(visited[i]==true)
					count++;
			}
		
			if(count==10)
				System.out.println("YES");
			else
				System.out.println("NO");
			count=pos=0;
		}
		sc.close();
		
	}

}
