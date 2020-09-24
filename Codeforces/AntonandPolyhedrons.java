<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f


import java.util.*;
import java.util.Collections;

public class AntonandPolyhedrons
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,faces;
		String s;
		faces=0;

		n=sc.nextInt();
		sc.nextLine();
		String arr[]= {"Tetrahedron","Cube","Octahedron","Dodecahedron","Icosahedron"};
		int b[]= {4,6,8,12,20};
		
		while(n-->0) {
			s=sc.nextLine();
			for(i=0;i<arr.length;i++) {
				if(s.equals(arr[i]))
					faces+=b[i];
			}
		}
		
		System.out.println(faces);

		sc.close();
	}
}

<<<<<<< HEAD
=======
=======


import java.util.*;
import java.util.Collections;

public class AntonandPolyhedrons
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		int n,i,faces;
		String s;
		faces=0;

		n=sc.nextInt();
		sc.nextLine();
		String arr[]= {"Tetrahedron","Cube","Octahedron","Dodecahedron","Icosahedron"};
		int b[]= {4,6,8,12,20};
		
		while(n-->0) {
			s=sc.nextLine();
			for(i=0;i<arr.length;i++) {
				if(s.equals(arr[i]))
					faces+=b[i];
			}
		}
		
		System.out.println(faces);

		sc.close();
	}
}

>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
