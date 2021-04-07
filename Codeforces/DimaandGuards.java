import java.io.*;
import java.util.*;


public class DimaandGuards {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            boolean flag=false;
            StringBuilder ans=new StringBuilder();
            for (i = 1; i <=4 ; i++) {
                int a= sc.nextInt();
                int b= sc.nextInt();
                int x= sc.nextInt();
                int y= sc.nextInt();
                if (!flag && x<=n-a){
                    ans.append(i+" "+a+" "+(n-a));
                    flag=true;
                }if (!flag && y<=n-a){
                    ans.append(i+" "+a+" "+(n-a));
                    flag=true;
                }if (!flag && x<=n-b){
                    ans.append(i+" "+b+" "+(n-b));
                    flag=true;
                }if (!flag && y<=n-b){
                    ans.append(i+" "+b+" "+(n-b));
                    flag=true;
                }
            }
            if (!flag)
            out.println(-1);
            else
                out.println(ans);
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