/*
 * TWO POINTER ALGORITHM
 * 
 * */

import java.io.*; 
import java.util.*; 


public class TwoPointerAlgo
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int n=sc.nextInt();
		int sum=sc.nextInt();
		int arr[]=sc.readArray(n);
		
		twoPointer(n,sum,arr);

		out.close();
	}
	
	public static void twoPointer(int n,int sum,int arr[]) {
		int i=0,j=n-1;
		int flag=0;
		while(i<j) {
			if(arr[i]+arr[j]==sum) {
				flag=1;
				System.out.println(i+" "+j);
				break;
			}
			else if(arr[i]+arr[j]<sum)
				i++;
			else
				j--;
		}
		if(flag==0)
			System.out.println("NO");
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
