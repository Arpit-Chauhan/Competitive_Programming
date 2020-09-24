<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.Arrays;
import java.util.Scanner;

public class CARSELL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n,i,t,count,temp;
		long mod,ans;
		ans=0;count=0;
		mod=(long)Math.pow(10,9)+7;
		
		t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			
			for(i=n-1;i>=0;i--) {
				
				if(a[i]!=0) {
				temp=a[i]-count;
				if(temp<=0) {
					ans+=0;
				}
				else
					ans+=temp;
				}
				else {
					ans+=0;
				}
				count++;
			}
			System.out.println(ans%mod);
			count=0;
			ans=0;	
		}
		
		sc.close();
	}

}
<<<<<<< HEAD
=======
=======
import java.util.Arrays;
import java.util.Scanner;

public class CARSELL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n,i,t,count,temp;
		long mod,ans;
		ans=0;count=0;
		mod=(long)Math.pow(10,9)+7;
		
		t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			
			for(i=n-1;i>=0;i--) {
				
				if(a[i]!=0) {
				temp=a[i]-count;
				if(temp<=0) {
					ans+=0;
				}
				else
					ans+=temp;
				}
				else {
					ans+=0;
				}
				count++;
			}
			System.out.println(ans%mod);
			count=0;
			ans=0;	
		}
		
		sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
