import java.util.Scanner;

public class MarsExplore{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n,i,j,count;
		count=0;
		String s;
		s=sc.nextLine();
		n=s.length();
		
		 for(i=0;i<n;i+=3) {
	            for(j=i;j<i+3;j++){
	            char p=s.charAt(j);
	                if(j==i && p!='S')
	                count++;
	                if(j==i+1 && p!='O')
	                count++;
	                if(j==i+2 && p!='S')
	                count++;
	        }
	        }
		System.out.println(count);
		sc.close();
	}

}
