import java.util.Scanner;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		int n,i,j,val,pos;
		System.out.println("Enter no of elements");
		n=sc.nextInt();
		int arr[]=new int[n+1];
		for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
		
		System.out.println("Enter value and pos");
		val=sc.nextInt();
		pos=sc.nextInt();
		
		for(i=n;i>=pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=val;
		
		for(int item: arr)
			System.out.println(item);
		}

}
