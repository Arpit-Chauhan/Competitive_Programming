import java.util.Scanner;

public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int q,x,y,z,ans,ans1;
		q=sc.nextInt();
		while(q-->0) {
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			
			ans=Math.abs(z-y);
			ans1=Math.abs(z-x);
			if(ans>ans1)
				System.out.println("Cat A");
			else if(ans==ans1)
				System.out.println("Mouse C");
			else
				System.out.println("Cat B");
		}
		sc.close();
	}

}
