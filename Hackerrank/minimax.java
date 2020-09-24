<<<<<<< HEAD
import java.util.Scanner;
public class minimax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[]=new int [5];
		int i,j,temp;
		long minsum,maxsum;
		minsum=maxsum=0;
		for( i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				if(arr[j+1]<arr[j]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(i=0;i<4;i++) {
			minsum+=arr[i];
		}
		for(i=1;i<5;i++) {
			maxsum+=arr[i];
		}
		System.out.println(minsum+" "+maxsum);
		sc.close();
		
	}

}
=======
import java.util.Scanner;
public class minimax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[]=new int [5];
		int i,j,temp;
		long minsum,maxsum;
		minsum=maxsum=0;
		for( i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				if(arr[j+1]<arr[j]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(i=0;i<4;i++) {
			minsum+=arr[i];
		}
		for(i=1;i<5;i++) {
			maxsum+=arr[i];
		}
		System.out.println(minsum+" "+maxsum);
		sc.close();
		
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
