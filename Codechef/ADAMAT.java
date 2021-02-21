
import java.io.*; 
import java.util.*; 


public class ADAMAT
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,k;

		t=sc.nextInt();
		
		while(t-->0) {
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int count=0,flag=0;
		
		for(i=n-1;i>0;i--) {
			
			if(arr[i][i]!=arr[i][i-1]+1) {
				count++;
				
				for(j=0;j<i+1;j++) {
					for(k=j;k<i+1;k++) {
						int temp=arr[j][k];
						arr[j][k]=arr[k][j];
						arr[k][j]=temp;
					}
				}
			}
		}
		
		out.println(count);
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
