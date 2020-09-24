<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f

import java.io.*; 
import java.util.*; 


public class SortTheArray
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,s=0,e=0;
	

		n=sc.nextInt();
		int arr[]=sc.readArray(n);
		for( i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				s = i;
				e = i;
				while(e<arr.length-1 && arr[e]>arr[e+1]){
					e++;
				}
				break;
			}
		}
		Arrays.sort(arr, s, e+1);
		int count = 0;
		for(i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				count = 1;
				break;
			}
		}
		if(count==0){
			System.out.println("yes");
			System.out.println((s+1)+" "+(e+1));
		}else{
			System.out.println("no");
		}
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


public class SortTheArray
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,s=0,e=0;
	

		n=sc.nextInt();
		int arr[]=sc.readArray(n);
		for( i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				s = i;
				e = i;
				while(e<arr.length-1 && arr[e]>arr[e+1]){
					e++;
				}
				break;
			}
		}
		Arrays.sort(arr, s, e+1);
		int count = 0;
		for(i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				count = 1;
				break;
			}
		}
		if(count==0){
			System.out.println("yes");
			System.out.println((s+1)+" "+(e+1));
		}else{
			System.out.println("no");
		}
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
