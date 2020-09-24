import java.util.Scanner;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		int n,i,count;
		count=0;
		String s,b,q;
		b="010";
		
		n=sc.nextInt();
		sc.nextLine();
		s=sc.nextLine();
		if(s.contentEquals(b)) {
			System.out.println("1");
			System.exit(0);
		}
		
		for(i=0;i<n-2;i++) {
			q=s.substring(i,i+3);
			if(b.equals(q))
				count++;
		} 
		if(count==0)
			System.out.println(count);
		else
		System.out.println(count-1);

	}

}
