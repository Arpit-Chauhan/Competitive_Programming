
/*
 * 
 * TLE
 * 
 * */
import java.io.*; 
import java.util.*; 


public class CubesSorting
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
		int maxmoves=(n*(n-1)/2)-1;
		int arr[]=sc.readArray(n);
		int count=0,flag=0;
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=1;
					count++;
				}
			}
			if(flag==0)
				break;
			flag=0;
		}
		if(count>maxmoves)
		out.println("NO");
		else
			out.println("YES");
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
