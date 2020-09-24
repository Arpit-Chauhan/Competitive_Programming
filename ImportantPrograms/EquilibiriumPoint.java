/*
 * FIND EQUILIBIRIUM POINT USING PREFIX SUM TECHNIQUE
 * 
 * */

import java.io.*; 
import java.util.*; 


public class EquilibiriumPoint
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j;

		n=sc.nextInt();
		int arr[]=sc.readArray(n);
		
		int sum =0,lsum=0,flag=0;
		for(i=0;i<n;i++)
			sum+=arr[i];
		
		for(i=0;i<n;i++) {
			if(lsum==sum-arr[i]) {
				flag=1;
				break;
			}
			else {
				lsum+=arr[i];
				sum-=arr[i];
			}
		}
		if(flag==1)
		out.println("Equilibirium exists at point = "+i);
		else
			out.println("No equilibirium point exists");

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
