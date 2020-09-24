/*
 * PARTIAL CORRECT
 * */
import java.io.*; 
import java.util.*; 


public class MODEFREQ
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
		Arrays.parallelSort(arr);
		List<Integer> list = new ArrayList<>();
		
		int count=1;
		i=1;
		
		while(i<=n) {
			while(i<n && arr[i]==arr[i-1]) {
				count++;
				i++;
			}
			list.add(count);
			i++;
			count=1;
		}
		
			
		int res=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		count=1;
		
		Collections.sort(list);
		
		if(list.size()==1) {
			out.println(list.get(0));
		}
		else {
			i=1;
			while(i<=list.size()) {
				while(i<list.size() && list.get(i)==list.get(i-1)) {
					count++;
					i++;
				}
				if(count>max) {
					max=count;
					res=list.get(i-1);
				}
				if(count==max) 
					res=Math.min(res, list.get(i-1));
				
					count=1;
					i++;
			}	
			out.println(res);
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
