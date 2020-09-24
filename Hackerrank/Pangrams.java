<<<<<<< HEAD
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int i,m,len,count;
		count=0;
		
		String s,a;
		s=sc.nextLine();
		a=s.toLowerCase();
		len=a.length();
		int arr[]=new int[256];
		
		for(i=0;i<len;i++) 
		{
			char p=a.charAt(i);
			m=(int)p;
			arr[m]=1;
			
		}
		for(i=97;i<=122;i++) {
			if(arr[i]==1)
				count++;
		}
		if(count==26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		sc.close();
	}

}
=======
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int i,m,len,count;
		count=0;
		
		String s,a;
		s=sc.nextLine();
		a=s.toLowerCase();
		len=a.length();
		int arr[]=new int[256];
		
		for(i=0;i<len;i++) 
		{
			char p=a.charAt(i);
			m=(int)p;
			arr[m]=1;
			
		}
		for(i=97;i<=122;i++) {
			if(arr[i]==1)
				count++;
		}
		if(count==26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		sc.close();
	}

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
