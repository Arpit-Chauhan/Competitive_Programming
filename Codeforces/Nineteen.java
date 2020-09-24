<<<<<<< HEAD


import java.io.*; 
import java.util.*; 


public class Nineteen
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int numt=0,numn=0,i,numi=0,nume=0,flag=0;
		String s=sc.nextLine();

		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(p=='n')
				numn++;
			if(p=='i')
				numi++;
			if(p=='e')
				nume++;
			if(p=='t')
				numt++;
		}
		int div=Math.min(numi, numt);
		while(div>=0) {
			if(div==1) {
				if(numn>=div*3 && nume>=div*3 && numi>=div && numt>=div) {
					out.println(div);
					flag=1;
					break;
				}
			}
			else {
			if(numn>=(div*3-(div-1)) && nume>=div*3 && numi>=div && numt>=div) {
					out.println(div);
					flag=1;
					break;
				}
			}
			div--;
			}
		if(flag==0)
			out.println(0);
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
=======


import java.io.*; 
import java.util.*; 


public class Nineteen
{

	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int numt=0,numn=0,i,numi=0,nume=0,flag=0;
		String s=sc.nextLine();

		for(i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(p=='n')
				numn++;
			if(p=='i')
				numi++;
			if(p=='e')
				nume++;
			if(p=='t')
				numt++;
		}
		int div=Math.min(numi, numt);
		while(div>=0) {
			if(div==1) {
				if(numn>=div*3 && nume>=div*3 && numi>=div && numt>=div) {
					out.println(div);
					flag=1;
					break;
				}
			}
			else {
			if(numn>=(div*3-(div-1)) && nume>=div*3 && numi>=div && numt>=div) {
					out.println(div);
					flag=1;
					break;
				}
			}
			div--;
			}
		if(flag==0)
			out.println(0);
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
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
