<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.util.*;
import java.util.Collections;

public class HelpfulMaths
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,j;
		String s,ans;
		j=0;
		ans="";

		s=sc.nextLine();
		
		int arr[]=new int[(int)Math.ceil(s.length()/2.0)];
		for(i=0;i<s.length();i+=2) {
			char p=s.charAt(i);
			arr[j]=Integer.parseInt(String.valueOf(p));
			j++;
		}
		Arrays.sort(arr);
		
		for(i=0;i<arr.length;i++)
			ans=ans+Integer.toString(arr[i])+"+";
		
		System.out.println(ans.substring(0,ans.length()-1));

		sc.close();
	}
}
<<<<<<< HEAD
=======
=======

import java.util.*;
import java.util.Collections;

public class HelpfulMaths
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int i,j;
		String s,ans;
		j=0;
		ans="";

		s=sc.nextLine();
		
		int arr[]=new int[(int)Math.ceil(s.length()/2.0)];
		for(i=0;i<s.length();i+=2) {
			char p=s.charAt(i);
			arr[j]=Integer.parseInt(String.valueOf(p));
			j++;
		}
		Arrays.sort(arr);
		
		for(i=0;i<arr.length;i++)
			ans=ans+Integer.toString(arr[i])+"+";
		
		System.out.println(ans.substring(0,ans.length()-1));

		sc.close();
	}
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
