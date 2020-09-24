<<<<<<< HEAD
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,i,k,t;
		n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		k=sc.nextInt();
		String ans;
		ans="";
		char q;
		
		for(i=0;i<n;i++) {
 	char p=s.charAt(i);
			int m=(int)p;
			if(m>=65 && m<=122 || m>=97 && m<=122 ) { 
				t=m+(k%26);
				if(t>90 && t<97 || t>122) {
				q=(char)(t-26);
				ans=ans+q;
				}
				else {
					q=(char)t;
					ans=ans+q;
					}
			}
			else {
				q=(char)m;
				ans=ans+q;
			}
				
		}
		System.out.println(ans);
		sc.close();

	}

}
=======
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,i,k,t;
		n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		k=sc.nextInt();
		String ans;
		ans="";
		char q;
		
		for(i=0;i<n;i++) {
 	char p=s.charAt(i);
			int m=(int)p;
			if(m>=65 && m<=122 || m>=97 && m<=122 ) { 
				t=m+(k%26);
				if(t>90 && t<97 || t>122) {
				q=(char)(t-26);
				ans=ans+q;
				}
				else {
					q=(char)t;
					ans=ans+q;
					}
			}
			else {
				q=(char)m;
				ans=ans+q;
			}
				
		}
		System.out.println(ans);
		sc.close();

	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
