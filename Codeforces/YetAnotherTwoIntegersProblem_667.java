
import java.io.*; 
import java.util.*;

public class YetAnotherTwoIntegersProblem_667
{

	public static void main(String args[]) {
		
	FastReader sc= new FastReader();
	PrintWriter out = new PrintWriter(System.out);

	int t,n,i,j,a,b;
	String s;

	t=sc.nextInt();
	while(t-->0) {
		a=sc.nextInt();
		b=sc.nextInt();
		int count=0;
		int temp=10;
		if(a==b)
			out.println(0);
		
		if(a<b) {
			while(a!=b) {
				int diff=b-a;
				if(diff/temp>0) {
					int div=diff/temp;
					a+=div*temp;
					count+=div;
					if(a==b)
						break;
				}
				else {
					temp--;
				}
			}
			out.println(count);
		}
		if(a>b) {
			while(a!=b) {
				int diff=a-b;
				if(diff/temp>0) {
					int div=diff/temp;
					a-=div*temp;
					count+=div;
					if(a==b)
						break;
				}
				else {
					temp--;
				}
			}
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
