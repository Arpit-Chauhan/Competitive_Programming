<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.io.*; 
import java.util.*; 


public class Chord
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j;
		String s;
		
		String arr[]= {"C","C#","D","D#","E","F","F#","G","G#","A","B","H"};
		String a[]=new String[3];
		a[0]=sc.next();
		a[1]=sc.next();
		a[2]=sc.next();
		int pos[]=new int[12];
		int flag=0;
		
		for(i=0;i<arr.length;i++) {
			if(arr[i].equals(a[0]))
				pos[i]=1;
			if(arr[i].equals(a[1]))
				pos[i]=1;
			if(arr[i].equals(a[2]))
				pos[i]=1;	
		}
		
		for(i=0;i<12;i++) {
			if(pos[i]==1) {
				if(pos[(i+3)%12]==1 && pos[(i+7)%12]==1) {
					out.println("minor");
					flag=1;
					break;
				}
				else if(pos[(i+4)%12]==1 && pos[(i+7)%12]==1) {
					out.println("major");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		out.println("strange");

		out.close();
	}
	




	/*
		FASTREADER
	*/
	static class FastReader 
    	{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
	
		/*DEFINED BY ME
		*/
		int[] readArray(int n){
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)
				arr[i]=nextInt();
			
			return arr;
		}
    } 
}
<<<<<<< HEAD
=======
=======

import java.io.*; 
import java.util.*; 


public class Chord
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j;
		String s;
		
		String arr[]= {"C","C#","D","D#","E","F","F#","G","G#","A","B","H"};
		String a[]=new String[3];
		a[0]=sc.next();
		a[1]=sc.next();
		a[2]=sc.next();
		int pos[]=new int[12];
		int flag=0;
		
		for(i=0;i<arr.length;i++) {
			if(arr[i].equals(a[0]))
				pos[i]=1;
			if(arr[i].equals(a[1]))
				pos[i]=1;
			if(arr[i].equals(a[2]))
				pos[i]=1;	
		}
		
		for(i=0;i<12;i++) {
			if(pos[i]==1) {
				if(pos[(i+3)%12]==1 && pos[(i+7)%12]==1) {
					out.println("minor");
					flag=1;
					break;
				}
				else if(pos[(i+4)%12]==1 && pos[(i+7)%12]==1) {
					out.println("major");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		out.println("strange");

		out.close();
	}
	




	/*
		FASTREADER
	*/
	static class FastReader 
    	{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
	
		/*DEFINED BY ME
		*/
		int[] readArray(int n){
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)
				arr[i]=nextInt();
			
			return arr;
		}
    } 
}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
