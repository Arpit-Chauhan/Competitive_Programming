
import java.io.*; 
import java.util.*; 


public class Nikhil
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,i,j;
		int n=sc.nextInt();
		 String s = "";  
	        int c = 1; 
	        for (i=1;;i++) { 
	            if (c < 10) 
	                s+= Integer.toString(c); 
	            else
	            { 
	                String s1 = ""; 
	                int temp2 = c;  
	                while (temp2 >0) { 
	                    s1+= Integer.toString(temp2% 10); 
	                    temp2/= 10; 
	                } 
	                StringBuilder temp = new StringBuilder();  
	                temp.append(s1);  
	                temp = temp.reverse();   
	                s+= temp; 
	            } 
	            c++; 
	            if (s.length() >=n) { 
	               out.println(s.charAt(n-1));
	               break;
	            } 
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
