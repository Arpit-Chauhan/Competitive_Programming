import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int t,count,i,len;
		String s;
		count=0;
		t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			s=sc.nextLine();
			len=s.length();
			for(i=0;i<len-1;i++) {
				char p,q;
				p=s.charAt(i);
				q=s.charAt(i+1);
				if(p==q) 
					count++;
					
				
			}
			System.out.println(count);
			count=0;
			
		}
		sc.close();

	}

}
