/*
 * NOT A CLEAR QUESTION
 * SO BAD CDEFORCES NOT EXPECTED !!
 * 
 * */
import java.io.*; 
import java.util.*; 


public class StrangeAddition
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t,n,i,j,flag=0;
		String s;

		n=sc.nextInt();
		int arr[]=sc.readArray(n);
		List<Integer> non= new ArrayList<>();
		List<Integer> zero= new ArrayList<>();
		
		for(i=0;i<n;i++) {
			flag=0;
			s=Integer.toString(arr[i]);
			for(j=0;j<s.length();j++) {
				char p=s.charAt(j);
				if(p=='0') {
					flag=1;
					zero.add(arr[i]);
					break;
				}
			}
			if(flag==0)
				non.add(arr[i]);
		}
		
		
		if(non.size()<zero.size()) {
			
			int count=non.size()+zero.size();
			out.println(count);
			for(i=0;i<non.size();i++) 
				out.print(non.get(i)+" "+zero.get(i));
			for(i=non.size();i<zero.size()-1;i++)
				out.println(" "+zero.get(i)+" "+zero.get(i+1));
		}
		else
		{
			int count=zero.size()*2;
			out.println(count);
			for(i=0;i<zero.size();i++) 
				out.println(zero.get(i)+" "+non.get(i));
			
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
