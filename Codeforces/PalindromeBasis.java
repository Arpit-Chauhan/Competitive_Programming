import java.io.*;
import java.util.*;


public class PalindromeBasis {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;
         ArrayList<Integer> list=new ArrayList<>();
        for (i = 1; i <=40001 ; i++)
            if(ispal(Integer.toString(i)))
                list.add(i);

        int dp[][]=new int[40001][list.size()+1];
        for (i = 0; i <40001 ; i++)
            for (j = 0; j <= list.size(); j++)
                dp[i][j]=-1;


        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int mod=1000000007;
            int ans=fun(n, list.size()-1, dp,mod,list);
            out.println(ans);
        }
        out.close();
    }

    static int fun(int n, int m, int[][] dp,int mod,ArrayList<Integer> list){
        if(n < 0)
            return 0;
        if(m < 0) {
            if(n==0)
                return 1;
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        int ways1 = fun(n - list.get(m), m, dp,mod,list);
        int ways2 = fun(n, m - 1, dp,mod,list);
        dp[n][m] = (ways1 + ways2)%mod;
        return dp[n][m];
    }
    public static boolean ispal(String n){
        int len = n.length();
        for(int i = 0; i < len / 2; i++) {
            if (n.charAt(i) != n.charAt(len - i - 1))
                return false;
        }
        return true;
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