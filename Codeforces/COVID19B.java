/*
 * PARTIAL CORRECT
 * 
 * */
import java.io.*; 
import java.util.*; 


public class COVID19B
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,k;


		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		int arr[]=sc.readArray(n);
		
		List<Integer> ans=new ArrayList<>();
		
		int count=0;
		for(i=0;i<n;i++) {
			count=0;
			for(j=i;j>=0;j--) {
				if(arr[j]>arr[i])
					count++;
			}
			for(k=i;k<n;k++) {
				if(arr[k]<arr[i])
					count++;
			}
			ans.add(count+1);
		}
		
		Collections.sort(ans);
		out.println(ans.get(0)+" "+ans.get(n-1));
		
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
