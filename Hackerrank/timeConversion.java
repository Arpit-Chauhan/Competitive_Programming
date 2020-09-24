import java.util.Scanner;
public class timeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String time=sc.next();
	String	mid,t1,tw;
	tw="12";
	int t,t2;
		String ans;
		mid=time.substring(0, 2);
		if(mid.equals(tw)){
			t2=0;
		}else
			t2=1;
		
		if(time.charAt(8)=='P' && t2==1) {
			
			t=Integer.parseInt(mid);
			t=t+12;
			t1=Integer.toString(t);
			ans=t1+time.substring(2,8);
			System.out.println(ans);
		}

		if(time.charAt(8)=='P' &&  t2==0) {
			ans="12"+time.substring(2,8);
			System.out.println(ans);
		}
		
		if(time.charAt(8)=='A' && t2==0) {
			ans="00"+time.substring(2,8);
			System.out.println(ans);
		}		

		if(time.charAt(8)=='A' && t2==1) {
			ans=time.substring(0,8);
			System.out.println(ans);
		}		
	
	sc.close();
	}

}
