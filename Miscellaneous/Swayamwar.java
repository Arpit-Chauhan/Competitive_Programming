
import java.util.*;
import java.util.Collections;

public class Swayamwar
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,j,flag=0;
		String s,m,temp;

		n=sc.nextInt();
		sc.nextLine();
		s=sc.nextLine();
		m=sc.nextLine();
		temp=m;
		
			while(true) {
				flag=0;
			for(j=0;j<m.length();j++) {
				char p=s.charAt(0);
				char q=m.charAt(j);
				if(p==q) {
					temp=m.substring(j,m.length())+m.substring(0, j);
					flag=1;
					s=s.substring(1, s.length());
					m=temp.substring(1, temp.length());
					break;
				}
			}
			if(flag==0 || s.length()==0)
				break;
			}
		
		System.out.println(s.length());

		sc.close();
	}
}

