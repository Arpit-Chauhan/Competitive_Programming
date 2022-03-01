import java.io.*;
import java.util.*;


public class PLPROCESS {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);

            long sum=0;
            for (i = 0; i < n; i++)
                sum+=arr[i];
            long temp =0;
            long ans =0;
            for(i=0;i<n;i++)
            {
                if(temp+arr[i]<=(sum)/2)
                    temp+=arr[i];

                else {
                    ans = Math.min(Math.max(temp, sum - temp), Math.max(temp + arr[i], sum - temp - arr[i]));
                    break;
                }
            }
            out.println(ans);
//            long pre[]=new long[n+1];
//            pre[1]=arr[0];
//            for (i = 2; i <=n; i++)
//                pre[i]+=pre[i-1]+arr[i-1];
//            long ans=Long.MAX_VALUE;
//            for (i = 1; i <=n; i++)
//                ans=Math.min(ans,Math.max(pre[i],pre[n]-pre[i]));
//            out.println(ans);
//            if(n%2==0)
//                out.println(Math.max(pre[n/2-1],pre[n-1]-pre[n/2-1]));
//            else {
//                if(n==1)
//                    out.println(pre[0]);
//                else
//                out.println(Math.max(pre[n / 2], pre[n - 1] - pre[n / 2]));
//            }
        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair implements Comparable<Pair> {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return this.x - o.x;
        }
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

        void swap(int arr[], int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}