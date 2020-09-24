<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class COVID19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i,j,n,t,min,max,count;
		count=1;
		
		t=sc.nextInt();
		
		
			
		while(t-->0) { 
			
			n=sc.nextInt();
			int a[]=new int[n];
			
			boolean visited[]=new boolean[n]; 
			ArrayList<Integer> ar= new ArrayList<Integer>();
			Arrays.fill(visited, false);
			
			min=8;max=0;
			
			for(i=0;i<n;i++) 
				a[i]=sc.nextInt();
			
			Arrays.sort(a);
			
			for(i=0;i<n;i++) {
				 
			if(visited[i]==false) {
			for(j=i+1;j<n;j++) {
				if(a[j]-a[j-1]<=2)
				{
					count++;
					visited[j]=true;
				}
				else
					break;
				}
			ar.add(count);
			count=1;
			}
			}
			
			for(i=0;i<ar.size();i++) {
				if(ar.get(i)<min)
					min=ar.get(i);
				if(ar.get(i)>max)
					max=ar.get(i);
			}
			System.out.println(min+" "+max);
		
		}
		sc.close();	
	}


<<<<<<< HEAD
=======
=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class COVID19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i,j,n,t,min,max,count;
		count=1;
		
		t=sc.nextInt();
		
		
			
		while(t-->0) { 
			
			n=sc.nextInt();
			int a[]=new int[n];
			
			boolean visited[]=new boolean[n]; 
			ArrayList<Integer> ar= new ArrayList<Integer>();
			Arrays.fill(visited, false);
			
			min=8;max=0;
			
			for(i=0;i<n;i++) 
				a[i]=sc.nextInt();
			
			Arrays.sort(a);
			
			for(i=0;i<n;i++) {
				 
			if(visited[i]==false) {
			for(j=i+1;j<n;j++) {
				if(a[j]-a[j-1]<=2)
				{
					count++;
					visited[j]=true;
				}
				else
					break;
				}
			ar.add(count);
			count=1;
			}
			}
			
			for(i=0;i<ar.size();i++) {
				if(ar.get(i)<min)
					min=ar.get(i);
				if(ar.get(i)>max)
					max=ar.get(i);
			}
			System.out.println(min+" "+max);
		
		}
		sc.close();	
	}


>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
}