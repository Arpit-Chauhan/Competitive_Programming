<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;

public class BetweenSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
		
		int n,k,m,i,j,t,flag,vis,f,count;
		flag=f=1;count=vis=0;
		n=sc.nextInt();
		m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<m;i++) {
			b[i]=sc.nextInt();	
		}
		Arrays.sort(b);
		k=b[0];
		for(i=1;i<=k;i++) {
			if(k%i==0) {
				for(j=1;j<m;j++) {
					if(b[j]%i!=0) {
						flag=0;
						f=0;
						break;
					}
				}
					if(flag==1 && vis==0) {
						for(t=0;t<n;t++) {
							if(i%a[t]==0)
								f=1;
							else {
								f=0;
								break;
							}
						}
						
					}
				
				if(f==1 && flag==1 ){
					count++;
					vis=1;
					f=0;
				}
				
				
				
			}
			flag=f=1;vis=0;
		}
		System.out.println(count);
		
		
	}

}
=======
import java.util.Arrays;
import java.util.Scanner;

public class BetweenSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
		
		int n,k,m,i,j,t,flag,vis,f,count;
		flag=f=1;count=vis=0;
		n=sc.nextInt();
		m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<m;i++) {
			b[i]=sc.nextInt();	
		}
		Arrays.sort(b);
		k=b[0];
		for(i=1;i<=k;i++) {
			if(k%i==0) {
				for(j=1;j<m;j++) {
					if(b[j]%i!=0) {
						flag=0;
						f=0;
						break;
					}
				}
					if(flag==1 && vis==0) {
						for(t=0;t<n;t++) {
							if(i%a[t]==0)
								f=1;
							else {
								f=0;
								break;
							}
						}
						
					}
				
				if(f==1 && flag==1 ){
					count++;
					vis=1;
					f=0;
				}
				
				
				
			}
			flag=f=1;vis=0;
		}
		System.out.println(count);
		
		
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
