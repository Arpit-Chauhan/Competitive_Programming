import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class BabyEhabPartitionsAgain {
    static PrintWriter out;

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        /* CREATED BY ME */
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static boolean isPrime(long n) {
        if (n == 2)
            return true;
        long i = 2;
        while (i * i <= n) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static long[] remove(long n) {
        long res[] = new long[1000000000];
        long rese = 0;
        int i = 0;
        while (n > 0) {
            long dig = n % 10;
            n = n / 10;
            if (dig > 0) {
                rese = dig;
                res[i++] = rese;
            }
        }
        return res;
    }

    static int ceil(int x, int y) {
        return (x % y == 0 ? x / y : (x / y + 1));
    }

    static long ceil(long x, long y) {
        return (x % y == 0 ? x / y : (x / y + 1));
    }

    static int max(int x, int y) {
        return Math.max(x, y);
    }

    static int min(int x, int y) {
        return Math.min(x, y);
    }

    static int abs(int x) {
        return Math.abs(x);
    }

    static long abs(long x) {
        return Math.abs(x);
    }

    static int log2(int N) {
        int result = (int) (Math.log(N) / Math.log(2));
        return result;
    }

    static long max(long x, long y) {
        return Math.max(x, y);
    }

    static long min(long x, long y) {
        return Math.min(x, y);
    }

    public static class pair {
        int x;
        int y;

        public pair(int a, int b) {
            x = a;
            y = b;
        }
    }

    public static class Comp implements Comparator<pair> {
        public int compare(pair a, pair b) {
            if (a.x != b.x) {
                return a.x - b.x;
            } else {
                return a.y - b.y;
            }
        }
    }

    /*
     * public static void extract(ArrayList<Integer> ar, int k, int d) { int c = 0;
     * for (int i = 1; i < k; i++) { int x = 0; boolean dm = false; while (x > 0) {
     * long dig = x % 10; x = x / 10; if (dig == d) { dm = true; break; } } if (dm)
     * ar.add(i); } }
     */

    public static void dfs(int index, boolean vis[], int a[], int b[], int n) {
        vis[index] = true;
        for (int i = 0; i < n; i++) {
            if (!vis[i] && (a[i] == a[index] || b[i] == b[index]))
                dfs(i, vis, a, b, n);
        }
    }

    // counts the set(1) bit of a number
    public static long countSetBitsUtil(long x) {
        if (x <= 0)
            return 0;
        return (x % 2 == 0 ? 0 : 1) + countSetBitsUtil(x / 2);
    }

    //tells whether a particular index has which bit of a number
    public static int getIthBitsUtil(int x, int y) {
        return (x & (1 << y)) != 0 ? 1 : 0;
    }

    public static void swap(long x, long y) {
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
    }

    public static double decimalPlaces(double sum) {
        DecimalFormat df = new DecimalFormat("#.00");
        String angleFormated = df.format(sum);
        double fin = Double.parseDouble(angleFormated);
        return fin;
    }

    //use collections.swap for swapping
    static boolean isSubSequence(String str1, String str2, int m, int n) {
        int j = 0;

        for (int i = 0; i < n && j < m; i++)
            if (str1.charAt(j) == str2.charAt(i))
                j++;

        return (j == m);
    }

    static long[] sum(int k, long n) {
        long a[] = new long[k];
        int c = 0;
        while (n > 0) {
            a[c++] = n % 10;
            n = n / 10;
        }
        return a;
    }

    static long pow(long base, long power) {
        if (power == 0) {
            return 1;
        }
        long result = pow(base, power / 2);
        if (power % 2 == 1) {
            return result * result * base;
        }
        return result * result;
    }

    public static void main(String[] args) throws Exception {

        FastReader sc = new FastReader();
        out = new PrintWriter(System.out);
        int t = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += arr[i];
            if (sum % 2 != 0)
                out.println(0);
            else {
                int temp = sum / 2;
                boolean flag=false;
                if(check(arr,temp,n)){
                    out.println(1);
                   while (!flag){
                       for(int i=0;i<n;i++)
                           if(arr[i]%2==1) {
                               out.println(i+1);
                               flag=true;
                               break;
                           }
                           else arr[i]/=2;
                   }
                }
                else
                    out.println(0);
            }
        }
        out.flush();
    }


    public static boolean check(int arr[], int sum, int n) {
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0)
                    dp[i][j] = false;
                if (j == 0)
                    dp[i][j] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][sum];
    }
}