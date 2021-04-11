import java.io.*;
import java.util.*;


public class CorruptedArray_713 {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n+2);
            sc.sort(arr);
            int pos=-1,sumpos=-1;

            long sum=0;
            for (i = 0; i < n+2; i++)
                sum+=arr[i];

            boolean flag=false;
            for (i = 0; i < n+2; i++) {
                if (i!=n+1 && (sum-arr[i]-arr[n+1])==arr[n+1]){
                    flag=true;
                    pos=i;
                    sumpos=n+1;
                    break;
                }else if (i==n+1 && (sum-arr[n+1]-arr[n])==arr[n]){
                    flag=true;
                    pos=i;
                    sumpos=n;
                    break;
                }

            }
            if (!flag)
                out.println(-1);
            else{
                for(i=0;i<n+2;i++){
                    if (i!=pos && i!=sumpos)
                        out.print(arr[i]+" ");
                }
                out.println();
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