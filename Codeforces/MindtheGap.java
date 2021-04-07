import java.io.*;
import java.util.*;


public class MindtheGap {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc =1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int gap=sc.nextInt();
            int temp=n;
            int arr[] = new int[n];
            i=0;
            while (temp-->0){
                int x= sc.nextInt();
                int y= sc.nextInt();
                arr[i++]=x*60+y;
            }
            boolean flag=false;
            if (arr[0]>=gap+1)
                out.println("0 0");
            else{
                for (i = 1; i < n; i++) {
                    if (arr[i]-arr[i-1]>=2*gap+2){
                        out.println((arr[i-1]+gap+1)/60+" "+(arr[i-1]+gap+1)%60);
                        flag=true;
                        break;
                    }
                }
                if (!flag)
                    out.println((arr[n-1]+gap+1)/60+" "+(arr[n-1]+gap+1)%60);
            }

        }
        out.close();
    }


    /*
		FASTREADER
	*/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        /*DEFINED BY ME*/

        //READING ARRAY
        int[] readArray(int n) {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
            return arr;
        }

        //COLLECTIONS SORT
        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }

        //EUCLID'S GCD
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}