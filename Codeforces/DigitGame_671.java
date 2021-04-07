

import java.io.*; 
import java.util.*; 


public class DigitGame_671
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,a;
		
		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		String s=sc.nextLine();
            boolean odd=false,eve=false;
            for (i = 0; i < n; i++) {
                int temp=Integer.parseInt(String.valueOf(s.charAt(i)));
                if (n%2==0 && temp%2==0 && (i+1)%2==0){
                    out.println(2);
                    eve=true;
                    break;
                }
                if (n%2!=0 && temp%2!=0 && (i+1)%2!=0){
                    out.println(1);
                    odd=true;
                    break;
                }
            }
            if (!eve && n%2==0)
                out.println(1);
            if(!odd && n%2!=0)
                out.println(2);
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
