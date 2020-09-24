<<<<<<< HEAD


import java.io.*; 
import java.util.*; 


public class BOWLERS
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,k,l;
		String s;

		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		l=sc.nextInt();
		int flag=0;
		if(k*l<n || (k==1 && n>1)) {
			out.println(-1);
			continue;
		}
		int arr[]=new int[k];
		Arrays.fill(arr, l);
			while(true) {
			for(i=0;i<k;i++) {
				if(arr[i]!=0) {
					out.print((i+1)+" ");
					arr[i]--;
					n--;
					if(n==0)
						break;
				}
			}
			if(n==0)
				break;
			}
		
		out.println();
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
=======


import java.io.*; 
import java.util.*; 


public class BOWLERS
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,k,l;
		String s;

		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		k=sc.nextInt();
		l=sc.nextInt();
		int flag=0;
		if(k*l<n || (k==1 && n>1)) {
			out.println(-1);
			continue;
		}
		int arr[]=new int[k];
		Arrays.fill(arr, l);
			while(true) {
			for(i=0;i<k;i++) {
				if(arr[i]!=0) {
					out.print((i+1)+" ");
					arr[i]--;
					n--;
					if(n==0)
						break;
				}
			}
			if(n==0)
				break;
			}
		
		out.println();
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
