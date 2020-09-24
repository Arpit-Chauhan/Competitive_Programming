<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;

public class EqualizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 
		 int n,i,j,count,max=0;
		 count=0;
		 n=sc.nextInt();
		 int a[]=new int[n];
		 
		 for(i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		 for(i=0;i<n;i++) {
			 for(j=0;j<n;j++) {
				 if(a[i]==a[j])
					 count++;
			 }
			 if(count>max)
				 max=count;
			 count=0;
		 }
		 if(max>0)
		 System.out.println(n-max);
		 else
			 System.out.println(n-1);
		 
		 sc.close();
		 
	}

}
=======
import java.util.Arrays;
import java.util.Scanner;

public class EqualizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 
		 int n,i,j,count,max=0;
		 count=0;
		 n=sc.nextInt();
		 int a[]=new int[n];
		 
		 for(i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		 for(i=0;i<n;i++) {
			 for(j=0;j<n;j++) {
				 if(a[i]==a[j])
					 count++;
			 }
			 if(count>max)
				 max=count;
			 count=0;
		 }
		 if(max>0)
		 System.out.println(n-max);
		 else
			 System.out.println(n-1);
		 
		 sc.close();
		 
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
