import java.io.*;
import java.util.*;


public class RequiredLength {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            long n = sc.nextLong();
            long x=sc.nextLong();
            Set<Long> vis=new HashSet<>();
            Queue<Pair> q=new LinkedList<>();
            q.add(new Pair(0,x));
            vis.add(x);
            boolean flag=false;
            while(!q.isEmpty()) {
                long curr = q.peek().y;
                long steps = q.peek().x;
                q.poll();
                if (chk(curr, n)) {
                    out.println(steps);
                    flag = true;
                    break;
                }
                if (!flag) {
                    ArrayList<Long> can = new ArrayList<>();
                    fun(can, curr);
                    for (long it : can) {
                        long nxt = it * curr;
                        if (ci(nxt, n) && !vis.contains(nxt)) {
                            q.add(new Pair(steps + 1, nxt));
                            vis.add(nxt);
                        }
                    }
                }
            }
            if (!flag)
                out.println(-1);

        }
        out.close();
    }
    static void fun(ArrayList<Long> a, long n) {
        Set<Long> st=new HashSet<>();
        while(n>0) {
            st.add(n%10);
            n /= 10;
        }
        for(long  x: st)
            a.add(x);
    }

    static boolean chk(long x, long n){
    long cnt = 0;
        while(x>0) {
            cnt++;
            x/=10;
        }
        return cnt==n;
    }

   static boolean ci(long x, long n) {
        long cnt = 0;
        while(x>0) {
            cnt++;
            x/=10;
        }
        return cnt<=n;
    }

/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair {
        long x, y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
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