import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int n,count;
		count=0;
		String s;
		s=sc.next();
		n=s.length();
		for(int i=0;i<n;i++) {
			char p=s.charAt(i);
			if(Character.isUpperCase(p)) {
				count++;	
			}
		}
	System.out.println(count+1);
	sc.close();

	}

}
