/*
 * FIND A SUM OF SUBARRAY IF IT IS EQUAL TO A GIVEN SUM
 * ONLY POSITIVE NUMBERS IN AN ARRAY
 * */

import java.io.*; 
import java.util.*; 


public class SubArraySum
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int sum,n,i,j;
		String s;
		
		n=sc.nextInt();
		sum=sc.nextInt();
		int arr[]=sc.readArray(n);
		
		boolean result=subarray(arr,n,sum);
		
		if(result)
		out.println("Subarray exists");
		else
			out.println("no solution");

		out.close();
	}
	

	public static boolean subarray(int arr[],int n,int sum) {
		int i,j,s=0,currsum=arr[0];
		
		for(i=1;i<n;i++) {
			while(currsum>sum && s<i-1) {
				currsum-=arr[s];
				s++;
			}
			if(currsum==sum)
				return true;
			if(i<n)
				currsum+=arr[i];
		}
		return(currsum==sum);
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
