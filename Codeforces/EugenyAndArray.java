<<<<<<< HEAD

import java.io.*;
import java.util.*;

 
public class EugenyAndArray
{
 
	public static void main(String args[])
	{
		
		FastReader sc= new FastReader();
		PrintWriter w= new PrintWriter(System.out);
 
		int t,n,i,m,j;
		String s;
 
		   n=sc.nextInt();
		   m=sc.nextInt();
	       int plus=0,minus=0;
	       int arr[]=new int[n];
	       for( i=0;i<n;i++){
	          arr[i]=sc.nextInt();
	          if(arr[i]==1)
	              plus++;
	          else
	              minus++;
	       }
	       
	       for(i=0;i<m;i++){
	           int a=sc.nextInt();
	           int b=sc.nextInt();
	           if((b-a)%2==0)
	               w.println(0);
	           else {
	               int e=(b-a)+1;
	               e/=2;
	               if(plus>=e && minus>=e)
	                   w.println(1);
	               else
	                   w.println(0);
	           }
	       }
		w.close();
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
    } 
=======

import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
public class EugenyAndArray
{
    // Complete the maximumSum function below.
    public static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        public int read() {
            if (numChars==-1)
                throw new InputMismatchException();
 
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }
 
                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();
 
            while(isSpaceChar(c))
                c = read();
 
            int sgn = 1;
 
            if (c == '-') {
                sgn = -1;
                c = read();
            }
 
            int res = 0;
            do {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
 
            return res * sgn;
        }
 
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
 
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
 
        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));
 
            return res.toString();
        }
 
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        public String next() {
            return readString();
        }
 
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
 
    static boolean prime(long a){
        if(a==2||a==3)
            return true;
        if((a-1)%6==0)
            return true;
        if((a+1)%6==0)
            return true;
        return false;
    }
    public static  long gcd(long a,long b){
        if(b==0)
            return a;
        long r=a%b;
        return gcd(b,r);
    }
 
    static long lcm(long a, long b)
    {
        return (a*b)/gcd(a, b);
    }
 
 
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
 
    class Node {
        public int val;
        public List<Node> children;
 
        public Node() {}
 
        public Node(int _val) {
            val = _val;
        }
 
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
 
 
 
    // private static final FastReader scanner = new FastReader();
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader scanner = new InputReader(inputStream);
        PrintWriter w = new PrintWriter(outputStream);
        
        int n=scanner.nextInt();
        int m=scanner.nextInt();
      int arr[]=new int[n];
        int plus=0,minus=0;
       
        for(int i=0;i<n;i++){
           arr[i]=scanner.nextInt();
          if(arr[i]==1)
              plus++;
          else
              minus++;
       }
       for(int i=0;i<m;i++){
           int a=scanner.nextInt();
           int b=scanner.nextInt();
           if((b-a)%2==0)
               w.println(0);
           else {
               int e=(b-a)+1;
               e/=2;
               if(plus>=e&&minus>=e)
                   w.println(1);
               else
                   w.println(0);
           }
       }
        w.close();
    }
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
}