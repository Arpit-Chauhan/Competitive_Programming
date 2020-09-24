
import java.io.*; 
import java.util.*; 


public class TREE2
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j;
		String s;

		t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			int arr[]=sc.readArray(n);
			
			int flag=0,count=1;
			Arrays.sort(arr);
			
			for(i=0;i<n;i++) {
				if(arr[i]!=0) {
					flag=1;
					break;
				}
			}
			if(flag==0) 
				out.println(0);
			else {
			for(i=0;i<n-1;i++) {
				if(arr[i]!=arr[i+1]) {
					count++;
				}
			}
			if(arr[0]==0)
			out.println(count-1);
			else
				out.println(count);
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
