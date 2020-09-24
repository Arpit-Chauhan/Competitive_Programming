/*
 *	 
 * 	RUNTIME ERROR
 * */

import java.io.*; 
import java.util.*; 


public class MVAL
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int n,i,t;

		t=sc.nextInt();
		while(t-->0) {
		n=sc.nextInt();
		int arr[]=sc.readArray(n);
		
		ArrayList<Integer> ans=new ArrayList<>();
		ArrayList<Integer> temp=new ArrayList<>();
		
		long count=0;
		long res=Long.MIN_VALUE;
		
		Arrays.sort(arr);
		
		for(i=0;i<n;i++) {
			count+=arr[i];
			temp.add(arr[i]);
			if(count>res) {
				res=count;
				ans.clear();
				ans.addAll(temp);
			}
			else
				temp.clear();
			
			if(count<0) {
				count=0;
				temp.clear();
			}
			if(count==0) {
				temp.clear();
			}
		}
		
		if(res<0) {
			out.println(0);
			out.println(0);
		}
		else if(res==0) {
			out.println(0);
			out.println(1+" "+0);
		}
		else {
			out.println(res);
			out.print(ans.size()+" ");
			for(int item:ans)
				out.print(item+" ");
			out.println();
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
